package exercicios.secao10;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		System.out.println("Nome do Arquivo: ");
		Scanner scan = new Scanner(System.in);
		String nome = scan.nextLine();
		CriarArquivo arquivoSaida = new CriarArquivo(nome);
		arquivoSaida.fazerArquivo();
		System.out.println("------------------");
		LerArquivo arquivoEntrada = new LerArquivo();
		arquivoEntrada.lendoArquivo(nome);
		
		System.out.println("FIM");
		scan.close();
	}
}
