import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        int n = 3;
        int[] x = new int[n];
        double[] y = new double[n];
        final double pi = 3.141592;
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            x[i] = scn.nextInt();
            y[i] = (2 * pi * x[i]);
        }
        
        scn.close();
        for (int i = 0; i < x.length; i++) {
            System.out.printf("x: %d, y: %.2f\n", x[i], y[i]);
        }

    }
}
