import java.util.Scanner;

public class VerificadorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("--- Verificador de Números (Par e Primo) ---");
        System.out.println("Digite 0 para sair.");

        do {
            System.out.print("\nDigite um número inteiro: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            // Verifica par ou ímpar
            if (numero % 2 == 0) {
                System.out.println("-> O número é PAR.");
            } else {
                System.out.println("-> O número é ÍMPAR.");
            }

            // Verifica se é primo
            if (ehPrimo(numero)) {
                System.out.println("-> O número é PRIMO.");
            } else {
                System.out.println("-> O número NÃO é primo.");
            }

        } while (numero != 0);

        System.out.println("\nPrograma finalizado.");
        scanner.close();
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
