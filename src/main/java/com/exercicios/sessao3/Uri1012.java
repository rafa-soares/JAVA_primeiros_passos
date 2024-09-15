package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) {
        final double pi = 3.14159;

        Scanner ler = new Scanner(System.in);

        System.out.println("Forneça os valores de A, B e C: ");

        System.out.print("A= ");
        double valorA = ler.nextDouble();

        System.out.print("B= ");
        double valorB = ler.nextDouble();

        System.out.print("C= ");
        double valorC = ler.nextDouble();

        double areaTrianguloRetangulo = (valorA * valorC) / 2;

        double areaCirculo = pi * Math.pow(valorC, 2);

        double areaTrapezio = ((valorA + valorB)  * valorC) / 2;

        double areaQuadrado = Math.pow(valorB, 2);

        double areaRetangulo = valorA * valorB;

        System.out.println("\n***************** ÁREAS *****************");

        System.out.printf("TRIANGULO RETÂNGULO: %s \n", areaTrianguloRetangulo);

        System.out.printf("CIRCULO: %s \n", areaCirculo);

        System.out.printf("TRAPÉZIO: %s \n", areaTrapezio);

        System.out.printf("QUADRADO: %s \n", areaQuadrado);

        System.out.printf("RETÂNGULO: %s", areaRetangulo);
    }
}
