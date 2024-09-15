package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        final double comissao = 0.15;

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o nome do(a) vendedor(a)? ");
        String nome = ler.next().toString();

        System.out.println("Qual o salário fixo do(a) vendedor(a)?");
        double salarioFixo = ler.nextDouble();

        System.out.printf("Qual o montante total de vendas que o(a) vendedor(a) %s efetuou? \n", nome);
        double montanteVendas = ler.nextDouble();

        double salarioTotal = salarioFixo + (comissao * montanteVendas);

        System.out.printf("O salário total no mês do funcionário %s é igual a %s", nome, salarioTotal);
    }
}
