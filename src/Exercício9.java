import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int salárioMin = 1212;
            System.out.println("Digite seu salário: ");
            int salárioP = scn.nextInt();
            int salárioT = salárioP / salárioMin;
            System.out.println("Essa pessoa ganha " + salárioT + " salários mínimos");
        }
    }
}