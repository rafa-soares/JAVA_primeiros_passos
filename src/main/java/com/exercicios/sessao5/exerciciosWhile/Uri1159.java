package com.exercicios.sessao5.exerciciosWhile;

import java.util.Scanner;

public class Uri1159 {
    public static void main(String[] args) {
        int somaPares;
        int numeroInteiro;

        Scanner ler = new Scanner(System.in);

        System.out.println("Forneça um número inteiro: ");
        numeroInteiro = ler.nextInt();

        while (numeroInteiro != 0){
            if (numeroInteiro % 2 == 0){
                somaPares = numeroInteiro + (numeroInteiro + 2) + (numeroInteiro + 4) + (numeroInteiro + 6) + (numeroInteiro + 8);

                System.out.printf("O resultado da operação com o inteiro %s é igual a: %s\n", numeroInteiro, somaPares);

                System.out.println("\nForneça um número inteiro: ");
                numeroInteiro = ler.nextInt();
            } else {
                somaPares = (numeroInteiro + 1) + (numeroInteiro + 3) + (numeroInteiro + 5) + (numeroInteiro + 7) + (numeroInteiro + 9);

                System.out.printf("O resultado da operação com o inteiro %s é igual a: %s\n", numeroInteiro, somaPares);

                System.out.println("\nForneça um número inteiro: ");
                numeroInteiro = ler.nextInt();
            }
        }
    }
}
