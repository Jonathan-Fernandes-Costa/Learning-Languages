import crypto from 'node:crypto';
import { knex } from "../database"
import { FastifyInstance } from 'fastify';
import { z } from 'zod';

export async function transactionRoutes(app: FastifyInstance){
    app.post('/', async (request, response) =>{
        const createTransactionsBodySchema = z.object({
            title: z.string(),
            amount: z.number(),
            type: z.enum(['credit', 'debit'])
        })
        const {title, amount, type} = createTransactionsBodySchema.parse(request.body)
        await knex('transactions').insert({
            id: crypto.randomUUID(),
            title,
            amount: type === 'credit'? amount : amount * -1,
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