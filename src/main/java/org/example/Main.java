package org.example;

public class Main {

    public static void main(final String... args) {

        int resultadoSoma = OperacoesMatematicas.soma(1, 4);
        System.out.println(resultadoSoma);

        double resultadoSubtracao = OperacoesMatematicas.subtracao(1, 4);
        System.out.println(resultadoSubtracao);

        double resultadoMultiplicacao = OperacoesMatematicas.multiplicacao(2, 4);
        System.out.println(resultadoMultiplicacao);

        double resultadoDivisao = OperacoesMatematicas.divisao(7, 2);
        System.out.println(resultadoDivisao);

        int resultadoPotenciacao = OperacoesMatematicas.potenciacao(2, 3);
        System.out.println(resultadoPotenciacao);

    }
}