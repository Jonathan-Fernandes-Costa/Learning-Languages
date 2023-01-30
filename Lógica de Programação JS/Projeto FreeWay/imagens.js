//Imagens
let imagemDeFundo;
let imagemPersonagem;
let imagemCarroReal;
let imagemCarroReal2;
let imagemCarroReal3;
let imagemCarros;
//Sons
let trilha;
let batida;
let ponto;

function preload(){
  trilha = loadSound("sons/trilha.mp3");
  batida = loadSound("sons/colidiu.mp3");
  ponto = loadSound("sons/pontos.wav");
  imagemDeFundo = loadImage("imagens/estrada2.jpg");
  imagemPersonagem = loadImage("imagens/teorema.png");
  imagemCarroReal = loadImage("imagens/carro-real.png");
  imagemCarroReal2 = loadImage("imagens/carro-real2.png");
  imagemCarroReal3 = loadImage("imagens/carro-real3.png");
  imagemCarros = [imagemCarroReal, imagemCarroReal2, imagemCarroReal3, imagemCarroReal, imagemCarroReal2, imagemCarroReal3];
}