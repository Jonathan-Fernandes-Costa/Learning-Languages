let xCarros = [600, 600, 600, 600, 600, 600];
let yCarros = [10, 65, 125, 245, 305, 360];
let velocidadeCarros = [2, 2.5, 3.2, 4.2, 3, 1];
let comprimentoCarro = 50;
let alturaCarro = 40;
function mostraCarro(){
  for(let i = 0; i < imagemCarros.length; i++){
    image(imagemCarros[i], xCarros[i], yCarros[i], comprimentoCarro, alturaCarro);
  }
}
function movimentaCarro(){
  for(let i = 0; i < xCarros.length; i++){
    xCarros[i] -= velocidadeCarros[i];
  }
}
function loopCarro(){
  for(let i = 0; i < xCarros.length; i++){
    if (xCarros[i] < -50){
    xCarros[i] = 600;
    }
  }
}