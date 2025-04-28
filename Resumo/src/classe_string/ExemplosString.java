package classe_string;

import java.util.Scanner;

public class ExemplosString {
    public static void main(String[] args) {
        //00190500954014481606906809350314337370000000100
        Scanner input = new Scanner(System.in);
        String codBarras, continuar, palavra;
        int tamanhoBarra;
        String resumo = "A Faculdade Conceição oferece muitas oportunidades para o seu crescimento";

        System.out.print("Busque uma palavra: ");
        palavra = input.next();
        //contains -> procura se uma palavra esta contida em um texto
        if (resumo.contains(palavra)){
            System.out.println("A palavra \"" + palavra + "\" esta contida no resumo");
        }

        //To Upper Case -> converte tudo para MAIUSCULO
        if (resumo.toUpperCase().contains(palavra.toUpperCase())){
            System.out.println("A palavra \"" + palavra.toUpperCase() + "\" esta contida no resumo");
        }

        //to lower case -> Converte tudo para minusculo
        if (resumo.toLowerCase().contains(palavra.toLowerCase())){
            System.out.println("A palavra \"" + palavra.toLowerCase() + "\" esta contida no resumo");
        }

        System.out.print("Busque um texto: ");
        input.nextLine();
        palavra = input.nextLine();
        //starts with -> verifica se o texto COMEÇA com uma palavra/palavras específica
        if (resumo.startsWith(palavra)){
            System.out.println("Sucesso!");
        }

        input.nextLine();
        palavra = input.nextLine();
        //ends with -> verifica se o texto TERMINA com uma palavra/palavras específica
        if (resumo.endsWith(palavra)){
            System.out.println("Sucesso!");
        }

        do {
            System.out.println("Digite o código de barras: ");
            codBarras = input.next();

            //lentgh()
            tamanhoBarra = codBarras.length();
            System.out.println("O tamanho da bara foi: " + tamanhoBarra);

            if (tamanhoBarra == 47) {
                System.out.println("É um boleto bancário");
            } else if (tamanhoBarra == 48) {
                System.out.println("É um boleto tributo");
            } else {
                System.out.println("Códio de barras desconhecida");
            }

            String codBanco = codBarras.substring(0, 3);
            //substring(inicio, fim)
            if (codBanco.equals("001")) {
                System.out.println("Boleto do Banco do Brasil");
            } else if (codBanco.equals("336")) {
                System.out.println("Boleto do Banco C6");
            } else if (codBanco.equals("341")) {
                System.out.println("Boleto do Itau");
            } else {
                System.out.println("Banco não cadastrado");
            }

            System.out.print("Deseja Continuar: ");
            continuar = input.next();

            //equals ignore case
        } while (continuar.equalsIgnoreCase("sim"));
    }
}
