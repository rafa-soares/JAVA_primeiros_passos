package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o valor da nota?");
        int valorNota = ler.nextInt();

        while (valorNota < 0 || valorNota > 1000000) {
            System.out.println("Digite um valor da nota maior que R$ 0,00 e menor que R$ 1.000.000,00");
            valorNota = ler.nextInt();
        }

        int centena = valorNota / 100;
        valorNota %= 100;

        int dezena50 = valorNota / 50;
        valorNota %= 50;

        int dezena20 = valorNota / 20;
        valorNota %= 20;

        int dezena10 = valorNota / 10;
        valorNota %= 10;

        int unidade05 = valorNota / 5;
        valorNota %= 5;

        int unidade02 = valorNota / 2;
        valorNota %= 2;

        int unidade01 = valorNota / 1;
        valorNota %= 1;

        System.out.printf("A quantidade mínima de notas de cada tipo necessárias para compor R$ %s é igual a:", valorNota);

        System.out.printf("\n%s nota(s) de R$ 100,00", centena);
        System.out.printf("\n%s nota(s) de R$ 50,00", dezena50);
        System.out.printf("\n%s nota(s) de R$ 20,00", dezena20);
        System.out.printf("\n%s nota(s) de R$ 10,00", dezena10);
        System.out.printf("\n%s nota(s) de R$ 5,00", unidade05);
        System.out.printf("\n%s nota(s) de R$ 2,00", unidade02);
        System.out.printf("\n%s nota(s) de R$ 1,00", unidade01);
    }
}
