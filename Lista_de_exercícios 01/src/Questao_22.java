import java.util.Scanner;

public class Questao_22{

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double A=0, B=0, Numero;
      

    		do {
          System.out.print("Digite um número, digite 0 para sair: ");
          Numero = leia.nextDouble();
          if(Numero>0){
            A += Numero;
            System.out.print("Numero armazenado em A\n");
          }else if(Numero < 0){
            B += Numero;
            System.out.print("Numero armazenado em B\n");
          }
          else{
            System.out.print("Você digitou 0, encerrando o programa.\n");
          }
        }while(Numero != 0);
        System.out.printf("A= %2f\nB= %2f\n",A,B);

        leia.close();
	}
}

