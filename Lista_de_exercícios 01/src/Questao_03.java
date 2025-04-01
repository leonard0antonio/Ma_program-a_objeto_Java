import java.util.Scanner;

public class Questao_03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        System.out.print("Digite a identificação do vendedor: ");
        String identificacaoVendedor = leia.nextLine();


        System.out.println("Digite o codido da peca");
        int codigoPeca = leia.nextInt();


        System.out.println("digite o preco unitario da peca");
        double precoUnitario = leia.nextDouble();


        System.out.println("digite a quantidade vendida");
        double quantidadeVendida = leia.nextDouble();

        //operação da questão
        double total_comissao = precoUnitario * quantidadeVendida;
        double comissao = 0.05 * total_comissao;

        System.out.println("A comissao sera: " + comissao);

        leia.close();
    }
}