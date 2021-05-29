package exercicios.secao04;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner tabela = new Scanner(System.in);
		float total = 0, preco = 0;

		System.out.println("Escolha o Produto");
		System.out.println("-----------------");
		System.out.print("Pedido: ");
		int cod = tabela.nextInt();
		if (cod == 100) {
			System.out.print("Cachorro Quente: ");
			preco = 1.20f;
		} else if (cod == 101) {
			System.out.print("Bauru Simples ");
			preco = 1.30f;
		} else if (cod == 102) {
			System.out.print("Bauru com Ovo ");
			preco = 1.50f;
		} else if (cod == 103) {
			System.out.print("Hamburguer ");
			preco = 1.20f;
		} else if (cod == 104) {
			System.out.print("Cheeseburguer ");
			preco = 1.70f;
		} else if (cod == 105) {
			System.out.print("Suco ");
			preco = 2.20f;
		} else if (cod == 106) {
			System.out.print("Refrigerante ");
			preco = 1.00f;
		}else {
			System.out.println("Produto Inexistente");
		}
		System.out.println();
		System.out.print("Quantidade: ");
		float quant = tabela.nextFloat();
		switch (cod) {
		case 100:
			total = quant * preco;
			break;
		case 101:
			total = quant * preco;
			break;
		case 102:
			total = quant * preco;
			break;
		case 103:
			total = quant * preco;
			break;
		case 104:
			total = quant * preco;
			break;
		case 105:
			total = quant * preco;
			break;
		case 106:
			total = quant * preco;
			break;
		}

		System.out.println("TOTAL: " + total);
		tabela.close();

	}

}
