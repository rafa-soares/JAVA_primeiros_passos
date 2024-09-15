package com.exercicios.sessao5.exerciciosWhile;

import java.util.Scanner;

public class Uri1154 {
    public static void main(String[] args) {
        int pessoaOrdem = 1;
        int idadeSoma = 0;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Qual a idade da pessoa %s?\n", pessoaOrdem);
        int pessoaIdade = ler.nextInt();

        while (pessoaIdade >= 0){
            pessoaOrdem += 1;
            idadeSoma += pessoaIdade;

            System.out.printf("\nQual a idade da pessoa %s?\n", pessoaOrdem);
            pessoaIdade = ler.nextInt();
        }

        int idadeMedia = idadeSoma / (pessoaOrdem - 1);

        System.out.printf("\nA média da(s) idade(s) é igual a: %s", idadeMedia);

    }
}
