import java.util.Scanner;

public class Questao_30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numero;
        System.out.print("Digite um número: ");
        numero = leia.nextDouble();


        for(int x=0; x <= 10;x++){

            System.out.printf("%f x %d = %g\n",numero ,x,numero*x);
        }

        leia.close();
    }
}
