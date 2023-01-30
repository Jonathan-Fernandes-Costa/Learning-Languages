import User from "./User.js";
import {Admin, Professor} from "./Admin&Professor.js"

const newUser = new User("Usuario", "usuario@", "03/03/2004")
const newProfessor = new Professor("Rodrigo", "rodrigo@gmail.com", "02/02/2001")
const newAdmin = new Admin("Admin", "admin.com", "06/06/2006")
console.log("Usuario: ", newUser.exibirInfos())
console.log("Professor: ", newProfessor.exibirInfos())
console.log("Admin: ", newAdmin.exibirInfos())