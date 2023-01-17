package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1061 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String dia1 = entrada.nextLine();
		String hora1 = entrada.nextLine();

		String dia2 = entrada.nextLine();
		String hora2 = entrada.nextLine();

		int dia1Int = Integer.parseInt(dia1.substring(dia1.length() - 2).trim());
		int hora1Int = Integer.parseInt(hora1.substring(0, 2));
		int minutos1 = Integer.parseInt(hora1.substring(5, 7));
		int segundos1 = Integer.parseInt(hora1.substring(10));

		int dia2Int = Integer.parseInt(dia2.substring(dia2.length() - 2).trim());
		int hora2Int = Integer.parseInt(hora2.substring(0, 2));
		int minutos2 = Integer.parseInt(hora2.substring(5, 7));
		int segundos2 = Integer.parseInt(hora2.substring(10));

		segundos1 = (dia1Int * 24 * 60 * 60) + (hora1Int * 60 * 60) + (minutos1 * 60) + (segundos1);
		segundos2 = (dia2Int * 24 * 60 * 60) + (hora2Int * 60 * 60) + (minutos2 * 60) + (segundos2);
		int diferenca_seg_atual = segundos2 - segundos1;

		int dias = diferenca_seg_atual / (24 * 60 * 60);
		diferenca_seg_atual -= dias * 24 * 60 * 60;
		
		int horas = diferenca_seg_atual / (60 * 60);
		diferenca_seg_atual -= horas * 60 * 60;
		
		int minutos = diferenca_seg_atual / (60);
		diferenca_seg_atual -= minutos * 60;
		int segundos = diferenca_seg_atual;

		System.out.printf("%s dia(s)\n", dias);
		System.out.printf("%s hora(s)\n", horas);
		System.out.printf("%s minuto(s)\n", minutos);
		System.out.printf("%s segundo(s)\n", segundos);
	}
}
