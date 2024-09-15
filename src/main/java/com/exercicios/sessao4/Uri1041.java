package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1041 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da coordenada no eixo X:");
        float eixoX = ler.nextFloat();

        System.out.println("Digite o valor da coordenada no eixo Y:");
        float eixoY = ler.nextFloat();

        validacaoCoordenadas(eixoX, eixoY);
    }

    private static void validacaoCoordenadas(float eixoX, float eixoY) {
        if (eixoX > 0 && eixoY > 0) {
            System.out.printf("\nAs coordenadas (%.2f , %.2f) estão no quadrante Q1 do plano cartesiano", eixoX, eixoY);
        } else if (eixoX < 0 && eixoY < 0) {
            System.out.printf("\nAs coordenadas (%.2f , %.2f) estão no quadrante Q3 do plano cartesiano", eixoX, eixoY);
        } else if (eixoX > 0 && eixoY < 0) {
            System.out.printf("\nAs coordenadas (%.2f , %.2f) estão no quadrante Q4 do plano cartesiano", eixoX, eixoY);
        } else if (eixoX < 0 && eixoY > 0) {
            System.out.printf("\nAs coordenadas (%.2f , %.2f) estão no quadrante Q2 do plano cartesiano", eixoX, eixoY);
        } else if (eixoX > 0 || eixoX < 0 && eixoY == 0) {
            System.out.printf("\nAs coordenadas (%.2f , %s) estão no Eixo Y do plano cartesiano", eixoX, eixoY);
        } else if (eixoX == 0 && eixoY > 0 || eixoY < 0) {
            System.out.printf("\nAs coordenadas (%s , %.2f) estão no Eixo X do plano cartesiano", eixoX, eixoY);
        } else if (eixoX == 0 && eixoY == 0) {
            System.out.printf("\nAs coordenadas (%s , %s) estão na Origem do plano cartesiano", eixoX, eixoY);
        }
    }
}
