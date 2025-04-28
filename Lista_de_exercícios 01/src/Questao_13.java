import java.util.Scanner;


public class Questao_13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Escreva três números inteiros:");
        num1 = leia.nextInt();
        num2 = leia.nextInt();
        num3 = leia.nextInt();

        int maior, meio, menor;

        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 >= num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 >= num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 >= num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }

        System.out.println("Números em ordem decrescente: " + maior + ", " + meio + ", " + menor);

        leia.close();
    }
}

