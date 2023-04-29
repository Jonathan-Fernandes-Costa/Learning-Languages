package questao4;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	
	
	public void comprarProduto(int quantidade) {
		this.quantidade = this.quantidade-quantidade;
		System.out.println("Produto: "+ nome);
		double total = preco*quantidade;
		if(total>100&&total<200) {
			total = total - total*0.1;
		}else if(total>200&&total<500) {
			total = total - total*0.2;
		}else if(total>500) {
			total = total - total*0.25;
		}
		
		System.out.println("Valor total a ser pago: "+ total);
	}
}
