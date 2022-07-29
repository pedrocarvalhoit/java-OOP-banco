package br.com.bytebank.banco.modelo;

public class ValorSaque {

	public static void main(String[] args) {


		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(500.0);
		
		try {
		conta.saque(400);
		} catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
		
		
		
	}

}
