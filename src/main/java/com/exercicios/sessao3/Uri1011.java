package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        final double pi = 3.14159;

        Scanner ler = new Scanner(System.in);

        System.out.println("Para calcular o volume de uma esfera informe o seu raio: ");
        double raio = ler.nextDouble();

        double volume = (4.0/3) * pi * raio;

        System.out.printf("O volume da esfera é igual a: %.3f%n", volume);
    }
}
