package com.exercicios.sessao5.exerciciosWhile;

import java.util.Scanner;

public class Uri1134_main {
    public static void main(String[] args) {
        Uri1134 uri11342 = new Uri1134();
        while (uri11342.isContinuarAbastecimento()) {
            Scanner ler = new Scanner(System.in);

            uri11342.escolherCombustivel1();

            System.out.println("\nEscolha o tipo de combustível que deseja abastecer e forneça o código: ");
            int codigoCombustivel = ler.nextInt();

            uri11342.combustiveis(codigoCombustivel);

            if (codigoCombustivel == 4){
                uri11342.resultadoAbastecimento();
                uri11342.setContinuarAbastecimento(false);
            }
        }
    }
}