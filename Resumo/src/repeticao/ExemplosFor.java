package repeticao;

import java.util.Scanner;

public class ExemplosFor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor;

        System.out.println("Quantas vezes deseja repetir?");
        valor = leia.nextInt();

        for (int i = 1; i <= valor; i++){
            System.out.println("Repetindo: " + i);
        }

        for (int i = valor; i >0; i--){
            System.out.println("Repetindo decremento: " + i);
        }
    }
}
