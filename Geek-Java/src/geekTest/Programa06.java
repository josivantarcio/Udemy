package geekTest;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nome: ");
		nome = teclado.nextLine();
		
		System.out.print("Idade? ");
		idade = teclado.nextInt();
		
		System.out.println(nome + " Tem " + idade + " Anos");
		teclado.close();

	}

}
