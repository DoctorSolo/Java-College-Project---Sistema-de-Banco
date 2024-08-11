package br.uemg.entidades;

public class ContaBancaria {
	private String clientes;
	private int    num_conta;
	protected float saldo;
	
	
	// Constutores
	public ContaBancaria(String clientes, int num_conta, float saldo) {
		this.clientes  = clientes;
		this.num_conta = num_conta;
		this.saldo     = saldo;
	}


	public ContaBancaria(String clientes, int num_conta) {
		this.clientes  = clientes;
		this.num_conta = num_conta;
		this.saldo     = 0;
	}
	
	
	// Metodo sacar e depositar
	public void sacar(float saque) {
		if (saque <= saldo) saldo -= saque;	// saque não pode ser maior que o saldo!!
		else System.out.println("O saldo não pode ser sacado");
	}
	
	
	public void depositar(float deposito) { // Deposito sem limites
		saldo += deposito;
	}
	
	
	// Getters and Setters
	public String getClientes() {
		return clientes;
	}


	public int getNum_conta() {
		return num_conta;
	}


	public float getSaldo() {
		return saldo;
	}


	@Override
	public String toString() {
		return "ContaBancaria [clientes= " + clientes + ", num_conta= " + num_conta + ", saldo= " + saldo + "]";
	}
	
	
}
