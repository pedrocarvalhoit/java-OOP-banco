package br.com.bytebank.banco.testes;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";
		
		String outra = nome.replace("A", "a");
		
		String olura = outra.replace("a", "o");
		
		String minuscula = nome.toLowerCase();
		
		String mudandoSequenciaLetras = nome.replace("Alura", "OllloaAD");
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(olura);
		System.out.println(minuscula);
		System.out.println(mudandoSequenciaLetras);
		
		System.out.println(nome);
		
		char c = nome.charAt(4);
		System.out.println(c);
		
		int posUR = nome.indexOf("ur");
		System.out.println(posUR);
		
		//define a partir de qual posição começara o testo.
		String subString = nome.substring(1);
		System.out.println(subString);
		
		for(int i = 0; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
	}

}
