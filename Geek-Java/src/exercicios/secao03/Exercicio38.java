package exercicios.secao03;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Salário R$ ");
		float salario = scan.nextFloat();
		salario = salario + (salario * 0.25f);
		System.out.println("Novo Salário: "+salario);
		
		
		scan.close();

	}

}
