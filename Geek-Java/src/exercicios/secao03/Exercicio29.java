package exercicios.secao03;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			float n1,n2,n3,n4,average;	
			
			System.out.print("Nota #01:");
			n1 = scan.nextFloat();
			
			System.out.print("Nota #02:");
			n2 = scan.nextFloat();
			
			System.out.print("Nota #03:");
			n3 = scan.nextFloat();
			
			System.out.print("Nota #04:");
			n4 = scan.nextFloat();
			
			average = (n1+n2+n3+n4)/4;
			System.out.println("Média: "+average);
			
			
		
		scan.close();
	}

}
