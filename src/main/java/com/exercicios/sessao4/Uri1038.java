package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1038 {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------" + "\n" +
            "               CARDÁPIO" + "\n" +
            "-----------------------------------------" + "\n" +
            "[1] Cachorro Quente ............... R$ 4,00" + "\n" +
            "[2] X-Salada ...................... R$ 4,50" + "\n" +
            "[3] X-Bacon ....................... R$ 5,00" + "\n" +
            "[4] Torrada Simples ............... R$ 2,00" + "\n" +
            "[5] Refrigerante .................. R$ 1,50" + "\n" +
            "-----------------------------------------");
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha no cardápio um item e envie o código:");
        int codigoItem = ler.nextInt();

        System.out.println("Qual a quandidade do item?");
        int quantidade = ler.nextInt();

        menu(codigoItem, quantidade);
    }

    private static void menu(int codigoItem, int quantidade) {
        switch (codigoItem) {
            case 1:
                double cachorroQuente = 4.00;
                double valorItem1 = cachorroQuente * quantidade;

                System.out.printf("O valor total do pedido é R$ %.2f", valorItem1);
                break;
            case 2:
                double xSalada = 4.50;
                double valorItem2 = xSalada * quantidade;

                System.out.printf("O valor total do pedido é R$ %.2f", valorItem2);
                break;
            case  3:
                double xBacon = 5.00;
                double valorItem3 = xBacon * quantidade;

                System.out.printf("O valor total do pedido é R$ %.2f", valorItem3);
                break;
            case 4:
                double torradaSimples = 2.00;
                double valorItem4 = torradaSimples * quantidade;

                System.out.printf("O valor total do pedido é R$ %.2f", valorItem4);
                break;
            case 5:
                double refrigerante = 1.50;
                double valorItem5 = refrigerante * quantidade;

                System.out.printf("O valor total do pedido é R$ %.2f", valorItem5);
                break;
            default:
                System.out.println("Esse item não consta no cardápio");
        }
    }
}
