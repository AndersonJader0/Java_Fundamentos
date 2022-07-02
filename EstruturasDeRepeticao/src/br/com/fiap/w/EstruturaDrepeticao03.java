package br.com.fiap.w;

import java.util.Scanner;

public class EstruturaDrepeticao03 {
	
	String resposta;
	
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
	
		int x = 1;
		boolean teste;
		
		while (x == 1 ) {
			System.out.println("Deseja continuar?"
					+ "\n1 - s"
					+ "\n2 - n"
					);
			int respUsuario = sc.nextInt();
			x = respUsuario;
		} 
	}
}
