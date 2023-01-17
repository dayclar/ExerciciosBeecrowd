package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1066 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0, numero, qtdPositivo = 0, qtdNegativo = 0, qtdPar = 0, qtdImpar = 0;
		for (contador = 0; contador < 5; contador++) {
			numero = entrada.nextInt();
			if (numero > 0) {
				qtdPositivo++;
			} else if (numero < 0) {
				qtdNegativo++;
			}
			if (numero % 2 == 0) {
				qtdPar++;
			} else {
				qtdImpar++;
			}
		}
		System.out.println(qtdPar + " valor(es) par(es)");
		System.out.println(qtdImpar + " valor(es) impar(es)");
		System.out.println(qtdPositivo + " valor(es) positivo(s)");
		System.out.println(qtdNegativo + " valor(es) negativo(s)");
	}
}
