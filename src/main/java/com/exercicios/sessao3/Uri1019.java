package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a duração do evento em segundos?");
        int segundos = ler.nextInt();

        int horas = segundos / 3600;
        segundos %= 3600;

        int minutos = segundos / 60;
        segundos %= 60;

        System.out.printf("A duração do evento foi de: %s:%s:%s", horas, minutos, segundos);
    }
}
