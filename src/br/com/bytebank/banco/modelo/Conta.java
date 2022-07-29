package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Pedro Carvalho
 *
 */
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public  Conta() {
	}
	
	/**
	 * construtor para iniciar a agencia e numero
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		this.saldo = 100;
//		System.out.println("Estou criando uma conta: " + this.numero);
	}

	public abstract void deposita(double valor);
	
	/**
	 * VaWlor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 */
	public void saque(double valor) {
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente: " + this.saldo);
		}
		this.saldo -= valor;
	}
	
	
	public void transferencia(double valor, Conta destino) {
		this.saque(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente cliente) {
		this.titular = cliente;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}
	
	@Override
	public boolean equals(Object ref) {
	
		Conta outra = (Conta)ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}if(this.numero != outra.numero) {
			return false;
		}return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
	        return Double.compare(this.saldo, outra.saldo);
	}

	
	@Override
	public String toString() {
		return "Numero: " + this.numero + " Agencia: " + this.agencia;
	}
		
		
		
		
}
