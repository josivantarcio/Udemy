package exercicios.secao09;

import java.util.Scanner;

public class AgendaEx02Master {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AgendaEx02 contato = new AgendaEx02();
		String nome;
		int idade;
		float altura;

		for (int i = 0; i < contato.getPessoas(); i++) {
			System.out.print("Nome: ");
			nome = scan.next();

			System.out.print("Idade: ");
			idade = scan.nextInt();

			System.out.print("Altura: ");
			altura = scan.nextFloat();

			contato.armazenarPessoas(nome, idade, altura);
		}
		
//		System.out.print("Remover qual nome: ");
//		contato.removerPessoas(scan.next());
		
		
		System.out.println("Qual a posição de...");
		contato.buscarPessoa(scan.next());
		
		
		System.out.println("Imprimir Agenda");
		contato.imprimirAgenda();
		
		System.out.println();
		
		
		
	}

}
