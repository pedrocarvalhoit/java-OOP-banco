package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteComparatorNumero {
	
	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(12, 33);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(32, 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(42, 22);
		cc4.deposita(222.0);
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println("----- ORDENADO CONTA-----");
		
		lista.sort(new NumeroDaContaComparator());
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println(" ---- ORDENADO AGENCIA");
		
		NumeroDaAgenciaComparator comparatorA = new NumeroDaAgenciaComparator();
		lista.sort(comparatorA);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}

class NumeroDaContaComparator implements Comparator<Conta>{
	
@Override
public int compare(Conta c1, Conta c2) {
	return Integer.compare(c1.getNumero(), c2.getNumero());
	}
}

class NumeroDaAgenciaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getAgencia(), c2.getAgencia());
	}
}