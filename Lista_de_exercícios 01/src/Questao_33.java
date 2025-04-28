import java.util.Scanner;

public class Questao_33 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double nota, somaNotas = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite o número de matrícula do aluno (ou uma letra para encerrar): ");
            if (!leia.hasNextInt()) {
                break; // Se não for número inteiro, encerra
            }

            int matricula = leia.nextInt();

            System.out.print("Digite a nota do aluno: ");
            if (leia.hasNextDouble()) {
                nota = leia.nextDouble();
            } else {
                System.out.println("Nota inválida! Tente novamente.\n");
                leia.next();
                continue;
            }

            somaNotas += nota;
            contador++;
        }

        if (contador > 0) {
            double media = somaNotas / contador;
            System.out.printf("\nA média da turma é: %.2f\n", media);
        } else {
            System.out.println("\nNenhum aluno foi cadastrado.");
        }

        leia.close();
    }
}
