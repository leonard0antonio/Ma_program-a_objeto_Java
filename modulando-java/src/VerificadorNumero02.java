import java.util.Scanner;

public class VerificadorNumero02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é PAR.");
        } else {
            System.out.println("O número é ÍMPAR.");
        }

        // Verifica se é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número é POSITIVO.");
        } else if (numero < 0) {
            System.out.println("O número é NEGATIVO.");
        } else {
            System.out.println("O número é ZERO.");
        }

        scanner.close();
    }
}
