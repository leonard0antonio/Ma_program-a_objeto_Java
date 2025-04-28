package condicionais;

import java.util.Scanner;

public class ExemplosIf {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        String situacao;

        System.out.println("Digite tres notas: ");
        nota1 = leia.nextDouble();
        nota2 = leia.nextDouble();
        nota3 = leia.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        if (media < 5.0) {
            situacao = "REPROVADO";
        } else if (media >= 7){
            situacao = "APROVADO";
        } else {
            situacao = "PROVA FINAL";
        }

//        System.out.println("A media do aluno foi: " + media
//                        + " e a situão é: " + situacao);

        System.out.printf("A media do aluno é %.2f e  situAção é %s", media, situacao);
    }
}
