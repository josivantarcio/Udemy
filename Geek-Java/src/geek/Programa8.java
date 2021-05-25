package geek;

import java.util.Scanner;

public class Programa8 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		
		String name;
		int idade = 1;
		
		do {
			System.out.print("Nome: ");
			name = keyb.nextLine();
						
			System.out.print("Idade: ");
			idade = keyb.nextInt();
			keyb.nextLine();
			
			System.out.println(name+" tem "+idade+" anos.");
			System.out.println("===============");

		}while(idade > 0);
		keyb.close();		
		System.out.println("FIM");
	}
}
