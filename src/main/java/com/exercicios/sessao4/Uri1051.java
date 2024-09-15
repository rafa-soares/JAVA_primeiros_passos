package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1051 {

    public static void main(String[] args) {
        double taxa8 = 0;
        double taxa18 = 0;
        double taxa28 = 0;
        double taxaTotal = 0;
        double faixaSalarial08 = 0;
        double faixaSalarial18 = 0;
        double faixaSalarial28 = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o seu salário?");
        float salario = ler.nextFloat();

        calculoIR(salario);
    }

    private static void calculoIR(float salario) {
        double taxa28;
        double taxa18;
        double taxaTotal;
        double taxa8;
        double faixaSalarial18;
        double faixaSalarial28;
        double faixaSalarial08;
        if (salario >= 0 && salario <= 2000) {
            System.out.println("ISENTO");
        } else if (salario >= 2000.01 && salario <= 3000) {
            faixaSalarial08 = salario - 2000.01;
            taxa8 = faixaSalarial08 * 0.08;

            System.out.printf("O valor de Imposto de Renda pago para o salário de R$ %.2f é de R$ %.2f", salario, taxa8);
        } else if (salario >= 3000.01 && salario <= 4500) {
            faixaSalarial18 = salario - 3000.01;
            taxa18 = faixaSalarial18 * 0.18;
            taxa8 = 1000 * 0.08;
            taxaTotal = taxa18 + taxa8;

            System.out.printf("O valor de Imposto de Renda pago para o salário de R$ %.2f é de R$ %.2f", salario, taxaTotal);
        } else if (salario > 4500) {
            faixaSalarial28 = salario - 4500;
            taxa28 = faixaSalarial28 * 0.28;
            faixaSalarial18 = 4500 - 3000.01;
            taxa18 = faixaSalarial18 * 0.18;
            taxa8 = 1000 * 0.08;
            taxaTotal = taxa28 + taxa18 + taxa8;

            System.out.printf("O valor de Imposto de Renda pago para o salário de R$ %.2f é de R$ %.2f", salario, taxaTotal);
        } else {
            System.out.println("Valor de salário incompatível, digite outro valor!");
        }
    }
}
