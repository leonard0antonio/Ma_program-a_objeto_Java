import java.util.Scanner;

public class Questao_05 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = leia.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidade = leia.nextDouble();

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / 12;

        System.out.println("\n Resumo da Viagem:");
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Quantidade de litros utilizados: " + litrosUsados + " litros");

        leia.close();
    }
}
