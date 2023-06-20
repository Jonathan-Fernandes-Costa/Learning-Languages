import crypto, { randomUUID } from 'node:crypto';
import { knex } from "../database"
import { FastifyInstance } from 'fastify';
import { z } from 'zod';
import { checkSessionIdExists } from '../middlewares/check-session-id-exist';

// Cookies manter contexto entre as requisições

export async function transactionRoutes(app: FastifyInstance){
    // app.addHook('preHandler')// plugin global
    // read
    // preHandler: executa antes da função
    app.get('/', {preHandler: [checkSessionIdExists]},async (request, response)=>{
        
        const sessionId = request.cookies.session_id
        if(!sessionId){
            return response.status(401).send({
                error:'Unauthorized'
            })
        }


        const transactions = await knex('transactions').where('session_id', sessionId).select()
        return {
            transactions
        }
    })
    app.get('/:id', {preHandler: [checkSessionIdExists]}, async (request)=>{
        const sessionId = request.cookies.session_id
        const getTransactionsParamsSchema = z.object({
            id: z.string().uuid()
        })
        const { id } = getTransactionsParamsSchema.parse(request.params)

        const transaction = await knex('transactions').where({session_id:sessionId, id}).first()
        return{
            transaction
        }
    })
    app.get('/summary', {preHandler: [checkSessionIdExists]}, async(request)=>{
        const sessionId = request.cookies.session_id
        const summary = await knex('transactions').where('session_id', sessionId).sum('amount', { as: 'amount'}).first()// soma todos os valores da coluna ammount
        return {summary}
    })
    // create
    app.post('/', async (request, response) =>{
        const createTransactionsBodySchema = z.object({
            title: z.string(),
            amount: z.number(),
            type: z.enum(['credit', 'debit'])
        })
        const {title, amount, type} = createTransactionsBodySchema.parse(request.body)

        let sessionId = request.cookies.session_id

        if(!sessionId){
            sessionId = randomUUID();
            response.cookie('session_id', sessionId, {
                path: '/',
                maxAge: 1000 * 60 * 60 * 24 * 7 // 7 days
            })
        }
        await knex('transactions').insert({
            id: crypto.randomUUID(),
            title,
            amount: type === 'credit'? amount : amount * -1,
            session_id: sessionId
        })
        return response.status(201).send("Transação Realizada")
    })









   /* app.get('/', async () => {
        const transaction = await knex('transactions').insert({
          id: crypto.randomUUID(),
          title:'Transação de teste', 
          amount: 1000,
        }).returning('*')
      
        return transaction
      })

      app.get('/teste', async () => {
        const transaction = await knex('transactions').select('*')
      
        return transaction
      })
      */
}