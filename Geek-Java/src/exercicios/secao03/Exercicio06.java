package exercicios.secao03;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		float f, c;
		
		System.out.print("Temperatura Cº ");
		c = keyb.nextFloat();
		f = c * (9/5) + 32; 
		
		System.out.println("Temperatura em Fº "+f);
		keyb.close();
	}

}
