package br.com.fiap.banco;

public class Conta{
	private int numero, agencia;
	private double saldo;
	
	public Conta(){
		//constructor default: void
	}
	
	public Conta(int numero, int agencia, double saldo){
		this.setNumero = numero;
		this.setAgencia = agencia;
		this.setSaldo = saldo;
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
        
        public int getNumero(){
        Return numero;
}
        public void setNumero(int numero) {
        this.numero = numero,
}
        public String getAgencia() {
        return agencia;
}
        public void setAgencia(String agencia) {
        this.agencia = agencia;
}

}
