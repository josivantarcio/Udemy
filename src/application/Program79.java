package application;

import java.util.Scanner;

public class Program79 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quant. Linhas: "); int linhas = sc.nextInt();
		System.out.print("Quant. Colunas: "); int colunas = sc.nextInt();
		
		int[][] planilha = new int[linhas][colunas];
		for(int i = 0; i < planilha.length; i++) {
			for(int j = 0; j < planilha[i].length; j++) {
				System.out.print("Digite o numero da celula:"+ i +" "+j+": ");
				planilha [i][j] = sc.nextInt();
			}
		}
		System.out.print("Qual numero pesquisar: ");
		int t = sc.nextInt();
		
		for(int i = 0; i < planilha.length;i++) {
			for(int j = 0; j < planilha[i].length; j++) {
				if(planilha[i][j]==t) {
					System.out.println("Posicao: "+i+" "+j);
					if(j > 0) {
						System.out.println("Esquerda:"+ planilha[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Acima:"+planilha[i-1][j]);
					}
					if(j < planilha[i].length-1) {
						System.out.println("Direita: "+planilha[i][j+1]);
					}
					if(i < planilha.length-1) {
						System.out.println("Baixo: "+planilha[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();
	}

}
