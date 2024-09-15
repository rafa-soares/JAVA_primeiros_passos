package com.exercicios.sessao5.exerciciosWhile;

import java.util.Scanner;

public class Uri1118 {
    public static void main(String[] args) {
        int calculoNotaSim_Nao = 1;

        Scanner ler = new Scanner(System.in);

        while (calculoNotaSim_Nao != 2) {
            System.out.println("Forneça a primeira nota do aluno: ");
            System.out.print("NOTA 1: ");
            int nota1 = ler.nextInt();
            boolean nota1Validacao = nota1 >= 0 && nota1 <= 10;

            if (!nota1Validacao) {
                System.out.println("\nNota(s) invádia(s)! Forneça notas entre 0 e 10");
                continue;
            }

            System.out.println("\nForneça a segunda nota do aluno: ");
            System.out.print("NOTA 2: ");
            int nota2 = ler.nextInt();
            boolean nota2Validacao = nota2 >= 0 && nota2 <= 10;

            if (!nota2Validacao) {
                System.out.println("\nNota(s) invádia(s)! Forneça notas entre 0 e 10");
                continue;
            }
            mediaNotas(nota1, nota2);

            System.out.println("\nDeseja realizar um novo cálculo de média? ");
            System.out.println("1- SIM");
            System.out.println("2- NÃO");

            calculoNotaSim_Nao = ler.nextInt();
        }
    }

    private static void mediaNotas(int nota1, int nota2) {
        int media = (nota1 + nota2) / 2;
        System.out.printf("\nA média do aluno é: %s\n", media);
    }
}
