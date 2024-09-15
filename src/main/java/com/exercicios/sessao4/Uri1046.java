package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual horário de início do evento?");
        int hora1 = ler.nextInt();

        System.out.println("Qual horário de encerramento do evento?");
        int hora2 = ler.nextInt();

        double duracaoEventoMesmoDia = Math.abs(hora1 - hora2);

        double duracaoEventoDiaSeguinte = 24 - (hora1 - hora2);

        if (hora1 < hora2) {
            System.out.printf("O evento terminou no mesmo dia e teve duração de %s hora(s)", duracaoEventoMesmoDia);
        } else {
            System.out.printf("O evento terminou no dia seguinte e teve duração de %s hora(s)", duracaoEventoDiaSeguinte);
        }
    }
}
