package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Forneça os valores de A, B e C: ");

        System.out.print("A= ");
        double valorA = ler.nextDouble();

        System.out.print("B= ");
        double valorB = ler.nextDouble();

        System.out.print("C= ");
        double valorC = ler.nextDouble();

        double maior1 = (valorA + valorB + Math.abs(valorA - valorB)) / 2;
        double maior2 = (maior1 + valorC + Math.abs(maior1 - valorC)) / 2;

        System.out.printf("O maior valor é: %s", maior2);
    }
}
