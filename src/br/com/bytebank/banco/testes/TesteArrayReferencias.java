package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5]; 
		ContaCorrente cc1 = new ContaCorrente(123, 321);
		
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(222, 222);
		contas[1] = cc2;
		
		ContaCorrente cc3 = new ContaCorrente(333, 333);
		contas[2] = cc3;
		
		System.out.println(contas[2].getNumero());
		
		Conta[] contaMista = new Conta[3];
		Conta cp1 = new ContaPoupanca(111, 222);
		contaMista[0] = cp1;
		System.out.println(contaMista[0].getNumero());
		contaMista[0].deposita(650.0);
		System.out.println(cp1.getSaldo());
		
	
		
	}

}
