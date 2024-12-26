package org.example;

public class OperacoesMatematicas {

    // soma
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        double resultado = a - b;
        return resultado < 0 ? 0 : resultado;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static double potenciacao(double a, double b) {
        return Math.pow(a, b);
    }

}