import java.util.Scanner;

public class Questao_15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leia.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leia.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leia.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = leia.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno é: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado com média " + media);
        } else {
            System.out.print("Digite a nota da recuperação: ");
            double notaRecuperacao = leia.nextDouble();

            double novaMedia = (media + notaRecuperacao) / 2;

            if (novaMedia >= 7) {
                System.out.println("Aluno aprovado na recuperação com média " + novaMedia);
            } else {
                System.out.println("Aluno reprovado com média " + novaMedia);
            }
        }

        leia.close(); 
    }
}

