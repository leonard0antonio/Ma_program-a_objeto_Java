import java.util.Scanner;

public class Questao_08 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o raio da lata de óleo (em cm): ");
        double raio = leia.nextDouble();

        System.out.print("Digite a altura da lata de óleo (em cm): ");
        double altura = leia.nextDouble();

        double volume = 3.14159 * raio * raio * altura;

        System.out.printf("O volume da lata de óleo é %.2f cm³%n", volume);

        leia.close();
    }
}

