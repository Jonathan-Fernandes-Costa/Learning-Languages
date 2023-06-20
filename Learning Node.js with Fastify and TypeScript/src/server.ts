import { app } from './app'
import { env } from './env'
app
  .listen({
    port: env.PORT,
  })
  .then(() => {
    console.log('Server rodando na porta 3333')
  })
