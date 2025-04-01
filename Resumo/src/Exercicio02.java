import java.util.Scanner;

public class Exercicio02 {
    /*
    Ler uma temperatura em graus Celsius e apresentá-la convertida
    em graus Fahrenheit. A fórmula de conversão de temperatura a ser
    utilizada é F = (9 * C + 160) / 5, em que a variável F
    representa é a temperatura em graus Fahrenheit e a variável
    C representa é a temperatura em graus Celsius.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print(" Digite a temperatura em graus celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: "
                + fahrenheit + "º");
    }
}
