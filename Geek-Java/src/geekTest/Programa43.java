package geekTest;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Programa43 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("arq.txt"));
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");
		}
		
	}
}
