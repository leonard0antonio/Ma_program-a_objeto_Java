import java.util.Scanner;

public class Questao_04 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        int valor1, valor2, valor3, valor4; //Declaração dos valores

        System.out.println("Digite o primeiro valor: ");
        valor1 = leia.nextInt();

        System.out.println("Digite o segundo Valor: ");
        valor2 = leia.nextInt();

        System.out.println("Digite o terceiro valor: ");
        valor3 = leia.nextInt();

        System.out.println("Digite o quarto valor: ");
        valor4 = leia.nextInt();

        //adição
        System.out.println("\n Resuldatos da adições");
        System.out.println(valor1 + "+" + valor2 + "=" + (valor1 + valor2));
        System.out.println(valor1 + "+" + valor3 + "=" + (valor1 + valor3));
        System.out.println(valor1 + "+" + valor4 + "=" + (valor1 + valor4));
        System.out.println(valor2 + "+" + valor3 + "=" + (valor2 + valor3));
        System.out.println(valor2 + "=" + valor4 + "=" + (valor2 + valor4));
        System.out.println(valor3 + "=" + valor4 + "=" + (valor3 + valor4));

        //Mutiplicação
        System.out.println("\nResultados das multiplicações:");
        System.out.println(valor1 + "*" + valor2 + "=" + (valor1 * valor2));
        System.out.println(valor1 + "*" + valor3 + "=" + (valor1 * valor3));
        System.out.println(valor1 + "*" + valor4 + "=" + (valor1 * valor4));
        System.out.println(valor2 + "*" + valor3 + "=" + (valor2 * valor3));
        System.out.println(valor2 + "*" + valor4 + "=" + (valor2 * valor4));
        System.out.println(valor3 + "*" + valor4 + "=" + (valor3 * valor4));

        leia.close();
    }
}



