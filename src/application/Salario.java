package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de Funcionarios: ");
		int n = sc.nextInt();

		List<Funcionario> funcionario = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("ID Funcionario: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();

			funcionario.add(new Funcionario(id, nome, salario));
		}
		System.out.println("Digite ID de Funcionario ajustado Salario!");
		int id = sc.nextInt();
		Funcionario func = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (func == null) {
			System.out.println("ID de Funcionario nao cadastrado!");
		} else {
			System.out.print("Entre com o percentual: ");
			Double p = sc.nextDouble();
			func.ajusteSalario(p);
		}

		for (Funcionario relat : funcionario) {
			System.out.println(relat.toString());
		}

		sc.close();
	}

}
