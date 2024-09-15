package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1037 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor presente em algum dos intervalos: [0-25] [25-50] [50-75] [75-100]");
        int valorIntervalo = ler.nextInt();

        if (valorIntervalo > 0 && valorIntervalo <= 25) {
            System.out.println("O valor está entre o intervalo [0-25]");
        } else if (valorIntervalo > 25 && valorIntervalo <= 50) {
            System.out.println("O valor está entre o intervalo [25-50]");
        } else if (valorIntervalo > 50 && valorIntervalo <= 75) {
            System.out.println("O valor está entre o intervalo [50-75]");
        } else if (valorIntervalo > 75 && valorIntervalo <= 100) {
            System.out.println("O valor está entre o intervalo [75-100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
