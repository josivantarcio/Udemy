package exercicios.secao10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main03 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("arq.txt"));
			try {
				String letra = br.readLine();
				int vogal = 0;
				int nome = 0;

				while (br.read() != -1) {
					for (int i = 0; i < letra.length(); i++) {
						if (letra.charAt(i) == 'a') {
							vogal++;
						}
					}
				}
				System.out.println(vogal);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
