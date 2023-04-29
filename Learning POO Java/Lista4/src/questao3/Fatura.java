package questao3;

public class Fatura {
	private int numItem;
	private String descItem;
	private int quantiItem;
	private double precoItem;
	private double totalFatura;
	
	public Fatura(int numItem, String descItem, int quantiItem, double precoItem, double totalFatura) {
		this.numItem = numItem;
		this.descItem = descItem;
		if(quantiItem<0) {
			this.quantiItem = 0;
		}else {
			this.quantiItem = quantiItem;
		}
		if(precoItem<0) {
			this.precoItem = 0;
		}else {
			this.precoItem = precoItem;
		}
		
		this.totalFatura = totalFatura;
	}
	public int getNumItem() {
		return numItem;
	}
	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}
	public String getDescItem() {
		return descItem;
	}
	public void setDescItem(String descItem) {
		this.descItem = descItem;
	}
	public int getQuantiItem() {
		return quantiItem;
	}
	public void setQuantiItem(int quantiItem) {
		this.quantiItem = quantiItem;
	}
	public double getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	public double getTotalFatura() {
		return totalFatura;
	}
	public void setTotalFatura(double totalFatura) {
		this.totalFatura = totalFatura;
	}
	
	public double getValorFatura() {
		return(this.quantiItem*this.precoItem);
	}
	public void desconto(double desconto) {
		this.precoItem = this.precoItem - this.precoItem*desconto;
	}
}
