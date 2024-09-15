package com.exercicios.sessao5.exerciciosFor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI1072 {
    public static void main(String[] args) {
        int quantidadeNumeros;
        int valorOrdem = 0;
        int valor = 0;
        List<Integer> listaValores = new ArrayList<>();

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Quantos números inteiros (N) serão lidos?");
            System.out.print("N= ");
            quantidadeNumeros = ler.nextInt();
        } while (quantidadeNumeros < 0 || quantidadeNumeros > 1000);

        for (int i = 0; i < quantidadeNumeros; i++) {
            valorOrdem += 1;
            System.out.printf("Forneça o valor %s: ", valorOrdem);
            valor = ler.nextInt();

            listaValores.add(valor);
        }

        for (int valores : listaValores) {
            if (valores >= 10 && valores <= 20) {
                System.out.printf("\nO valor %s está DENTRO do intervalo\n", valores);
            } else {
                System.out.printf("\nO valor %s está FORA do intervalo", valores);
            }
        }
    }
}
