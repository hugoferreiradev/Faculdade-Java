import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Digite seu primeiro número: ");
            int n1 = scn.nextInt();
            System.out.println("Digite seu segundo número: ");
            int n2 = scn.nextInt();
            System.out.println("Digite seu terceiro número: ");
            int n3 = scn.nextInt();
            int media = n1 + n2 + n3 / 3;
            System.out.println("A média de aritmética de " + n1 + ", " + n2 + " e " + n3 + " é = " + media);
            
        }

    }
}
