package ComArray;
import java.util.Scanner;

public class Carrotemp {
	
	String modelo;
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public static void main(String[] args) {
		
		Carrotemp[] carros = new Carrotemp[5];

		Carrotemp carro = new Carrotemp();
		carro.setModelo("Gol");

		carros[0] = carro;
		
		String modelo = carros[0].getModelo();
		System.out.println(modelo);
		
	}
}
