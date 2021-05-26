package exercicios.secao03;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float brl, usd;
		
		System.out.print("Valor R$: ");
		brl = scan.nextFloat();
		
		System.out.print("Valor US$: ");
		usd = scan.nextFloat();
		
		float cotacao = brl * usd;
		System.out.println("Valor da Cotação BRL/USD: "+cotacao);		
		
		scan.close();

	}

}
