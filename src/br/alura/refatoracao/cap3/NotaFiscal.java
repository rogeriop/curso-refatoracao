package br.alura.refatoracao.cap3;

public class NotaFiscal {

	private int id;
	private double valorBruto;
	private double impostos;
	
	public NotaFiscal(int id, double valorBruto) {
		this.id = id;
		this.valorBruto = valorBruto;
		this.impostos = calculaImposto();
	}

	public NotaFiscal(double valorBruto) {
		this(0, valorBruto);
	}

	public double getImpostos() {
		return impostos;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getValorLiquido() {
		return this.valorBruto - this.impostos;
	}
	
	public double calculaImposto () {
		double imposto = 0;
		if(this.valorBruto < 200) {
			imposto = this.valorBruto * 0.03;
		}
		else if(this.valorBruto > 200 && this.valorBruto <= 1000) {
			imposto = this.valorBruto * 0.06;
		}
		else {
			imposto = this.valorBruto * 0.07;
		}
		
		return imposto;

	}

}