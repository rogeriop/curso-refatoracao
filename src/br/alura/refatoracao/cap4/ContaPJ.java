package br.alura.refatoracao.cap4;

public class ContaPJ extends ContaBancaria {

	
	public ContaPJ(String titular, double saldo) {
		super(titular, saldo);
	}

	public void saca(double valor) {
		super.saca(valor + 0.2);
	}
	
	public void deposita(double valor) {
		super.deposita(valor - 0.2);
	}
	

}
