import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        int n1 = scn.nextInt();
        System.out.println("O antecessor de N1 é: " + (n1 -1)  + ", e seu sucessor é: " + (n1 + 1));
    }
}
