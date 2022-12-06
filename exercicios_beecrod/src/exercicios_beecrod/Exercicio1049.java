package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1049 {
	public static void mostraNomedoAnimal() {
		Scanner entrada = new Scanner(System.in);

		String palavra1 = entrada.nextLine();
		String palavra2 = entrada.nextLine();
		String palavra3 = entrada.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado")) { // vertebrado

			if (palavra2.equalsIgnoreCase("ave")) { // ave
				if (palavra3.equalsIgnoreCase("carnivoro")) { // carnivoro
					System.out.println("aguia");
				} else { // onivoro
					System.out.println("pomba");
				}

			} else { // mamifero
				if (palavra3.equalsIgnoreCase("onivoro")) { // onivoro
					System.out.println("homem");
				} else { // herbivoro
					System.out.println("vaca");
				}
			}

		} else { // invertebrado

			if (palavra2.equalsIgnoreCase("inseto")) { // inseto
				if (palavra3.equalsIgnoreCase("hematofago")) { // hematofago
					System.out.println("pulga");
				} else { // herbivoro
					System.out.println("lagarta");
				}

			} else { // anelideo
				if (palavra3.equalsIgnoreCase("hematofago")) { // hematofago
					System.out.println("sanguessuga");
				} else { // onivoro
					System.out.println("minhoca");
				}

			}
		}
	}
	public static void main(String[] args) {
		mostraNomedoAnimal();
	}
}
