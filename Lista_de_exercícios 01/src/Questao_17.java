import java.util.Scanner;

public class Questao_17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int nunb1;

        System.out.print("Digite o primeiro número:  ");
        nunb1 = leia.nextInt();

        if(nunb1 >= 0 && nunb1 <= 9){
            System.out.println("Valor válido.");
        }else{
            System.out.println("Valor inválido.");
        }
        leia.close();
    }
    
}

