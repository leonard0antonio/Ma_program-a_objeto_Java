
public class ExemplosVariaveis {
    public static void main(String[] args){
        //Front End
        String valor1, valor2, resultado;

        valor1 = "25";
        valor2 = "15";

        //Backend
        int numero1, numero2, total;
        final double PERCENTAGEM_TAXA = 5.65254;

        numero1 = Integer.parseInt(valor1);
        numero2 = Integer.parseInt(valor2);
        total = numero1 + numero2;

        //FrontEnd
        resultado = String.valueOf(total);

        System.out.println("O primeiro valor foi: " + numero1);
        System.out.println("O segundo valor foi: " + numero2);
        System.out.print("O resultado final foi: " + resultado + "\n");
        System.out.printf("O valor da percentagem é %.3f", PERCENTAGEM_TAXA);
    }
}
