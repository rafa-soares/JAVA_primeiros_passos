package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a distância do trajeto em KM? ");
        double distancia = ler.nextDouble();

        System.out.println("Qual o total de combustível gasto em litros? ");
        double combustivel = ler.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.printf("O consumo médio do automóvel foi de: %.1f%n KM/L", consumoMedio);
    }
}
