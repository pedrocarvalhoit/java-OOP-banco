package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.testes.Tributavel;

public class CalculadoraDeImposto {

	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
