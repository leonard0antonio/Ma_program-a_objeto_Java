package basico;

public class PrimeiroPrograma {
    public static void main(String arg[]){
        byte menorNumero = -128;
        byte maiorNumero = 127;
        byte idade;
        boolean achou = true;
        boolean naoAchou = false;
        double salario = 12200.98645;
        char letra = 'a';

        //Imprimindo mensagem de saida na tela
        System.out.println("Segunda linha");
        System.out.print("Primeira linha");
        System.out.println();
        System.out.println("Salario:\t \"" + salario + "\"");
        System.out.printf("Salário %.2f",salario);
        System.out.println();
        System.out.printf("%b", achou);
    }
}
