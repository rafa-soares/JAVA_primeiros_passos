package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1021 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o valor da nota?");
        double valorDinheiro = ler.nextInt();

        while (valorDinheiro < 0 || valorDinheiro > 1000000) {
            System.out.println("Digite um valor da nota maior que R$ 0,00 e menor que R$ 1.000.000,00");
            valorDinheiro = ler.nextInt();
        }

        int centena = (int) valorDinheiro / 100;
        valorDinheiro %= 100;

        int dezena50 = (int) valorDinheiro / 50;
        valorDinheiro %= 50;

        int dezena20 = (int) valorDinheiro / 20;
        valorDinheiro %= 20;

        int dezena10 = (int) valorDinheiro / 10;
        valorDinheiro %= 10;

        int unidade05 = (int) valorDinheiro / 5;
        valorDinheiro %= 5;

        int unidade02 = (int) valorDinheiro / 2;
        valorDinheiro %= 2;

        int unidadeMoeda01 = (int) valorDinheiro / 1;
        valorDinheiro %= 1;

        double moeda50 = valorDinheiro / 2;
        valorDinheiro %= 2;

        double moeda25 = valorDinheiro / 4;
        valorDinheiro %= 4;

        double moeda10 = valorDinheiro / 10;
        valorDinheiro %= 10;

//        double moeda05 = valorDinheiro / 5;
//        valorDinheiro %= ;
//
//        double moeda01 = valorDinheiro / 100;
//        valorDinheiro %= 1;

        System.out.printf("A quantidade mínima de notas de cada tipo necessárias para compor R$ %s,00 é igual a:", valorDinheiro);

        System.out.printf("\n%s nota(s) de R$ 100,00", centena);
        System.out.printf("\n%s nota(s) de R$ 50,00", dezena50);
        System.out.printf("\n%s nota(s) de R$ 20,00", dezena20);
        System.out.printf("\n%s nota(s) de R$ 10,00", dezena10);
        System.out.printf("\n%s nota(s) de R$ 5,00", unidade05);
        System.out.printf("\n%s nota(s) de R$ 2,00", unidade02);
        System.out.printf("\n%s moeda(s) de R$ 1,00", unidadeMoeda01);
        System.out.printf("\n%s moeda(s) de R$ 0,50", moeda50);
        System.out.printf("\n%s moeda(s) de R$ 0,25", moeda25);
        System.out.printf("\n%s moeda(s) de R$ 0,10", moeda10);
    }
}
