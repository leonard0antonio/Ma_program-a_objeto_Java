import java.util.Scanner;

public class Questao_36 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro e positivo: ");

            numero = leia.nextInt();


            while (numero <= 0) {
                System.out.print("Valor inválido. Digite um número **positivo**: ");
                numero = leia.nextInt();
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            soma += numero;
        }

        double media = soma / 10.0;

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.printf("Média dos valores: %.2f\n", media);

        leia.close();
    }
}
