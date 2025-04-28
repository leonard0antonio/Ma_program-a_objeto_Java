import java.util.Scanner;

public class Questao_01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas peças você comprou? ");
        int qtdeMaxima = leia.nextInt();

        System.out.print("Qual a quantidade mínima de peças? ");
        int qtdeMinima = leia.nextInt();

        
        double estoqueMedio = (qtdeMinima + qtdeMaxima) / 2.0;

        System.out.println("O estoque médio de peças é = " + estoqueMedio);

        
        leia.close();
    }
}

