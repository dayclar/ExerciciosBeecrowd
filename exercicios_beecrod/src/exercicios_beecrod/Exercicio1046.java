package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1046 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int N1 = entrada.nextInt();
		int N2 = entrada.nextInt();
		int N3 = 0;
		
		if(N1 <= 24 && N2 <= 24 && N1 >= 0 && N2 >= 0) {
			if(N2 > N1) {
				N3 = N2 - N1;
			} else if(N2 <= N1) {
				N3 = (N2 - N1) + 24;
			}
			System.out.println("O JOGO DUROU " + N3 + " HORA(S)");
		}
	}
}
