package basico;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, endereco;
        double salario;
        boolean existe;

        System.out.print("Digite seu nome: ");
        nome = input.next();
        input.nextLine();
        System.out.print("Digite seu endereço: ");
        endereco = input.nextLine();
        System.out.print("Digite seu salario: ");
        salario = input.nextDouble();
        System.out.print("Voce existe?: ");
        existe = input.nextBoolean();

        System.out.println("meu nome é " + nome + " moro em: "
                        + endereco + ", meu salario é R$" + salario
                        + " existo?: " + existe);
    }
}
