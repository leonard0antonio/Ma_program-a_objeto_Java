import java.util.Scanner;

public class Questao_25 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double Altura,PesoIdeal;
        char Sexo='n';

        System.out.print("Digite sua altura (em metros): ");
        Altura = leia.nextDouble();

        while(Sexo !='m' && Sexo !='M' && Sexo !='h' && Sexo !='H'){

            System.out.print("Digite H ou M para especificar o sexo: "); // o/
            Sexo = leia.next(".").charAt(0);

            switch(Sexo){
                case 'h':
                case 'H':
                    PesoIdeal = ( 72.7* Altura ) - 58;
                    System.out.println("Seu peso ideal é de: "+PesoIdeal+" kg.");
                    break;
                case 'm':
                case 'M':
                    PesoIdeal = ( 62.1 * Altura ) - 44.7;
                    System.out.println("Seu peso ideal é de: "+PesoIdeal+" kg.");
                    break;
                default:
                    System.out.println("Não é M");
            }

            leia.close();
        }
    }

}
