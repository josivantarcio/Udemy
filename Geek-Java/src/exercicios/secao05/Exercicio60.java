package exercicios.secao05;

import java.util.Random;
import java.util.Scanner;

public class Exercicio60 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random numeros = new Random();

		System.out.print("Digite um número ");
		int n = scan.nextInt();
		int cont = 0, i = 0, maior = 0, menor = 0, soma = 0, par = 0, contPar = 0;
		float media, mediaPar;

		while (true) {
			i++;
			cont = numeros.nextInt(n);
			if (cont <= 0) {
				System.out.println("O Número Zero, foi encontrado "+i);
				break;
			}
			if (i == 1) {
				maior = cont;
				menor = cont;
			}
			if (cont > maior) {
				maior = cont;
			}
			if (cont < menor) {
				menor = cont;
			}
			soma += cont;
			if (cont % 2 == 0) {
				par += cont;
				contPar++;
			}

		}
		media = soma / i;
		mediaPar = par / contPar;

		System.out.println("A Soma dos números Digitados: " + soma);
		System.out.println("Quantidade de Números: " + i);
		System.out.println("A Média de Números: " + media);
		System.out.println("O maior numero: " + maior);
		System.out.println("O menor Número: " + menor);
		System.out.println("Média de Pares: " + mediaPar);
		scan.close();
	}
}
