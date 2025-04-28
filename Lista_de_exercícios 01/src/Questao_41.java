import java.util.Scanner;

public class Questao_41 {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double idade;
        boolean parar = false;
        char letra;
        String categoria;

        do{
            do{
                System.out.print("Digite a idade do nadador: ");
                idade = leia.nextDouble();
                if(idade<5) System.out.println("Idade inválida.");
            }while(idade<5);

            System.out.println();

            if(idade>= 5 && idade< 8) categoria = "Infantil A";
            else if(idade>=8 && idade<12) categoria = "Infantil B";
            else if(idade>=12 && idade<14) categoria = "Juvenil A";
            else if(idade>=14 && idade<18) categoria = "Juvenil B";
            else categoria = "Adultos";


            System.out.println("A categoria é: "+categoria);

            System.out.println("\nDeseja encerrar o programa? (s/N) ");
            letra = leia.next().charAt(0);
            if(letra == 's' || letra == 'S'){
                parar = true;
            }

        }while(parar==false);

    }
}