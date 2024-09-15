package com.exercicios.sessao5.exerciciosWhile;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        int senha = 0;

        Scanner ler = new Scanner(System.in);

        System.out.print("SENHAS: ");
        senha = ler.nextInt();

        while (senha != 2002) {
            System.out.println("SENHA INVÁLIDA!");

            System.out.print("SENHAS: ");
            senha = ler.nextInt();
        }
        ler.close();

        System.out.println("ACESSO PERMITIDO!");
    }
}
