package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1047 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a hora e o(s) minutos do início do evento?");
        System.out.printf("Hora: ");
        int horaInicial = ler.nextInt();

        System.out.printf("Minutos: ");
        int minutoInicial = ler.nextInt();

        System.out.println("Qual a hora e o(s) minutos do encerramento do evento?");
        System.out.printf("Hora: ");
        int horaFinal = ler.nextInt();

        System.out.printf("Minutos: ");
        int minutoFinal = ler.nextInt();

        int horaIncompleta = (horaFinal - horaInicial) - 1;

        int horasMesmoDia = (horaFinal - horaInicial);

        int horasDiaSeguinte = 24 - (horaInicial - horaFinal);

        int minutosHoraIncompleta= (60 - minutoInicial) + minutoFinal;

        int minutosHoraCompleta = minutoFinal - minutoInicial;

        if (horaInicial < horaFinal && minutoInicial < minutoFinal) {
            System.out.printf("O evento terminou no mesmo dia e teve duração de %s hora(s) e %s minutos", horasMesmoDia, minutosHoraCompleta);
        } else if (horaInicial < horaFinal && minutosHoraIncompleta <= 59) {
            System.out.printf("O evento terminou no mesmo dia e teve duração de %s hora(s) e %s minutos", horaIncompleta, minutosHoraIncompleta);
        } else if (horaInicial > horaFinal && minutoInicial < minutoFinal) {
            System.out.printf("O evento terminou no mesmo dia e teve duração de %s hora(s) e %s minutos", horasDiaSeguinte, minutosHoraCompleta);
        } else if (horaInicial > horaFinal && minutoInicial > minutoFinal) {
            System.out.printf("O evento terminou no mesmo dia e teve duração de %s hora(s) e %s minutos", horasDiaSeguinte, minutosHoraIncompleta);
        } else {
            System.out.printf("O evento terminou no mesmo dia e teve duração de %s hora(s) e %s minutos", horasMesmoDia, minutosHoraCompleta);
        }
    }
}
