import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = 5;
        int[] notas = new int[n];
        int i;
        int soma = 0;

        for (i = 0; i < notas.length; i++) {
            System.out.printf("Informe sua nota: ", (i + 1));
            notas[i] = scn.nextInt();
        }

        for (i = 0; i < notas.length; i++) {
            soma = soma + notas[i];

        }
        int media = soma / n;

        if (media >= 9) {
            System.out.println("Sua Média é: A");
        } else if (media >= 8 && media < 9) {
            System.out.println("Sua Média é: B");
        } else if (media >= 7 && media < 8) {
            System.out.println("Sua Média é: C");
        } else if (media >= 6 && media < 7) {
            System.out.println("Sua Média é: D");
        } else if (media <= 6) {
            System.out.println("Sua Média é: E");
        }
    }
}