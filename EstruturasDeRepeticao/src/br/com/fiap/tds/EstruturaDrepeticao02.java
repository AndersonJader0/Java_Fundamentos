package br.com.fiap.tds;
import javax.swing.JOptionPane;

public class EstruturaDrepeticao02 {
	
	public static void main(String[] args) {
		int numero = 0;
		String n;
		
		while(numero < 1) {
			n = JOptionPane.showInputDialog("Deseja continuar?"
					+ "\n0 - Sim"
					+ "\n1 - Não"
					);
			int n1 = Integer.parseInt(n);
			numero = numero + n1;
		}
	}
}