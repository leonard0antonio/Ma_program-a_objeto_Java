package condicionais;

import java.util.Scanner;

public class ExemplosSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;

        System.out.println("MENU DE OPÇÕES");
        System.out.println("1. Calcular Media");
        System.out.println("2. Buscar um Numero");
        System.out.println("3. Converter String para Double");
        System.out.println("4. Sair da Aplicação");

        System.out.print("Digite uma opção: ");
        op = input.nextInt();
        switch (op){
            case 1:
                double nota1, nota2, nota3, media;
                String situacao;
                System.out.println("Digite tres notas: ");
                nota1 = input.nextDouble();
                nota2 = input.nextDouble();
                nota3 = input.nextDouble();
                media = (nota1 + nota2 + nota3)/3;
                if (media < 5.0) {
                    situacao = "REPROVADO";
                } else if (media >= 7){
                    situacao = "APROVADO";
                } else {
                    situacao = "PROVA FINAL";
                }
                System.out.printf("A media do aluno é %.2f e  situAção é %s", media, situacao);
                break;
            case 2:

                break;
            case 3:
                String valor;
                double valorConvertido;
                System.out.println("Digite um valor: ");
                valor = input.next();
                valorConvertido = Double.parseDouble(valor);
                System.out.printf("Valor convertido %.2f:", valorConvertido);
                break;
            case 4:
                System.out.println("Saindo do Sistema");
                System.exit(0);
                break;
            default: System.out.println("Opção Inválida");
        }
        System.out.println("\nVocê saiu do Menu principal");
    }
}
