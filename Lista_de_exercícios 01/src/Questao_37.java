import java.util.Scanner;

public class Questao_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("\n======= Menu de Operações =======");
            System.out.println("1 – Adição");
            System.out.println("2 – Subtração");
            System.out.println("3 – Multiplicação");
            System.out.println("4 – Divisão");
            System.out.print("Informe a opção desejada: ");

            int opcao = scanner.nextInt();


            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();


            switch (opcao) {
                case 1:
                    System.out.printf("Resultado da adição: %.2f\n", num1 + num2);
                    break;
                case 2:
                    System.out.printf("Resultado da subtração: %.2f\n", num1 - num2);
                    break;
                case 3:
                    System.out.printf("Resultado da multiplicação: %.2f\n", num1 * num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.printf("Resultado da divisão: %.2f\n", num1 / num2);
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            // Pergunta se o usuário deseja continuar
            System.out.print("\nDeseja voltar ao menu principal? (S/s para sim): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
