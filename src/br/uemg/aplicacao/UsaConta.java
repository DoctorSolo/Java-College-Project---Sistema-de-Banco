package br.uemg.aplicacao;
import br.uemg.entidades.ContaBancaria;
import br.uemg.entidades.ContaEspecial;
import br.uemg.entidades.ContaPoupanca;

public class UsaConta {

	public static void main(String[] args) {
		ContaPoupanca cliente0 = new ContaPoupanca("Y-198394-9", 18091, 50000.00f);	// Criente0 criou conta poupanca
		ContaBancaria cliente1 = new ContaBancaria("X-826154-4", 23118);			// Criente1 criou conta bancaria
		ContaEspecial cliente2 = new ContaEspecial("Z-143576-1", 16753, 100.00f);	// Criente2 criou conta especial
		
		cliente0.sacar(100.0f);	
		cliente1.sacar(100.0f);	// saque maior que o saldo
		cliente2.sacar(500.0f);
		
		System.out.println(cliente0);
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println();
		
		cliente0.depositar(100.0f);
		cliente1.depositar(100.0f);
		cliente2.depositar(100.0f);
		
		cliente0.calcularNovoSaldo();
		
		System.out.println(cliente0);
		System.out.println(cliente1);
		System.out.println(cliente2);
		
	}

}
