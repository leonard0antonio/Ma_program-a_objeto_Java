import java.util.Scanner;

public class Questao_24 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double PrimeiroNumero,SegundoNumero,Resultado;
        int Menu;
        boolean LoopMenu = true;


        System.out.print("Digite o primeiro número: ");
        PrimeiroNumero = leia.nextDouble();

        System.out.print("Digite o segundo número: ");
        SegundoNumero = leia.nextDouble();

        while(LoopMenu){
            System.out.print("\nVocê deseja verificar se...\n\t1 - um dos números lidos é ou não múltiplo do outro\n\t2 - os dois números lidos são pares\n\t3 - a média dos dois números é maior ou igual a 7\n\t4 - Sair\n");
            Menu = leia.nextInt();
            switch(Menu){
                case 1:
                    if(PrimeiroNumero%SegundoNumero==0||SegundoNumero%PrimeiroNumero==0){
                        System.out.println("Sim, um dos números é múltiplo do outro");
                    }else{
                        System.out.println("Não, nenhum dos números é múltiplos do outro");
                    }
                    break;
                case 2:
                    if(PrimeiroNumero%2==0&&SegundoNumero%2==0){
                        System.out.println("Sim, os dois números lidos são pares.");
                    }else{
                        System.out.println("Não, os dois números lidos são ímpares.");
                    }
                    break;
                case 3:
                    if((PrimeiroNumero+SegundoNumero)/2 >= 7){
                        System.out.println("Sim, a média dos dois números é maior ou igual a 7.");
                    }else{
                        System.out.println("Não, a média dos dois números não é maior ou igual a 7.");
                    }
                    break;
                case 4:
                    LoopMenu = false;
                    System.out.print("Saindo...\n");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            leia.close();
        }


    }

}