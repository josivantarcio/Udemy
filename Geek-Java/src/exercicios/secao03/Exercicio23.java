package exercicios.secao03;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		float m, j;
		System.out.print("Informe em Metros: ");
		m = scan.nextFloat();
		j = m/0.91f;
		System.out.println("Quantidade em Jardas: "+j);
		
		scan.close();
	}

}
