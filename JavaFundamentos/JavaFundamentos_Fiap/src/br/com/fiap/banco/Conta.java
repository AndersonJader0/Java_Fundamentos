package br.com.fiap.banco;

<<<<<<< HEAD
	public class Conta{
		int numero, agencia;
		double saldo;
=======
public class Conta{
	private int numero, agencia;
	private double saldo;
>>>>>>> 7a279f0873cd319cd98e335c64debf9353236a78
	

		public Conta() {
			super();
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
