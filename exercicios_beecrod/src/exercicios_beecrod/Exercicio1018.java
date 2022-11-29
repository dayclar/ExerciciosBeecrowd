package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1018 {
	public static void imprimirNotas() {
		Scanner entrada = new Scanner(System.in);
		int qtdDinheiro = 0;

		qtdDinheiro = entrada.nextInt();
		System.out.println(qtdDinheiro);

		int notas100 = 100;
		int notas50 = 50;
		int notas20 = 20;
		int notas10 = 10;
		int notas5 = 5;
		int notas2 = 2; 
		int notas1 = 1; 
		int resto1 = qtdDinheiro % 100;

		if (qtdDinheiro >= notas100) {
			notas100 = qtdDinheiro / 100;
			resto1 = resto1 % 100;
			System.out.println(notas100 + " nota(s) de R$ 100,00");

		} else {
			System.out.println("0 nota(s) de R$ 100,00");
		}
		if (resto1 >= notas50) {
			notas50 = resto1 / 50;
			resto1 = resto1 % 50;
			System.out.println(notas50 + " nota(s) de R$ 50,00");

		} else {
			System.out.println("0 nota(s) de R$ 50,00");
		}
		if (resto1 >= notas20) {
			notas20 = resto1 / 20;
			resto1 = resto1 % 20;
			System.out.println(notas20 + " nota(s) de R$ 20,00");

		} else {
			System.out.println("0 nota(s) de R$ 20,00");
		}
		if (resto1 >= notas10) {
			notas10 = resto1 / 10;
			resto1 = resto1 % 10;
			System.out.println(notas10 + " nota(s) de R$ 10,00");

		} else {
			System.out.println("0 nota(s) de R$ 10,00");
		}
		if (resto1 >= notas5) {
			notas5 = resto1 / 5;
			resto1 = resto1 % 5;
			System.out.println(notas5 + " nota(s) de R$ 5,00");

		} else {
			System.out.println("0 nota(s) de R$ 5,00");

		}
		if (resto1 >= notas2) {
			notas2 = resto1 / 2;
			resto1 = resto1 % 2;
			System.out.println(notas2 + " nota(s) de R$ 2,00");

		} else {
			System.out.println("0 nota(s) de R$ 2,00");

		}
		if (resto1 >= notas1) {
			notas1 = resto1;
			System.out.println(notas1 + " nota(s) de R$ 1,00");

		} else {
			System.out.println("0 nota(s) de R$ 1,00");

		}
	}
	public static void main(String[] args) {
		imprimirNotas();
	}

}
