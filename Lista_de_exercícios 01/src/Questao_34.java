import java.util.Scanner;

public class Questao_34 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroAtual,maior,menor;
        boolean primeiro=true;

        System.out.print("Digite um número (negativo para sair): ");
        numeroAtual = entrada.nextInt();

        if(numeroAtual>=0){
            menor = numeroAtual;
            maior = numeroAtual;
            while(numeroAtual>=0){
                System.out.print("Digite outro número: ");
                numeroAtual = entrada.nextInt();
                if(numeroAtual > maior){
                    maior = numeroAtual;
                }
                if(numeroAtual < menor && numeroAtual >= 0){
                    menor = numeroAtual;
                }
            }
            System.out.println("\nO maior número foi "+maior+" e o menor foi "+menor);
        }


    }
}