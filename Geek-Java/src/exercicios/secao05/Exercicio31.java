package exercicios.secao05;

public class Exercicio31 {

	public static void main(String[] args) {
		float s = 0;
		int num = 1;

		for (int i = 1; i <= num; i++) {
			s += num / i;
			num += 2;
			if (i == 50 & num == 99) {
				break;
			}
		}
		System.out.println(s);
	}

}
