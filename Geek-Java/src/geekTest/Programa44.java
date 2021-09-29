package geekTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa44 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/**
		 * Documentação Teste
		 */
		try {
			PrintStream escrever = new PrintStream(new FileOutputStream("textoSaida2.xlsx", false));
			System.out.println("Digite o texto: ");
			String msg = "";
			do {
				msg = scan.nextLine();
				if(msg.equalsIgnoreCase("fim")) {
					break;
				}else {
					escrever.println(msg);
				}
				
			}while(!(msg.equals(null)));
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel gravar arquivo.");
		}
		System.out.println("FIM");
		scan.close();
	}
}
