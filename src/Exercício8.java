import java.util.Scanner;

public class Exercício8 {
    public static void main(String[] args) throws Exception {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Digite a despesa dos pratos: ");
            float pratos = scn.nextInt();
            System.out.print("Digite a despesa das bebidas: ");
            float bebidas = scn.nextInt();
            scn.close();
            float soma = bebidas + pratos;
            float gorjeta = soma * 10 / 100;
            
            System.out.println("A gorjeta do garçom é: " + "R$ " + gorjeta);
            
        }
        
    }
}
