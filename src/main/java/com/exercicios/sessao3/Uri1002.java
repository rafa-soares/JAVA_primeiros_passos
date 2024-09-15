package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1002 {

    public static void main(String[] args) {
        final double pi = 3.14159;

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor do raio da circunferência: ");
        double raio = read.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("Área da circunferência é igual a: %.4f%n", area);
    }
}
