package questao17;



public class JogoDaVelha {
	private String [][] grade;
	private boolean resultado;
	public JogoDaVelha() {
		this.grade = new  String [3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grade[i][j] = "   ";
			}
		}
	}
	public boolean jogada(int idjogador, int x, int y) {
			if(idjogador ==1 && grade[x][y]=="   ") {
				grade[x][y]= " X ";
				return false;
			}else if(idjogador ==2 && grade[x][y]=="   ") {
				grade[x][y] = " O ";	
				return false;
			}else {
				System.out.println("Lugar inválido");
				return true;
			}

	
	}
	public int verificaVitoria() {
		for (int i = 0; i < 3; i++) {
				if(grade[i][0].equals(grade[i][1])&&grade[i][0].equals(grade[i][2])&&grade[i][0]!="   ") {
					return 1;
				}
				if(grade[0][i].equals(grade[1][i]) && grade[0][i].equals(grade[2][i])&&grade[0][i]!="   ") {
					return 1;
				}
		}
		if(grade[0][0].equals(grade[1][1]) && grade[0][0].equals(grade[2][2])&&grade[0][0]!="   ") {
			return 1;
		}
		if(grade[0][2].equals(grade[1][1]) && grade[0][2].equals(grade[2][0])&&grade[0][2]!="   ") {
			return 1;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3; j++) {
				if(grade[i][j]=="   ") {
					return 2;
				}
			}
		}
		return 3;
	}
	public void printGrade() {
		for (int i = 0; i < 3; i++) {
			System.out.print(" | ");
			for (int j = 0; j < 3; j++) {
				System.out.print(grade[i][j]);
				System.out.print(" | ");
			}
			System.out.println("  ");
			if(i<2)
			System.out.println(" -------------------");
		}
	}
}
	

