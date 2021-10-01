package exercicios.secao10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		try {
			LineNumberReader lnr = new LineNumberReader(new FileReader("/home/josivan/Documentos/teste.csv"));
			try {
				lnr.skip(Long.MAX_VALUE);
			} catch (IOException e) {
				System.out.println("Nao conseguimos contar as linhas do arquivo.");
			}
			System.out.println(lnr.getLineNumber());
			
		} catch (FileNotFoundException e) {
			System.out.println("Nao foi possivel acessar o arquivo");
		}
		 
		try {
			Scanner ler = new Scanner(new FileInputStream("/home/josivan/Documentos/teste.csv"));
			int i = 0;
			while(ler.hasNextLine()) {
				i++;
			}
			System.out.println("quantidade de Linhas " + i);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
