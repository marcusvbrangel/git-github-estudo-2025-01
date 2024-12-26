package org.example;

public class OperacoesMatematicas {

    // quero criar metodos para as operações matemáticas: soma, subtração, multiplicação e divisão e potenciação
    // soma
    public static int soma(int a, int b) {
        return a + b;
    }

    public static double subtracao(int a, int b) {
        return a - b;
    }

    public static double multiplicacao(int a, int b) {
        return a * b;
    }

    public static double divisao(int a, int b) {
        return a / b;
    }

    public static int potenciacao(int a, int b) {
        return (int) Math.pow(a, b);
    }

}
