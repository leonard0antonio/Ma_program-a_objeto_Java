import java.util.Scanner;

public class Questao_02 {
    public static void main(String[] args) {
        System.out.println("# Cotação do Dólar #");

        Scanner scanner = new Scanner(System.in);

        // Lendo a cotação do dólar
        System.out.print("Digite a cotação do dólar: ");
        double cotacao = scanner.nextDouble();

        // Lendo o valor em dólares
        System.out.print("Digite o valor em dólares: ");
        double valorDolares = scanner.nextDouble();

        // Convertendo para reais
        double valorReais = valorDolares * cotacao;

        // Exibindo o resultado
        System.out.printf("O valor em reais é: R$ %.2f\n", valorReais);

        scanner.close();
    }
}

