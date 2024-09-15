package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1016 {

    public static void main(String[] args) {
        final int carroX = 60;
        final int carroY = 90;

        Scanner ler = new Scanner(System.in);

        System.out.printf("Carro X velocidade de: " + carroX + "Km/h\n");
        System.out.printf("Carro Y velocidade de: " + carroY + "Km/h\n");

        System.out.println("Qual a distância em Km entre o carro X e o carro Y?");
        double distancia = ler.nextDouble();

        double tempo = distancia / 2;

        System.out.println("O carro Y tem uma diferença de tempo do carro X de: " + tempo + " minutos");
    }
}
