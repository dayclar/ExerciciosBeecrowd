package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1038 {
	public static void main(String[] args) {
		int codigo, qtd;
		double vlPago;
		
		Scanner teclado = new Scanner(System.in);
		codigo = teclado.nextInt();
		qtd = teclado.nextInt();
		
		if(codigo == 1) {
			vlPago = qtd * 4;
			System.out.printf("Total: R$ %.2f\n",vlPago);
		} else if(codigo == 2) {
			vlPago = qtd * 4.5;
			System.out.printf("Total: R$ %.2f\n",vlPago);
		} else if(codigo == 3) {
			vlPago = qtd * 5;
			System.out.printf("Total: R$ %.2f\n",vlPago);
		} else if(codigo == 4) {
			vlPago = qtd * 2;
			System.out.printf("Total: R$ %.2f\n",vlPago);
		} else if(codigo == 5) {
			vlPago = qtd * 1.5;
			System.out.printf("Total: R$ %.2f\n",vlPago);
		}
	}
}
