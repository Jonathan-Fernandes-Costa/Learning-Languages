let loopDuration = 100;
function setup() {
  createCanvas(600, 400);
  trilha.loop();
}

function draw() {
  background(imagemDeFundo);
  mostraPersonagem();
  mostraCarro();
  movimentaCarro();
  movimentaPersonagem();
  loopCarro();
  verificaColisao();
  placar();
  marcaPonto();
}



