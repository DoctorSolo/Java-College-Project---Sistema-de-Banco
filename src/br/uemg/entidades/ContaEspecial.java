package br.uemg.entidades;
import br.gov.BancoCentral;

public class ContaEspecial extends ContaBancaria{
	private final float LIMITE = (BancoCentral.LIMITE_CREDITO_PERMITIDO - 4000.00f); // 1000.00 de limite escolhido
	
	
	// Contrutor
	public ContaEspecial(String clientes, int num_conta, float saldo) {
		super(clientes, num_conta, saldo);
	}
	
	@Override
	public void sacar(float saque) {
		if (saque <= LIMITE) saldo -= saque;
		else System.out.println("Almente o limite para poder sacar valores maiores se permitido");
	}

	
	// Getters and Setters
	public float getLIMITE() {
		return LIMITE;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + "ContaEspecial";
	}

}
