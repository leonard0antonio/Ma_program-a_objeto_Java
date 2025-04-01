import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercio01 {
    /*
        Faça um programa para calcular o estoque médio
        de uma peça, sendo que:
        ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2
     */
    public static void main(String[] args) {
        double estoqueMedio;
        int qtdeMinima, qtdeMaxima;
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas peças você compro: ");
        qtdeMaxima = leia.nextInt();

        System.out.print("Qual a quantidade minima de peças: ");
        qtdeMinima = leia.nextInt();

        estoqueMedio = (qtdeMinima + qtdeMaxima) / 2;

        System.out.println("O estoque medio de peças é = "
                + estoqueMedio);
    }
}
