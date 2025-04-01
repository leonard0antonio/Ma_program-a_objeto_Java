import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor1, valor2, soma, subtracao, muti, div;
        String mensagem = "O resultado da operação é: ";

        System.out.println("Digite dois valores: ");
        valor1 = input.nextDouble();
        valor2 = input.nextDouble();

        soma = valor1 + valor2;
        System.out.println(mensagem + soma);
    }
}
