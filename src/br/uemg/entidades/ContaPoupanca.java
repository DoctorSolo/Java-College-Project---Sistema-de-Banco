package br.uemg.entidades;
import br.gov.BancoCentral;

public class ContaPoupanca extends ContaBancaria{
	
	// (este banco rende por mes)
	private int dia_de_rendimento = 22;	// dias uteis para o banco.
	private final float TAXA_RENDIMENTO = (BancoCentral.TAXA_JUROS - 0.005f)/12; // 0.005 representa a taxa coletada mensal pelo banco (Lembrando taxa de juros é anual)
	
	
	// Contrutor
	public ContaPoupanca(String clientes, int num_conta, float saldo) {
		super(clientes, num_conta, saldo);
	}
	

	// Metodos
	public void calcularNovoSaldo() {
		saldo *= (1 + TAXA_RENDIMENTO);
	}
	
	
	public void previsaoRenda() {
		float renda_artificial = saldo;
		for (byte i = 0; i < 12; i++) {
			System.out.println("Mes=" + i + ", rendimento=" + (renda_artificial *= (1 + TAXA_RENDIMENTO)));
		}
	}
	
	
	// Getters and Setters
	public int getDia_de_rendimento() {
		return dia_de_rendimento;
	}


	public float getTAXA_RENDIMENTO() {
		return TAXA_RENDIMENTO;
	}


	@Override
	public String toString() {
		return super.toString() + " - " + "ContaPoupança";
	}
	

}
