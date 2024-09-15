package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1007 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o valor de  A = " );
        int a = read.nextInt();

        System.out.print("Digite o valor de  B = " );
        int b = read.nextInt();

        System.out.print("Digite o valor de  C = " );
        int c = read.nextInt();

        System.out.print("Digite o valor de  D = " );
        int d = read.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("DIFERENÇA = " + diferenca);
    }
}
