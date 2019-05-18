package application;

import java.util.Scanner;

import entities.Hotel;

public class ProgramHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hotel[] vetor = new Hotel[9];
		
		for(int i = 0; i<vetor.length; i++) {
			if(vetor[i] != null) {
				
			}else {
				System.out.println("Quarto Ocupado!");
			}
		}
		
		
		
		sc.close();

	}

}
