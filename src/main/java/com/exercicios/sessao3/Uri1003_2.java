package com.exercicios.sessao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1003_2 {

    public static void main(String[] args) {
        int ordemNumero = 0;
        Double soma = 0.0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite quantos números serão somados: ");
        int qntNumeros = ler.nextInt();

        List <Double> listaValorNumeros = new ArrayList<>();

        for (int i = 0; i < qntNumeros; i++) {
            ordemNumero += 1;
            System.out.println("Digite o " + ordemNumero + "º número: ");
            double valorNumero = ler.nextDouble();

            listaValorNumeros.add(valorNumero);
        }

        System.out.println("\nOs números somados são: " + listaValorNumeros);

        for (Double valor : listaValorNumeros) {
            soma += valor;
        }

        System.out.printf("Soma dos números: %.2f%n", soma);
    }
}
