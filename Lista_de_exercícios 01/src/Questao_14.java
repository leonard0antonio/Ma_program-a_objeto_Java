import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int numero01 = leia.nextInt();

        System.out.println("digite um segundo numero: ");
        int numero02 = leia.nextInt();

        int diferenca = numero02 - numero01;

        if (numero01 > numero02) {
            System.out.println("o numero " + numero01 + " é maior que" + numero02 + "a diferenca é " + diferenca);
        } else if (numero02 > numero01) {
            System.out.println("o numero " + numero02 + " é maior que" + numero01 + "a diferenca é " + diferenca);
        } else
            System.out.println("numeros iguais");

         leia.close();
    }
}

