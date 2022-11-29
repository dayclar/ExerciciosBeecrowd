package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1010 {
	public static void main(String[] args) {
		int cod1, cod2, numPecas1, numPecas2;
		float vlPecas1, vlPecas2, vlPagar;

		Scanner entrada = new Scanner(System.in);
		cod1 = entrada.nextInt();
		numPecas1 = entrada.nextInt();
		vlPecas1 = entrada.nextFloat();
		
		cod2 = entrada.nextInt();
		numPecas2 = entrada.nextInt();
		vlPecas2 = entrada.nextFloat();
		
		vlPagar = (numPecas1 * vlPecas1) + (numPecas2 * vlPecas2);
		
	    System.out.printf("VALOR A PAGAR: R$ %.2f\n",vlPagar);
		
		
		
	}

}
