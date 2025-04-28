import java.util.Scanner;

public class Questao_19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o lado A=");
        a = leia.nextInt();

        System.out.println("Digite o lado B=");
        b = leia.nextInt();

        System.out.println("Digite o lado C=");
        c = leia.nextInt();

        if( a < b + c && b < a + c && c < a + b ){
            if(a==b && b == c){
                System.out.print("O triângulo é Eqüilátero.");
            }else if(a==b || a==c || b==c){
                System.out.print("O triângulo é Isósceles.");
            }else{
                System.out.print("O triângulo é Escaleno.");
            }
        }else{
            System.out.print("Os lados fornecidos não caracterizam um triângulo");
        }
        leia.close();
    }
}

