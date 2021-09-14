package exercicios.secao03;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int n1,n2,n3,soma;
		
		System.out.print("Digite número 1: ");
		n1 = keyb.nextInt();
		
		System.out.print("Digite número 2: ");
		n2 = keyb.nextInt();
		
		System.out.print("Digite número 3: ");
		n3 = keyb.nextInt();
		
		soma = n1 + n2 + n3;
		System.out.println("A soma de "+ n1 + "," + n2 + "," + n3 + " = "+ soma);
		
		
keyb.close();
	}

}
