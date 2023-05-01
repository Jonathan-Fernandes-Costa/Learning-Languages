package questao6;

import java.util.List;
import java.util.ArrayList;
public class Evento {
	private List<Ingresso> ingressos;
	private  double totalIngressos;
	private int ingressosNao;
	public Evento() {
		ingressos = new ArrayList<>();
	}
	public void addIngresso(Ingresso ingresso) {
		ingressos.add(ingresso);
		}
	public void compraIngresso(int id) {
		if(id >= 0 && id<ingressos.size()) {
			ingressos.get(id).vender();
			System.out.println("Ingresso Vendido," + ingressos.get(id).toString());
			totalIngressos = totalIngressos+ingressos.get(id).getValor();
		}
	}
	public void ingressosVendidos() {
		System.out.println("O total de ingressos vendidos é: "+totalIngressos);
	}
	public void verificaVendidos() {
		for (int i = 0; i < ingressos.size(); i++) {
			if(ingressos.get(i).isVendido()==false) {
				ingressosNao++;
			}
		}
		System.out.println("Total de ingressos não vendidos: "+ingressosNao);
	}
	
}
