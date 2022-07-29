package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {

		ContaEspecial ce = new ContaEspecial(123, 1241);
		ce.getSaldo();
		
		Conta cc2 = new ContaCorrente(333, 333);
		
		ContaCorrente cc1 = new ContaCorrente(111, 111);
		cc1.deposita(100.0);
			
		
		ContaPoupanca cp1 = new ContaPoupanca(222, 222);
		cp1.deposita(200.0);
		
		cc1.transferencia(10.0, cp1);
		
		System.out.println("CC: " + cc1.getSaldo());
		System.out.println("CP: " + cp1.getSaldo());
		
		
	}

}
