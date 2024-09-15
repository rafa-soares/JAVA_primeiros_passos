package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1045 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do lado A do triangulo");
        float ladoA = ler.nextFloat();

        System.out.println("Digite o valor do lado B do triangulo");
        float ladoB = ler.nextFloat();

        System.out.println("Digite o valor do lado C do triangulo");
        float ladoC = ler.nextFloat();

        boolean trianduoInvalido = ladoA >= (ladoB + ladoC);

        boolean trianguloRetangulo = Math.pow(ladoA, 2) == Math.pow(ladoB, 2) + Math.pow(ladoC, 2);

        boolean trianguloObtuso = Math.pow(ladoA, 2) > Math.pow(ladoB, 2) + Math.pow(ladoC, 2);

        boolean trianguloAcutangulo = Math.pow(ladoA, 2) < Math.pow(ladoB, 2) + Math.pow(ladoC, 2);

        boolean trianguloEquilatero = ladoA == ladoB || ladoA == ladoC;

        boolean trianguloIsosceles = ladoA == ladoB || ladoA == ladoC || ladoB == ladoC;

        boolean validacaoLados = ladoA >= 0 && ladoB >= 0 && ladoC >= 0;

        validacaoTriangulos(trianduoInvalido, trianguloRetangulo, trianguloObtuso, trianguloAcutangulo, trianguloEquilatero, trianguloIsosceles, validacaoLados);
    }

    private static void validacaoTriangulos(boolean trianduoInvalido, boolean trianguloRetangulo, boolean trianguloObtuso, boolean trianguloAcutangulo, boolean trianguloEquilatero, boolean trianguloIsosceles, boolean validacaoLados) {
        if (trianguloRetangulo && validacaoLados) {
            System.out.printf("TRIANGULO RETANGULO!");
        } else if (trianduoInvalido && validacaoLados) {
            System.out.printf("NAO FORMA TRIANGULO!");
        } else if (trianguloObtuso && validacaoLados) {
            System.out.printf("TRIANGULO OBTUSANGULO!");
        } else if (trianguloAcutangulo && validacaoLados) {
            System.out.printf("TRIANGULO ACUTANGULO!");
        } else if (trianguloEquilatero && validacaoLados) {
            System.out.printf("TRIANGULO EQUILATERO!");
        } else if (trianguloIsosceles && validacaoLados) {
            System.out.printf("TRIANGULO ISOSCELES!");
        }
    }
}
