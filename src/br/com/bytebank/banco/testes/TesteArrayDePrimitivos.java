package br.com.bytebank.banco.testes;

public class TesteArrayDePrimitivos {
	
	public static void main(String[] args) {
		
		int idade[] = {5, 6, 9, 5, 6};
		System.out.println(idade[0]);
		
		int[] idade2 = new int[5];
		idade2[0] = 20;
		idade2[1] = 25;
		idade2[2] = 30;
		idade2[3] = 35;
		idade2[4] = 40;
		
		for(int i = 0; i < idade.length ; i++) {
			System.out.println(idade[i]);
		}
		
		
	}

}
