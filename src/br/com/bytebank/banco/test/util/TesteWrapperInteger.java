package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Utilities;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		int [] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();
		
		String teste = "1242";
		
		int testeConvertido = Integer.parseInt(teste);
		System.out.println(teste);
		
		
		Integer numero = Integer.valueOf(teste);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);
		
		
	}

}
