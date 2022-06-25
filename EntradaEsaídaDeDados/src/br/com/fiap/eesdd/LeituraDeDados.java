package br.com.fiap.eesdd;

import java.util.Scanner;

public class LeituraDeDados {

		public static void main(String[] args) {
		
		//para ler uma informação inserida pelo usuário, precisamos da ajuda da classe Scanner.
		
		Scanner sc = new Scanner(System.in); //assim foi declarada uma variável do tipo Scanner com nome sc.
		
		//Scanner permite a leitura de dados que podem ser provenientes de várias origens, como um arquivo do disco ou informações digitadas pelo usuário.
		//System.in especifica que queremos ler os valores digitados pelo usuário;
		
		int idade = sc.nextInt(); //ler um numero inteiro;
		//double preco = sc.nextDouble(); //ler um numero de ponto flutuante;
		
		//a classe Scanner está definida no pacote java.util
		
		System.out.println("Idade digitada: " + idade);
		sc.close();
	}

}

