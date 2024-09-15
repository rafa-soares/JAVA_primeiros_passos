package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1004 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o valor de  A = " );
        int a = read.nextInt();

        System.out.print("Digite o valor de  B = " );
        int b = read.nextInt();

        int prod = a * b;

        System.out.println("PROD = " + prod);
    }
}
