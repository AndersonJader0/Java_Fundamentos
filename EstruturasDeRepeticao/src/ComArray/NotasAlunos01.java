package ComArray;
import java.util.Scanner;

public class NotasAlunos01 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	float notas[] = new float[10];
	for (int i = 0; i < 10; i++) {
	  System.out.println("Digite a nota do aluno");
	  notas[i] = sc.nextFloat();
	}
	sc.close();
	}
}
