package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1044 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int valorA = ler.nextInt();

        System.out.println("Digite o segundo valor");
        int valorB = ler.nextInt();

        valorA %= valorB;

        valorB %= valorA;

        if (valorA == 0 || valorA == 0) {
            System.out.println("Os valores são multiplos entre si");
        } else {
            System.out.println("Os valores não são multiplos entre si");
        }
    }
}
