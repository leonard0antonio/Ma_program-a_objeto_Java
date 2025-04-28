import java.util.Scanner;

public class Questao_23 {
  public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double PrimeiroNumero,SegundoNumero,Resultado;
		int Menu;
      	System.out.print("Menu Calculadora\n\n"); 
		
		
		System.out.print("Digite uma das operações a seguir:\n\t1 - Adição\n\t2 - Subtração\n\t3 - Multiplicação\n\t4 - Divisão\n");
		Menu = leia.nextInt();
		
		
		System.out.print("Digite o primeiro número: ");
		PrimeiroNumero = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		SegundoNumero = leia.nextDouble();
		
		
		switch(Menu){
			case 1:
				Resultado = PrimeiroNumero + SegundoNumero;
				System.out.printf("%.2f + %.2f = %.2f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			case 2:
				Resultado = PrimeiroNumero - SegundoNumero;
				System.out.printf("%.2f - %.2f = %.2f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			case 3:
				Resultado = PrimeiroNumero * SegundoNumero;
				System.out.printf("%.2f * %.2f = %.2f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			case 4:
				Resultado = PrimeiroNumero / SegundoNumero;
				System.out.printf("%.2f / %.2f = %.2f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			default:
				System.out.print("Opção inválida!");
		}
    leia.close();
  }
}
