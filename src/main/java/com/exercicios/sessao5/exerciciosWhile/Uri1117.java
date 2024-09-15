package com.exercicios.sessao5.exerciciosWhile;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Forneça a nota da avaliações do aluno:");

        System.out.print("\nNOTA 1: ");
        float nota1 = ler.nextFloat();

        while (nota1 < 0 || nota1 > 10){
            System.out.println("NOTA INVÁLIDA!");

            System.out.print("\nNOTA 1: ");
            nota1 = ler.nextFloat();
        }

        System.out.print("NOTA 2: ");
        float nota2 = ler.nextFloat();

        while (nota2 < 0 || nota2 > 10){
            System.out.println("NOTA INVÁLIDA!");

            System.out.print("\nNOTA 2: ");
            nota2 = ler.nextFloat();
        }
        ler.close();

        float media = (nota1 + nota2) / 2;

        System.out.printf("\nA média do aluno é: %.2f", media);
    }
}
