import { FastifyRequest } from "fastify"
import { FastifyReply } from "fastify/types/reply"
export async function checkSessionIdExists(request: FastifyRequest, response: FastifyReply){
    const sessionId = request.cookies.session_id

    if(!sessionId){
        return response.status(401).send({
            error:'Unauthorized'
        })
    }
    
}