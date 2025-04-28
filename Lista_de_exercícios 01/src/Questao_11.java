import java.util.Scanner;

public class Questao_11 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        
        System.out.print("Digite o valor de A: ");
        int A = leia.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = leia.nextInt();

      
        int temp = A;
        A = B;
        B = temp;

        
        System.out.println("Após a troca, A = " + A + " e B = " + B);

        leia.close();
    }
}

