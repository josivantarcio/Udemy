package geekTest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa43 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new FileInputStream("boatarde.doc"));
			int i = 0;
			while(scan.hasNextLine()) { 
				System.out.println(scan.nextLine());
				i++;
			}
			 System.out.println("Quantidade de linhas: "+ i);
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo Não Encontrado");
			
		}
		
	}
}
