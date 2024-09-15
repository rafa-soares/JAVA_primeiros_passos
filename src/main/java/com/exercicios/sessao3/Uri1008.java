package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1008 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Deseja calcular o salário de quantos funcionários?");
        int qntFuncionario = read.nextInt();

        System.out.println("Quantas horas cada funcionário trabalha?");
        int horaFuncionario = read.nextInt();

        System.out.println("Qual o valor por hora trabalhada?");
        double valorHora = read.nextDouble();

        double salarioTotalPagar = valorHora * (qntFuncionario * horaFuncionario);

        System.out.println("***************** TOTAL À PAGAR *****************");
        System.out.println("Total funcionários: " + qntFuncionario);
        System.out.printf("Salário total à pagar: %.2f%n", salarioTotalPagar);
    }
}
