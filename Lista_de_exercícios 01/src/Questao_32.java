import java.util.Scanner;

public class Questao_32 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int Numero,NumeroQuadrado,Resultado=0;

        do{
            System.out.print("Digite um número maior que 0 e menor que 10: ");
            Numero = leia.nextInt();
        }while(Numero<=0||Numero>=10);

        for(int x = Numero;x < 40+Numero;x++){
            if(x%2==1){
                Resultado += x*x;
            }
        }
        System.out.println("O resultado da soma dos quadrados dos 20 primeiros números inteiros positivos ímpares a partir do número informado é: "+Resultado);
        leia.close();
    }
}
