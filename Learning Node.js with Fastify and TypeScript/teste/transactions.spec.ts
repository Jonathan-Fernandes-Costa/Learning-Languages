import { test, beforeAll, afterAll, describe, expect, beforeEach} from 'vitest'
import supertest from 'supertest'
import { app } from '../src/app'
import { execSync } from 'child_process'
describe('Transactions routes', ()=>{// categorizando
    beforeAll(async()=>{
        await app.ready()
    })
    afterAll( async() => {
        await app.close()
    })
    test('teste do usuario criar transação', async ()=>{    
            await supertest(app.server)
            .post('/transactions').send({
                title: 'Teste usando Super teste',
                amount: 2000,
                type: 'credit',
            })
            .expect(201)
        
    })
    beforeEach(()=>{
        execSync('npm run knex migrate:rollback --all')
        execSync('npm run knex migrate:latest')
    })

    test('teste do usuario listar todas as transações', async()=>{
        const createTrasnsactionResponse =  await supertest(app.server)
            .post('/transactions').send({
                title: 'Teste usando Super teste',
                amount: 2000,
                type: 'credit',
            })
        const cookies = createTrasnsactionResponse.get('Set-Cookie')

        const listTransactionsResponse = await supertest(app.server)
            .get('/transactions')
            .set('Cookie', cookies)
            .expect(200)

        expect(listTransactionsResponse.body.transactions).toEqual([
            expect.objectContaining({
                title: 'Teste usando Super teste',
                amount: 2000,
            }),
        ])
    })
    test('teste do usuario listar uma transações especifica', async()=>{
        const createTrasnsactionResponse =  await supertest(app.server)
            .post('/transactions').send({
                title: 'Teste usando Super teste',
                amount: 2000,
                type: 'credit',
            })
        const cookies = createTrasnsactionResponse.get('Set-Cookie')

        const listTransactionsResponse = await supertest(app.server)
            .get('/transactions')
            .set('Cookie', cookies)
            .expect(200)
        const transactionId = listTransactionsResponse.body.transactions[0].id
        const getTransactionResponse = await supertest(app.server)
            .get(`/transactions/${transactionId}`)
            .set('Cookie', cookies)
            .expect(200)

        expect(getTransactionResponse.body.transaction).toEqual(
            expect.objectContaining({
                title: 'Teste usando Super teste',
                amount: 2000,
            }),
        )
    })
    test('teste do usuario listar o sumario', async()=>{
        const createTrasnsactionResponse =  await supertest(app.server)
            .post('/transactions').send({
                title: 'Creditando usando Super teste',
                amount: 5000,
                type: 'credit',
            })
        const cookies = createTrasnsactionResponse.get('Set-Cookie')
        await supertest(app.server)
            .post('/transactions').set('Cookie', cookies).send({
                title: 'Debitando usando Super teste',
                amount: 2000,
                type: 'debit',
            })

        const summaryResponse = await supertest(app.server)
            .get('/transactions/summary')
            .set('Cookie', cookies)
            .expect(200)

        expect(summaryResponse.body.summary).toEqual({
             amount:3000
            })
    })

})