public class Operadores {
    public static void main(String[] args) {
        double soma, sub, multi, div, resto;
        boolean igual, maior, menor, maiorIgual, menorIgual;
        boolean verdadeiro, falso, negar;
        int valor = 15;
        int alteraValor = 30;
        double media;
        String situacao;

        soma = 14 + 24;
        sub = 54 - 23;
        multi = 15 * 3;
        div = 45 / 5;
        resto = 17 % 2;

        System.out.println("Op Aritmetico: " + soma
                    + " - " + sub + " - " + multi
                    + " - " + div + " - " + resto);

        igual = 5 == 5;
        maior = 7 > 3;
        menor = 10 < 15;
        maiorIgual = 15 >= 10;
        menorIgual = 25 <= 15;

        System.out.println("Op Relacional: " + igual
                + " - " + maior + " - " + menor
                + " - " + maiorIgual + " - " + menorIgual);

        verdadeiro = maior && menor;
        falso = menorIgual  || maiorIgual;
        negar = !igual;

        System.out.println("Op Logico: " + verdadeiro
                        + " - " + falso + " - " + negar);

        System.out.println("Op Unário");
        System.out.println("valor inicial = " + valor);
        System.out.println("Incremento pre fixado = " + ++valor);
        System.out.println("Incremento pós fixado = " + valor++);
        System.out.println("valor final = " + valor);

        System.out.println("Op Atribuicao");
        alteraValor += 1;
        System.out.println(alteraValor);

        System.out.println("Op Ternario");
        media = 1.0 + 2.0 + 4.0;

        situacao = media >= 7.0 ? "APROVADO" : "REPROVADO";

        System.out.println("Sua media foi = " + media
                + " e você esta " + situacao);
    }
}
