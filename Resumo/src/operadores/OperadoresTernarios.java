package operadores;

import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double mediaAluno;
        String situacao;

        System.out.println(" Digite a media do Aluno: ");
        mediaAluno = leia.nextDouble();

        situacao = (mediaAluno > 7.0) ? "APROVADO" : "REPROVADO";

        System.out.println("O aluno esta: " + situacao);
    }
}
