package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1048 {

    public static void main(String[] args) {
        double reajuste;
        double salarioNovo;
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o salário do funcionário");
        float salario = ler.nextFloat();;

        calculoSalario(salario);
    }

    private static void calculoSalario(float salario) {
        double salarioNovo;
        double reajuste;
        if (salario > 0 && salario < 400) {
            reajuste = salario * 0.15;
            salarioNovo = reajuste + salario;

            print(reajuste, salarioNovo, salario);
        } else if (salario > 400.01 && salario < 800) {
            reajuste = salario * 0.12;
            salarioNovo = reajuste + salario;

            print(reajuste, salarioNovo, salario);
        } else if (salario > 800.01 && salario < 1200) {
            reajuste = salario * 0.10;
            salarioNovo = reajuste + salario;

            print(reajuste, salarioNovo, salario);
        } else if (salario > 1200.01 && salario <= 2000) {
            reajuste = salario * 0.07;
            salarioNovo = reajuste + salario;

            print(reajuste, salarioNovo, salario);
        } else if (salario > 2000) {
            reajuste = salario * 0.04;
            salarioNovo = reajuste + salario;

            print(reajuste, salarioNovo, salario);
        }
    }

    private static void print(double reajuste, double salarioNovo, float salario) {
        System.out.printf("Salário = %s", salario);
        System.out.printf("\nReajuste = %s", reajuste);
        System.out.printf("\nSalário atual = %s", salarioNovo);
    }
}
