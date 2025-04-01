import java.util.Scanner;

public class Questao_09 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = leia.nextInt();

        System.out.print("Digite os meses: ");
        int meses = leia.nextInt();

        System.out.print("Digite os dias: ");
        int dias = leia.nextInt();


        int idade = (anos * 365) + (meses * 30) + dias;


        System.out.println("Sua idade expressa em dias é: " + idade + " dias");

        leia.close();
    }
}

