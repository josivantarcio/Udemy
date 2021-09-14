package exercicios.secao04;

import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float venda, comissao=0;
		
		System.out.print("Valor da Venda: ");
		venda = scan.nextFloat();
		
		if(venda >= 100000.00f) {
			comissao = 700.00f + venda * 0.16f;
		}else if(venda < 100000.00f && venda >= 80000.00f) {
			comissao = 650.00f + venda * 0.14f;
		}else if(venda < 80000.00f && venda >= 60000.00f) {
			comissao = 600.00f + venda * 0.14f;
		}else if(venda < 60000.00f && venda >= 40000.00f) {
			comissao = 550.00f + venda * 0.14f;
		}else if(venda < 40000.00f && venda >= 20000.00f) {
			comissao = 500.00f + venda * 0.14f;
		}else if(venda < 20000.00f) {
			comissao = 400.00f + venda * 0.14f;
		}
		
		System.out.println("Comissão: "+comissao);
		
		scan.close();
	}
}
