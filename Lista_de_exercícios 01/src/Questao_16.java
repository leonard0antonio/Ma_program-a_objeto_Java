import java.util.Scanner;

public class Questao_16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int nunb1, nunb2;

        System.out.print("Verificador de números\n\n");

        System.out.print("Digite o primeiro número:  ");
        nunb1 = leia.nextInt();

        System.out.print("Digite o segundo número:  ");
        nunb2 = leia.nextInt();

        if (nunb1 > nunb2) {
            System.out.println("o primeiro numero é maior que o segundo número. ");
        } else if (nunb1 < nunb2) {
            System.out.println("O primeiro número é menor que o segundo número.");
        }else {
            System.out.println("Os dois números são iguais.");
        }
    leia.close();
    }
}

