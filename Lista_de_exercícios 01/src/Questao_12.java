import java.util.Scanner;

public class Questao_12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int nub1;

        System.out.println("digite um numero: ");
        nub1 = leia.nextInt();

        if (nub1 < 0){
            System.out.println("numero negativo");
        } else {
            System.out.println("numero positivo");
        }
        leia.close();
    }
}

