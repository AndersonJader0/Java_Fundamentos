package br.com.fiap.banco;

public class Conta{
	int numero, agencia;
	double saldo;
	
	public Conta(){
		//constructor default: void
	}
	
	public Conta(int numero, int agencia, double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void retirar(double valor){
		this.saldo -= valor;
	}
	
	public double verificarSaldo(){
		return saldo;
	}
}
