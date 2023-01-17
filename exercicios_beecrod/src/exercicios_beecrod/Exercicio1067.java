package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1067 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int X, contador;
		X = entrada.nextInt();
		for (contador = 1; contador <= X; contador += 2) {
			System.out.println(contador);

		}
	}

}