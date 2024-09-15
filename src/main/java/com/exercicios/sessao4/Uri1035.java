package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int valorA = ler.nextInt();

        System.out.println("Digite o segundo valor");
        int valorB = ler.nextInt();

        System.out.println("Digite o terceiro valor");
        int valorC = ler.nextInt();

        System.out.println("Digite o quarto valor");
        int valorD = ler.nextInt();

        int somaCD = valorC + valorD;

        int somaAB = valorA + valorB;

        int parA = valorA %= 2;

        if(valorB > valorC && valorD > valorA && somaCD > somaAB && valorC > 0  && valorD > 0 && parA == 0) {
            System.out.println("Valores ACEITOS!");
        } else {
            System.out.println("Valores NÃO ACEITOS!");
        }
    }
}
