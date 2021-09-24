package geekTest;

public class Programa16 {
	public static void main(String[] args) {
		int[]  nu = new int[5];
		for(int i = 0; i < nu.length; i++) {
			nu[i] = i + 3 * 4;
		}
		for(int n = 0; n <= nu.length; n++) {
			try {
				System.out.println(nu[n]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Valor acima do limite da Array");
			} 
		}
	}
}
