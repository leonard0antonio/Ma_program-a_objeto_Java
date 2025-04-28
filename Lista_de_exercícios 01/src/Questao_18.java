import java.util.Scanner;

public class Questao_18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int CODIGO;

        System.out.println("Digite o codigo: ");
        CODIGO = leia.nextInt();

        switch(CODIGO){
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            default:
                System.out.println("Código inválido");
        }
        leia.close();
    }
}
