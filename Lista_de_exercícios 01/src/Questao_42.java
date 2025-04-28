import java.util.Scanner;

public class Questao_42 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero,maior,menor;

        System.out.print("Digite um número: ");
        numero = leia.nextInt();
        menor = numero;
        maior = numero;

        do{
            System.out.print("Digite outro número: ");
            numero = leia.nextInt();

            if(numero>maior) maior = numero;
            if(numero<menor&&numero!=0) menor = numero;

        }while(numero != 0);

        System.out.println("\nO menor número é "+menor+" e o maior número é "+maior+".");

    }
}