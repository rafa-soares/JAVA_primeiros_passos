package com.exercicios.sessao5.exerciciosFor;

import java.util.Scanner;

public class Uri1067 {
    public static void main(String[] args) {
        int numeroInteiro;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Forneça um número inteiro entre 1 e 1000: ");
            numeroInteiro = ler.nextInt();
        }
        while (numeroInteiro <= 1 || numeroInteiro >= 1000);

        for (int i = 1; i <= numeroInteiro; i++) {
            int modulo = i % 2;
            boolean impares = modulo != 0;

            if (impares){
                System.out.println(i);
            }
        }
    }
}
