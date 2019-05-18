package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product[] vetor = new Product[n];
		double soma=0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Produto: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			vetor[i] = new Product(nome,preco);
			soma = vetor[i].getPreco() + soma;
			System.out.println(soma);
			System.out.println(vetor[i].toString());
		}
		System.out.println(soma);
		System.out.println("Media: "+ soma / vetor.length);
		

		sc.close();
	}

}
