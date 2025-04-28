package basico;

import java.util.Scanner;

public class ConverterValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double IMPOSTO = 0.75;
        String valor;
        double valorConvertido, valorFinal;

        System.out.println("Digte valor que vem do site: ");
        valor = input.next();

        valorConvertido = Double.parseDouble(valor);

        valorFinal = valorConvertido + IMPOSTO;
        System.out.printf("O Valor total foi: %.2f", valorFinal);

        input.close();
    }
}
