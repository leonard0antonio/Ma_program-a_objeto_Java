
public class Questao_43 {


    public static void main(String[] args) {

        double graosCasa=1,casasTabuleiro=64;
        int graos=1;

        for(int x=1;x<casasTabuleiro;x++){
            graosCasa = graosCasa*2;
            graos +=graosCasa;
        }

        System.out.printf("\nA quantidade de grãos é: %,d\n", graos);

    }
}