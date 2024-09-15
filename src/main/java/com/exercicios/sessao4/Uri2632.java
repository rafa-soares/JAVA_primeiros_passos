package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri2632 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quais as dimensões do território inimigo?");

        System.out.print("LARGURA: ");
        int larguraTerritorio = ler.nextInt();

        System.out.print("ALTURA: ");
        int alturaTerritorio = ler.nextInt();

        System.out.println("Quais coordenadas X e Y do território inimigo?");

        System.out.print("X: ");
        int territorioCoordenadaX = ler.nextInt();

        System.out.print("Y: ");
        int territorioCoordenadaY = ler.nextInt();

        System.out.println("\n");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|                       MAGIAS                       |");
        System.out.println("+----------------------------------------------------+");
        System.out.println(
            "|  MAGIAS  |  DANO  |  LEVEL1  |  LEVEL2  |  LEVEL3  |\n" +
                "|  Fire    |  200   |    20    |    30    |    50    |\n" +
                "|  Water   |  300   |    10    |    25    |    40    |\n" +
                "|  Earth   |  400   |    25    |    55    |    70    |\n" +
                "|  Air     |  100   |    18    |    38    |    60    |"
        );
        System.out.println("+----------------------------------------------------+");

        System.out.println("Qual magia deseja utilizar?");
        String magia = ler.next();

        System.out.printf("Qual o nível de alcance da magia %s?\n", magia);
        int magiaNivel = ler.nextInt();

        System.out.println("Quais as coordenada X e Y do lançamento da magia?");

        System.out.print("X: ");
        int magiaCoordenadaX = ler.nextInt();

        System.out.print("Y: ");
        int magiaCoordenadaY = ler.nextInt();

        int territorioInimigoEixoX = territorioCoordenadaX + larguraTerritorio;

        int territorioInimigoEixoY = territorioCoordenadaY + alturaTerritorio;

        int raioMinimoEixoX = magiaCoordenadaX - magiaNivel;

        int raioMinimoEixoY = magiaCoordenadaY - magiaNivel;

        int raioMaximoEixoX = magiaCoordenadaX + magiaNivel;

        int raioMaximoEixoY = magiaCoordenadaY + magiaNivel;

        boolean territorioInimigoAtingido = territorioInimigoEixoX >= raioMinimoEixoX && territorioInimigoEixoX <= raioMaximoEixoX &&
            territorioInimigoEixoY >= raioMinimoEixoY && territorioInimigoEixoY <= raioMaximoEixoY;

        boolean territorioInimigoNaoAtingido = territorioInimigoEixoX < raioMinimoEixoX || territorioInimigoEixoX > raioMaximoEixoX &&
            territorioInimigoEixoY < raioMinimoEixoY  || territorioInimigoEixoY > raioMaximoEixoY;

        validacaoAtaque(magia, territorioInimigoAtingido, territorioInimigoNaoAtingido);
    }

    private static void validacaoAtaque(String magia, boolean territorioInimigoAtingido, boolean territorioInimigoNaoAtingido) {
        if (magia.equals("Fire") && territorioInimigoAtingido) {
            System.out.printf("\nO território inimigo foi atingido pela magia %s e sofreu um dano de 200 pontos", magia);

        } else if (magia.equals("Water") && territorioInimigoAtingido) {
            System.out.printf("\nO território inimigo foi atingido pela magia %s e sofreu um dano de 300 pontos", magia);

        } else if (magia.equals("Earth") && territorioInimigoAtingido) {
        System.out.printf("\nO território inimigo foi atingido pela magia %s e sofreu um dano de 400 pontos", magia);

        } else if (magia.equals("Air") && territorioInimigoAtingido) {
            System.out.printf("\nO território inimigo foi atingido pela magia %s e sofreu um dano de 100 pontos", magia);

        } else if (territorioInimigoNaoAtingido) {
            System.out.printf("\nO território inimigo não foi atingido pela magia %s!", magia);

        } else {
            System.out.println("\nEssa magia não existe!!");
        }
    }
}
