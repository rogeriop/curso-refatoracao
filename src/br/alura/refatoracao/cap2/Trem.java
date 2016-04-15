package br.alura.refatoracao.cap2;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;
	
	public boolean temVaga(int reservas) {
		
		int reservado = lugaresReservados();
		
		int disponivel = capacidade - reservado;
		return disponivel > reservas; 
	}

	private int lugaresReservados() {
		int reservado = 0;
		for(Vagao vagao : vagoes) {
			reservado += vagao.reservados();
		}
		return reservado;
	}
	
}