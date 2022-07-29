package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		Object cc = new ContaCorrente(123, 321);
		System.out.println(cc.toString());
		
		//nao preciso digitar to string
		ContaPoupanca cp = new ContaPoupanca(5555, 6666);
		System.out.println(cp);

	}

}
