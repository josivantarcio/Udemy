package exercicios.secao10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
	public void lendoArquivo(String nomeArquivo) {
		try {
			Scanner ler = new Scanner(new FileInputStream(nomeArquivo));
			int i=0;
			while(ler.hasNextLine()) {
				System.out.println(ler.nextLine());
				i++;
			}
			System.out.println(i);
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel acessar o arquivo " + nomeArquivo);
		} 
	}
}
