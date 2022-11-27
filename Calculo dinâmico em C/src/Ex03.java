import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int i;
        int j = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.printf("Digite um número %d %d: ", i, j);
                matriz[i][j] = scn.nextInt();
            }
        }

        int maior = matriz[0][0];
        int linha = 0, coluna = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.printf("Maior número: %d\n", maior);
        System.out.printf("Posição: %d %d\n", linha, coluna);
    }

}
