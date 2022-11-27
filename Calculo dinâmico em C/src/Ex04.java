import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int x;
        int y;

        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                System.out.printf("Digite a posição %d %d: ", x, y);
                matriz[x][y] = scn.nextInt();
            }
        }
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                System.out.printf("%d ", matriz[x][y]);
            }
            System.out.printf("\n");
        }
    }
}
