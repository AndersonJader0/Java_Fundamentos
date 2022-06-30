package br.com.fiap.banco2;

public class ContaCorrente extends Conta {
	private String tipo;
	
	private double chequeEspecial;
	
	public ContaCorrente() {
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	public double getSaldoDisponivel() {
		return getSaldo() + this.chequeEspecial;
	}
	
	
}
