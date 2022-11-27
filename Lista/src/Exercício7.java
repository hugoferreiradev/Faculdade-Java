import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int num1 = scanner.nextInt();
            System.out.println("Digite outro número: ");
            int num2 = scanner.nextInt();
            scanner.close();
            int res = num1 / num2;
            int resto = num1 % num2;

            System.out.println("O resutado de " + (num1 + " / " + num2) + " é = " + res);
            System.out.println("e o resto é " + (num1 + " % " + num2) + " é = " + resto);
        }
        
    }
}

