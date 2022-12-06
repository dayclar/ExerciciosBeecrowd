package exercicios_beecrod;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1047 {
	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);

		int horaInicial = entrada.nextInt();
		int minutoInicial = entrada.nextInt();
		int somaMinutosIniciais = horaInicial * 60 + minutoInicial;

		int horaFinal = entrada.nextInt();
		int minutoFinal = entrada.nextInt();
		int somaMinutosFinais = horaFinal * 60 + minutoFinal;

		int diferenca = (24 * 60 - somaMinutosIniciais) + somaMinutosFinais;

		int horas = diferenca / 60;
		int minutos = diferenca % 60;

		if (horas >= 24 && minutos >= 1) {
			horas = horas % 24;
		}
		System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n", horas, minutos);
	}

}
