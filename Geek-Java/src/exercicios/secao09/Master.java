package exercicios.secao09;

import java.util.Scanner;

public class Master {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int quantPessoas = 10;
		AgendaEx02[] pessoa = new AgendaEx02[quantPessoas];
		
		
		for(int i = 0; i < quantPessoas; i++) {
			System.out.print("Nome da pessoa "+(i+1)+": ");
			pessoa[i].setNome(scan.nextLine()); 
			
			System.out.print("Idade da pessoa "+(i+1)+": ");
			pessoa[i].setIdade(scan.nextInt());
			
			System.out.print("Altura da pessoa "+(i+1)+": ");
			pessoa[i].setAltura(scan.nextFloat());
			
		}
		
		
		
		
		
		scan.close();
	
	}

}
