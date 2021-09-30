package exercicios.secao10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CriarArquivo {
	private String nomeArquivo;

	public CriarArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public void fazerArquivo() {
		Scanner scan = new Scanner(System.in);
		try {
			PrintStream escrever = new PrintStream(new FileOutputStream(this.getNomeArquivo(), true));
			System.out.println("Digite o Texto: ");
			String txt = "";
			
			do {
				txt = scan.nextLine();
				if(txt.equalsIgnoreCase("0")) {
					break;
				}else {
					escrever.println(txt);
				}
			}while(!(txt.equalsIgnoreCase(null)));
			escrever.close();
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível acessar o arquivo.");
		}
		scan.close();
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	
}
