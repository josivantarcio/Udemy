package geekTest;

import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite valor 1: ");
		int v1 = scan.nextInt();
		System.out.print("Digite valor 2: ");
		int v2 = scan.nextInt();


		mensagem(soma(v1, v2)); 
		scan.close();

	}

	static int soma(int vl1, int vl2) {
		return vl1 + vl2;
	} 
 
	static void mensagem(int n) {
		System.out.print("O resultado foi: "+n);
		

	}

}
