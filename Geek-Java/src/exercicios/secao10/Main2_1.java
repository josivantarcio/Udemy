package exercicios.secao10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.List;
import java.util.Scanner;

public class Main2_1 {

	public static void main(String[] args) {

		try {
//			Scanner ler = new Scanner(new FileInputStream("/home/josivan/Documentos/teste.csv"));
//			int i = 0;
//			while(ler.hasNextLine()) {
//				i++;
//			}
//			ler.close();
//			System.out.println("Quantidade de Linhas: " + i);
			
			LineNumberReader linew = new LineNumberReader(new FileReader("/home/josivan/Documentos/teste.csv"));
			try {
				linew.skip(Long.MAX_VALUE);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(linew.getLineNumber());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
