import java.util.Scanner;

public class Questao_07 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print(" Digite a temperatura em graus Fahrenheit: ");
        double Fahrenheit = leia.nextDouble();

        double celsius = (Fahrenheit - (double) 32.0F) * (double) 5.0F / (double) 9.0F;

        System.out.println("A temperatura em celsius é: " + celsius + "º");
        leia.close();
    }
}

