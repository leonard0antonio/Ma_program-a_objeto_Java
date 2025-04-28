import java.util.Scanner;

public class Questao_21{

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.print("Verificador de números positivos ou negativos\n\n");

        do {
            System.out.print("Digite um número (digite 0 para sair): ");
            numero = leia.nextInt();

            if (numero > 0) {
                System.out.println("O número é positivo");
            } else if (numero < 0) {
                System.out.println("O número é negativo");
            }
            else {
                System.out.println("Você digitou 0, encerrando o programa.");
            }

        } while (numero != 0);
        
        System.out.println("Programa encerrado.");
        leia.close();
    }
}

