package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1002 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double area, n = 3.14159, raio;
		
		raio = entrada.nextDouble();
		area = n * (raio*raio);
		System.out.printf("A=%.4f\n",area);
	}

}
