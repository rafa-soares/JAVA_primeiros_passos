package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1010 {

    public static void main(String[] args) {
        int pecasQtd;
        int ordemPeca = 0;
        double valorUnitario = 0.0;
        double valorTotalPeca = 0.0;
        double valorTotalCompra = 0.0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o total de peças que deseja comprar?");
        pecasQtd = ler.nextInt();

        int[] listaPecas = new int[pecasQtd];

        for (int i = 0; i < listaPecas.length; i++) {
            ordemPeca += 1;

            System.out.println("Deseja comprar quantas peças id 0.0.0.0" + ordemPeca + "?");
            pecasQtd = ler.nextInt();

            System.out.println("Digite o valor unitário da peça id 0.0.0.0" + ordemPeca);
            valorUnitario = ler.nextDouble();

            valorTotalPeca = pecasQtd * valorUnitario;

            valorTotalCompra += valorTotalPeca;

            System.out.println("******************* RELATÓRIO DE COMPRA *******************");
            System.out.println("Peça id 0.0.0.0" + ordemPeca);
            System.out.println("Valor unitário: ............................................... " + valorUnitario);
            System.out.println("Valor total: .................................................... " + valorTotalPeca);
            System.out.println("VALOR TOTAL DA COMPRA: ........................... " + valorTotalCompra + "\n");
        }
    }
}
