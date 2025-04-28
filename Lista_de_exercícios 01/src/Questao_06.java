import java.util.Scanner;

public class Questao_06 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print(" Digite a temperatura em graus celsius: ");
        double celsius = leia.nextDouble();

        double fahrenheit = ((double)9.0F * celsius + (double)160.0F) / (double)5.0F;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "º");

        leia.close();
    }
}

