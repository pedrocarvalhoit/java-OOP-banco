package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 33);
		lista.add(cc2);
		
		System.out.println(lista.size());
		Conta ref = lista.get(0);
		
		lista.remove(1);
		
		System.out.println(lista.size());
		System.out.println(ref.getNumero());
		
		Conta cc3 = new ContaCorrente(22, 444);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(22, 555);
		lista.add(cc4);
		
		for(int i=0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-----------");
		
		for(Conta conta: lista) {
			if(conta == cc3) {
				System.out.println("Conta já existe.");
			}
		} 
		
		for(Conta conta: lista) {
			System.out.println(conta);
		} 
			
	

	}

}
