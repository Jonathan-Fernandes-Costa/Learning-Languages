package controller;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import apresentação.JanelaPrincipal;
import apresentação.Xadrez;
import model.EscreverDados;
import model.LerDados;


public class GerenciaJogo {
	private ArrayList<DadosdoJogador> Jogadores;
	private EscreverDados Escrever;
	private LerDados Ler;
	private ArrayDeCasas casas = new ArrayDeCasas();
	private ArrayList<Peças> pecas = new ArrayList<Peças>();
	private Random random;
	private JanelaPrincipal janela;
	private Peças peçaEscolhida;
	private int casaEscolhida;
	//importando imagens
	private ImageIcon IconeCavalo = new ImageIcon("src/img/cavalo.png");
	private ImageIcon IconeAndador = new ImageIcon("src/img/andador.png");
	private ImageIcon IconeRei = new ImageIcon("src/img/rei.png");
	
	public GerenciaJogo(JanelaPrincipal janela) {
		Jogadores = new ArrayList<DadosdoJogador>();
		Escrever = new EscreverDados();
		Ler = new LerDados();
		Ler.lerDados("banco/Relatorios.txt");
		Jogadores = Ler.getLista();
		pecas.add(new Peças("Andador", IconeAndador));
		pecas.add(new Peças("Cavalo", IconeCavalo));
		pecas.add(new Peças("Rei", IconeRei));
		random = new Random();
		geraAlunosEBugs();
		
	}
	
	public void geraAlunosEBugs() {
		for (int i = 0; i < 20; i++) {
			if(casas.listaCasas.get(random.nextInt(64)).getAluno() == null && casas.listaCasas.get(random.nextInt(64)).getBug() == null) {
				casas.listaCasas.get(random.nextInt(64)).setAluno(new Aluno());
			}else {
				i = i-1;
			}
		}
		for (int i = 0; i < 14; i++) {
			if(casas.listaCasas.get(random.nextInt(64)).getAluno() == null && casas.listaCasas.get(random.nextInt(64)).getBug() == null) {
				casas.listaCasas.get(random.nextInt(64)).setBug(new Bug());
			}else {
				i = i-1;
			}
		}
	}
	public void NovoJogador(String nome) {
		Jogadores.add(new DadosdoJogador(nome));
	}
	public int getQuantJogadores() {
		return Jogadores.size();
	}

	public Peças getRobo(int id) {
		return pecas.get(id);
	}
	public void setCasaEscolhida(int posicao) {
		casaEscolhida = posicao;
	}
	public int ultimoJogador() {
		return Jogadores.size()-1;
	}
	public void escreverDados() {
		Escrever.escreverDados(formatarDados());
	}
	public String formatarDados() {
		
		String Saida = "";
		
		for (int i = 0; i < Jogadores.size(); i++) {
			Saida += Jogadores.get(i).formataDados();
		}
		
		return Saida;
	}
	public boolean verificaColisao() {
		for (int i = 0; i < pecas.size(); i++) {
			if(pecas.get(i).getPosicao() == -1) {
				return false;
			}
		}
		for (int i = 0; i < pecas.size(); i++) {
			if(casas.getCasa(pecas.get(i).getPosicao()).getAluno() != null) {
				pecas.get(i).achouAluno();
				Jogadores.get(ultimoJogador()).achouAluno();
				AdicionaPontosJogador(i);
			}else if(casas.getCasa(pecas.get(i).getPosicao()).getBug() != null) {
				pecas.get(i).achouBug();
				Jogadores.get(ultimoJogador()).achouBug();
				RemovePontosJogador(i);
			} else {
				Jogadores.get(ultimoJogador()).naoAchouNada();
			}
		}
		Jogadores.get(ultimoJogador()).atualizaPontuacao();;
		Jogadores.get(ultimoJogador()).acresentaRodadas();;
		return true;
	}
	public void proximaRodada() {
		for (int i = 0; i < pecas.size(); i++) {
			pecas.get(i).setPosicao(-1);
		}
	}
	public void setRobos(ArrayList<Peças> peças) {
		this.pecas = peças;
	}
	public void setRoboEscolhido(Peças peça) {
		peçaEscolhida =peça;
	}
	
	public boolean verificaMovimento() {
		if(peçaEscolhida!= null) {
			if(peçaEscolhida.getPosicao()!= -1) {
				return false;
			}else {
				peçaEscolhida.setPosicao(casaEscolhida);
				casas.getCasa(casaEscolhida).setFoiVisitada(true);
				return true;
			}
		}else {
			return false;
		}
		
	}
	
	public Icon pegaIcon() {
		return peçaEscolhida.getIcon();
	}
	public DadosdoJogador getJogador() {
		return Jogadores.get(ultimoJogador());
	}
	public Peças getRoboEscolhido() {
		return peçaEscolhida;
	}
	
	public ArrayDeCasas getCasas() {
		return casas;
	}
	public void AdicionaPontosJogador(int id) {
		if(id == 0) {
			Jogadores.get(ultimoJogador()).AdicionaPontosAndador();
		}else if(id == 1) {
			Jogadores.get(ultimoJogador()).AdicionaPontosCavalo();
		}else {
			Jogadores.get(ultimoJogador()).AdicionaPontosRei();
		}
	}
	public void RemovePontosJogador(int id) {
		if(id == 0) {
			Jogadores.get(ultimoJogador()).RemovePontosAndador();
		}else if(id == 1) {
			Jogadores.get(ultimoJogador()).RemovePontosCavalo();
		}else {
			Jogadores.get(ultimoJogador()).RemovePontosRei();
		}
	}


	public ImageIcon getIconeCavalo() {
		return IconeCavalo;
	}



	public void setIconeCavalo(ImageIcon iconeCavalo) {
		IconeCavalo = iconeCavalo;
	}



	public ImageIcon getIconeAndador() {
		return IconeAndador;
	}
	public int getPontosTotal(int indice) {
		return Jogadores.get(indice).getPontuacao();
	}
	
	public String getNome(int indice) {
		return Jogadores.get(indice).getNome();
	}
	
	public int getAlunos(int indice) {
		return Jogadores.get(indice).getAlunosRegatados();
	}
	
	public int getBugs(int indice) {
		return Jogadores.get(indice).getBugsEncontrados();
	}
	
	public int getPontosAndador(int indice) {
		return Jogadores.get(indice).getPontuacaoAndador();
	}
	
	public int getPontosCavalo(int indice) {
		return Jogadores.get(indice).getPontuacaoCavalo();
	}
	
	public int getPontosRei(int indice) {
		return Jogadores.get(indice).getPontuacaoRei();
	}
	public int getRodadas(int indice) {
		return Jogadores.get(indice).getRodadas();
	}
	
	public int getCasasVazias(int indice) {
		return Jogadores.get(indice).getCelulasVazias();
	}

	public void setIconeAndador(ImageIcon iconeAndador) {
		IconeAndador = iconeAndador;
	}



	public ImageIcon getIconeRei() {
		return IconeRei;
	}



	public void setIconeRei(ImageIcon iconeRei) {
		IconeRei = iconeRei;
	}



	public void setCasas(ArrayDeCasas casas) {
		this.casas = casas;
	}



	public ImageIcon editaImagem(ImageIcon icon) {
		Image imagem = icon.getImage();
		ImageIcon novaImage = new ImageIcon(imagem.getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		return novaImage;
	}
}
