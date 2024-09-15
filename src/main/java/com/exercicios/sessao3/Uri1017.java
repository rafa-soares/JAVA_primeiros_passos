package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1017 {
    public static void main(String[] args) {
        final int consumoLitro = 12;

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o tempo gasto na viagem?");
        double tempo = ler.nextDouble();

        System.out.println("Qual a velocidade média do veículo durante a viagem?");
        double velocidadeMedia = ler.nextDouble();

        double distancia = tempo * velocidadeMedia;

        double consumoTotal = distancia / consumoLitro;

        System.out.println("No percurso de " + distancia + " Km são necessários " + consumoTotal + " litros de combustível");
    }


}
