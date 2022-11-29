package exercicios_beecrod;
import java.util.Scanner;

public class Exercicio1021{
    public static void main(String[] args) {        
        try (Scanner sc = new Scanner(System.in)) {
            int array[] = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
            String moedas = "nota(s) de R$";
            int Temp, n;
            double N = sc.nextDouble();

            n = (int)(N * 100 + 0.00001);
            System.out.printf("NOTAS:\n");

            for (int j = 0; j < array.length; j++) {
                Temp = n / array[j];
                n %= array[j];
                if (j == 6) {
                    moedas = "moeda(s) de R$";
                    System.out.printf("MOEDAS:\n");
                }
                System.out.printf("%d %s %.2f\n", Temp, moedas, array[j]/100.00);
            }

        }
    }
}