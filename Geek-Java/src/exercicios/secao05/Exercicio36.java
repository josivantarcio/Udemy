package exercicios.secao05;

public class Exercicio36 {

	public static void main(String[] args) {
		int somaQ = 0, soma = 0;
		for (int i = 1; i <= 10; i++) {
			somaQ += Math.pow(i, 2);
			soma += i;
			
		}
		Math.pow(soma, 2);
		
		System.out.println(somaQ-soma);
	}

}
