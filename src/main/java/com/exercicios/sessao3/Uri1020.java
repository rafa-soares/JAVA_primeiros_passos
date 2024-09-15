package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1020 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a idade da pessoa em dias?");
        int dias = ler.nextInt();

        int anos = dias / 365;
        dias %= 365;

        int meses = dias / 30;
        dias %= 60;

        System.out.printf("A idade da pessoa é de: %s anos, %s meses e %s dias", anos, meses, dias);
    }
}
