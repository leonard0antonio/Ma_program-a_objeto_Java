package operadores;

public class OperadpresLogicos {
    public static void main(String[] args) {
        int num1 = 77, num2 = 77, num3 = 77;
        boolean resultado;

        // && || !
        resultado = num1 > num2 || num1 > num3;

        System.out.println("resultado: " + !resultado);
    }
}
