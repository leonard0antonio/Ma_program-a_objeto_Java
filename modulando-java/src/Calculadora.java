import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("\n--- Calculadora Simples ---");

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = scanner.next().charAt(0);

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado;

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero!");
                        resultado = Double.NaN;
                    } else {
                        resultado = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Operador inválido.");
                    resultado = Double.NaN;
                    break;
            }

            System.out.printf("Resultado: %.2f\n", resultado);

            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next();
        }

        System.out.println("Encerrando a calculadora.");
        scanner.close();
    }
}
