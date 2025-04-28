package operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        double valor1 = 20, valor2 = 13, total;
        //soma
        total = valor1 + valor2;
        System.out.println("Soma: " + total);
        //subtração
        total = valor1 - valor2;
        System.out.println("Subtração: " + total);
        //multiplicaç~cao
        total = valor1 * valor2;
        System.out.println("Multiplicação: " + total);
        //divisão
        total = valor1 / valor2;
        System.out.printf("Divisão: %.2f", total);
        //resto
        total = valor1 % valor2;
        System.out.println("\nResto: " + total);
    }
}
