package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1036 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 
	      double A = 0, B = 0, C = 0, delta;
	      
	      A = teclado.nextDouble();
	      
	      B = teclado.nextDouble();
	      
	      C = teclado.nextDouble();
	      
	      delta = Math.pow(B,2) - (4 * A * C);
	      
	      if (A <= 0 ||  delta < 0){
	          
	          System.out.println("Impossivel calcular");
	          
	      } else {
	          
	        double primeiroR = (((-1 * B) + Math.pow(delta, 0.5)) / (2*A));
	        double segundoR = (((-1 * B) - Math.pow(delta, 0.5)) / (2*A));
	        System.out.printf("R1 = %.5f\n",primeiroR);
	        System.out.printf("R2 = %.5f\n",segundoR);
	      }
	}
}