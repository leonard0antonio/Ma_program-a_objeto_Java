import java.util.Scanner;

public class Questao_20{

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        
        do {
            System.out.print("Digite o valor 1: ");
            a = leia.nextInt();
            if (a <= 0) {
                System.out.println("Valor inválido. Digite um valor maior que zero.");
            }
        } while (a <= 0);

        
        do {
            System.out.print("Digite o valor 2: ");
            b = leia.nextInt();
            if (b <= 0) {
                System.out.println("Valor inválido. Digite um valor maior que zero.");
            }
        } while (b <= 0);

        
        do {
            System.out.print("Digite o valor 3: ");
            c = leia.nextInt();
            if (c <= 0) {
                System.out.println("Valor inválido. Digite um valor maior que zero.");
            }
        } while (c <= 0);

       
        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        
        int multiplicacao = menor * maior;
        double divisao = (double) maior / menor;

        System.out.println("Menor * Maior = " + multiplicacao);
        System.out.println("Maior / Menor = " + divisao);

        leia.close();
    }
}

