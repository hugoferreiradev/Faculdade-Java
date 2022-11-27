
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float[] x = new float[4];
        float[] y = new float[4];
        float i;
        double parte1, parte2;
        double distancia;
        
        for (i = 0; i < 4; i++) {
            System.out.printf("Digite sua posição X: ");
            x[(int) i] = scn.nextFloat();
        }
        for (i = 0; i < 4; i++) {
            System.out.printf("Digite sua posição Y: ");
            y[(int) i] = scn.nextFloat();
        }

       parte1 = Math.pow(x[1] - x[2], 2);
       parte2 = Math.pow(y[1] - y [2], 2);

       distancia = Math.sqrt(parte1 + parte2);

       System.out.println("A distância euclidiana é: " + distancia);
    }
}