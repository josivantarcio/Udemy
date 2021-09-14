package exercicios.secao03;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		float k, m;
		
		System.out.print("Distancia em Km/h: ");
		k = keyb.nextFloat();
		m = k / 3.6f;
		System.out.println("Distancia convertida é de "+ m +" m/s.");
				
		keyb.close();
	}
}
