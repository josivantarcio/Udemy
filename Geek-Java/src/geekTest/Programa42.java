package geekTest;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa42 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try{
			PrintStream escrever = new PrintStream("textoSaida.txt");
			System.out.println("Escreva o texto aqui:");
			int i = 0;
			String msg="";
			do {  
				i++;
				System.out.print("linha "+i+": ");
				msg = scan.nextLine();
				escrever.println(msg);
			}while(!(msg.equals("fim")));
			
			escrever.close();
		}catch(FileNotFoundException e) {
			System.out.println("Não Foi Possível Escrever no arquivo.");
		}
		
		
		System.out.println("fim");
		scan.close();
	}
}
