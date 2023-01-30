let xPersonagem = 100;
let yPersonagem = 360;
let hit = false;
let meusPontos = 0;
function mostraPersonagem(){
  image(imagemPersonagem, xPersonagem, yPersonagem, 40, 40);
}
function movimentaPersonagem(){
  if(keyIsDown(UP_ARROW)){
    yPersonagem -= 3;
  }
  if(keyIsDown(DOWN_ARROW)){
    if(yPersonagem < 360){
      yPersonagem += 3;
    }    
  }
  if(keyIsDown(37)){
    xPersonagem -= 3;
  }
  if(keyIsDown(39)){
    xPersonagem += 3;
  }
}
function verificaColisao(){
  //hit = collideRectCircle(200, 200, 100, 150, mouseX, mouseY, 100);
  for(let i = 0; i < imagemCarros.length; i++){
    hit = collideRectRect(xCarros[i], yCarros[i], comprimentoCarro, alturaCarro, xPersonagem, yPersonagem, 20, 20);
  if(hit){
    batida.play();
    yPersonagem = 350;
    if(meusPontos > 0){
      meusPontos--;
    }
    
  }
  }
}
function marcaPonto(){
  if(yPersonagem < 20){
    meusPontos++;
    ponto.play();
    yPersonagem = 350;
  }
}
function placar(){
  textAlign(CENTER);
  textSize(25);
  fill(color(255, 240, 6));
  stroke(color(255,240,6))
  text(meusPontos, 70, 30);
}