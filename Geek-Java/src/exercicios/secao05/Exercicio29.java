package exercicios.secao05;

public class Exercicio29 {

	public static void main(String[] args) {
		int s = 1, fat = 1;
		
		for(int i = 1; i <= 5; i+=2) {
			for(int j = i; j > 0; j--) {
				fat *= j; 	
			}
			s += i/fat;
		}
		System.out.println(s);

	}

}
