import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int num1 = scanner.nextInt();
            System.out.println("Digite outro número: ");
            int num2 = scanner.nextInt();
            scanner.close();
            int res = num1 - num2;

            System.out.println("O resutado de " + (num1 + " - " + num2) + " é = " + res);
        }
        
    }
}

