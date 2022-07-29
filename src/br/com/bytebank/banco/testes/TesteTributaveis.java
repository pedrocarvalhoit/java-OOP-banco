package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {

	ContaCorrente cc = newContaCorrente (222, 333);
		cc.deposita(100);
		
		SeguroDeVida seguro = SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
		

	}

	private static SeguroDeVida SeguroDeVida() {
		// TODO Auto-generated method stub
		return null;
	}

	private static ContaCorrente newContaCorrente(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
