package geek;

import java.util.Scanner;

public class Programa7 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int idade = 1;
		String nome;
		
		while (idade > 0){
			System.out.println("Nome: ");
			nome = keyb.nextLine();
						
			System.out.println("Idade: ");
			idade = keyb.nextInt();
			keyb.nextLine();
			System.out.println("=");
			System.out.println("Nome: "+nome+" >> Idade:"+idade);
		}
		System.out.println("FIM");
		
	keyb.close();
	}

}
