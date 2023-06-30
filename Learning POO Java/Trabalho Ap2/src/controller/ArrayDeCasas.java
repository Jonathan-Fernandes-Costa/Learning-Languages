package controller;

import java.util.ArrayList;


public class ArrayDeCasas {
public ArrayList<Casa> listaCasas;
	
	public ArrayDeCasas() {
		listaCasas = new ArrayList<Casa>();
		int contador =0;
		for(int i = 0; i<8; i++) {
			for(int j = 0; j<8;j++ ) {
				Casa casa = new Casa(contador);
				listaCasas.add(casa);
				contador++;
			}
		}
	}
	public Casa getCasa(int id) {
		return listaCasas.get(id);
	}
}
