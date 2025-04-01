import java.util.Random;
import java.util.Scanner;

public class ExemplosFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        String continuar;

        do{
            System.out.println("Menu de opções ");
            System.out.println("1. Conversão de moeda");
            System.out.println("2. Achar um numero");
            System.out.println("3. Listar os Pares");
            System.out.println("4. Sair");

            System.out.print("Digite uma opção: ");
            op = input.nextInt();

            switch (op){
                case 1:
                    System.out.println("Digite o valor em real: ");
                    double valor = input.nextDouble();
                    double convertido = valor * 5.75;
                    System.out.println("O valor em dolar foi: " + convertido);
                    break;
                case 2:
                    Random valoresAleatorios = new Random();
                    int numero = input.nextInt();
                    for (int i = 0; i <10; i++){
                        if (numero == valoresAleatorios.nextInt(1,5)){
                            System.out.println("O número " + numero
                                    + " esta na posição " + i);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Listar os Pares de 0 a 100");
                    for (int i = 0; i <=100; i++){
                        if (i % 2 == 0){
                            System.out.println("Numero Par: " + i);
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.print("Deseja continuar?: ");
            continuar = input.next();
        } while (continuar.equalsIgnoreCase("Sim"));
        System.out.println("Fim do Programa!");
    }
}
