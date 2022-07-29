package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29);//autoboxing
		System.out.println(idadeRef.intValue());//unboxing
		
		Double doubleRef = Double.valueOf(123.9);//autoboxing
		System.out.println(doubleRef.doubleValue());//unboxing

		
		List<Number> lista = new ArrayList<>();
		lista.add(65);
		lista.add(1212321.4f);
		
		System.out.println(lista);
		System.out.println(lista.get(1));
		
	}

}
