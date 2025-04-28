import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        System.out.println("Verificador de variáveis\n");

        // Leitura do valor de a
        do {
            System.out.print("Digite o valor 1: ");
            a = entrada.nextInt();
            if (a <= 0) {
                System.out.println("Valor inválido. Digite um valor maior que zero.");
            }
        } while (a <= 0);

        // Leitura do valor de b
        do {
            System.out.print("Digite o valor 2: ");
            b = entrada.nextInt();
            if (b <= 0) {
                System.out.println("Valor inválido. Digite um valor maior que zero.");
            }
        } while (b <= 0);

        // Leitura do valor de c
        do {
            System.out.print("Digite o valor 3: ");
            c = entrada.nextInt();
            if (c <= 0) {
                System.out.println("Valor inválido. Digite um valor maior que zero.");
            }
        } while (c <= 0);

        // Encontrar o menor e o maior valor
        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        // Exibir os resultados
        int multiplicacao = menor * maior;
        double divisao = (double) maior / menor;

        System.out.println("Menor * Maior = " + multiplicacao);
        System.out.println("Maior / Menor = " + divisao);
    }
}
