package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1019 {
	public static void main(String[] args) {
		int segundos, horas, minutos;

		Scanner entrada = new Scanner(System.in);
		segundos = entrada.nextInt();

		horas = segundos / 3600;
		segundos = segundos % 3600;
		minutos = segundos / 60;
		segundos = segundos % 60;
		
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
	}

}
