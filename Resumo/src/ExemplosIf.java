import java.util.Scanner;

public class ExemplosIf {
    /*
    crie um programa que calcule o salario de um
    funcionario e caso o valor da vendas for maior
    que 150 o funcionario ganha um bonus de R$50,00
    Se o funcionario for operario o salario inicial
    é 1200,00 se for administrativo o salário é de
    1800,00
     */
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        String cargo;
        double salarioInicial, salarioFinal;
        final double BONUS = 50.0;
        int totalVendas;

        System.out.print("Digite o cargo do funcionario: ");
        cargo = escreva.next();

        System.out.print("Digite o total de vendas: ");
        totalVendas = escreva.nextInt();

        if (cargo.equals("operario")){
            salarioInicial = 1200.00;
        } else if (cargo.equals("administrativo")){
            salarioInicial = 1800.00;
        } else {
            salarioInicial = 0.00;
        }

        if (totalVendas > 150){
            salarioFinal = salarioInicial + BONUS;
        } else {
            salarioFinal = salarioInicial;
        }

        System.out.println("O salario final do " + cargo
                + " é R$ " + salarioFinal);
    }
}
