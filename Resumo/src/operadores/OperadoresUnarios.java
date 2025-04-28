package operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 33;

        System.out.println("valor inicial: " + numero);
        System.out.println("valor pre: " + --numero);  //pre-fixado
        System.out.println("valor pos: " + numero--);     //pos-fixado
        System.out.println("valor Final: " + numero);
    }
}
