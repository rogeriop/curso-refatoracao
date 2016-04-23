package br.alura.refatoracao.cap6;

public enum Moeda {
	DOLAR(3.7),
	EURO(5.8);
	
	private double taxa;
	
	Moeda(double taxa) {
		this.taxa = taxa;
	}
	
	public double getTaxa() {
		return this.taxa;
	}
	
}
