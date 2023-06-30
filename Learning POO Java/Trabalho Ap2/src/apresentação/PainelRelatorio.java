package apresentação;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.GerenciaJogo;

public class PainelRelatorio extends JPanel {
	private GerenciaJogo jogo;
	private JButton sair;

	public PainelRelatorio(JanelaPrincipal janela, GerenciaJogo jogo) {
		this.jogo = jogo;
		sair = new JButton("Encerrar jogo");
		sair.setBackground(Color.red);
		sair.setPreferredSize(new Dimension(280, 50));
		sair.addActionListener(e -> janela.dispose());

		String rodadasJogadas = "";
		String casasVazias = "";
		String pontuacao = "";
		String alunosEncontrados = "";
		String bugsEncontrados = "";
		String pAndador = "";
		String pCavalo = "";
		String pRei = "";
		String Dados[][] = new String[jogo.getQuantJogadores()][9];

		for (int i = 0; i < Dados.length; i++) {
			rodadasJogadas = "" + jogo.getRodadas(i);
			casasVazias = "" + jogo.getCasasVazias(i);
			pontuacao = "" + jogo.getPontosTotal(i);
			alunosEncontrados = "" + jogo.getAlunos(i);
			bugsEncontrados = "" + jogo.getBugs(i);
			pAndador = "" + jogo.getPontosAndador(i);
			pCavalo = "" + jogo.getPontosCavalo(i);
			pRei = "" + jogo.getPontosRei(i);
			Dados[i][0] = jogo.getNome(i);
			Dados[i][1] = rodadasJogadas;
			Dados[i][2] = casasVazias;
			Dados[i][3] = pontuacao;
			Dados[i][4] = alunosEncontrados;
			Dados[i][5] = bugsEncontrados;
			Dados[i][6] = pAndador;
			Dados[i][7] = pCavalo;
			Dados[i][8] = pRei;

		}
		String[] Colunas = { "Jogador", "Rodadas", "Casas Vazias", "Pontuação", "Alunos", "Bugs", "Andador", "Cavalo",
				"Rei" };
		DefaultTableModel Modelo = new DefaultTableModel(Dados, Colunas);

		JTable Tabela = new JTable(Modelo);

		Tabela.setCellSelectionEnabled(false);
		Tabela.getColumnModel().getColumn(0).setPreferredWidth(150);
		Tabela.getColumnModel().getColumn(2).setPreferredWidth(150);
		Tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
		Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		Tabela.setRowHeight(30);

		JScrollPane PainelRolagem = new JScrollPane(Tabela);
		PainelRolagem.setPreferredSize(new Dimension(650, 400));

		this.add(PainelRolagem);
		this.add(sair);
		this.setVisible(true);
	}
}
