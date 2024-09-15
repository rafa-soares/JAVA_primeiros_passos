package com.exercicios.sessao3;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Uri1061 {
    public static void main(String[] args) throws ParseException {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual dia de início do evento?");
        String dia1 = ler.nextLine();

        System.out.println("Qual horário de início do evento?");
        String hora1 = ler.nextLine();

        System.out.println("Qual dia de encerramento do evento?");
        String dia2 = ler.nextLine();

        System.out.println("Qual horário de encerramento do evento?");
        String hora2 = ler.nextLine();

        resultDias(dia1, dia2);

        resultHoras(hora1, hora2);
    }

    private static void resultDias(String dia1, String dia2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate inicioEvento = LocalDate.parse(dia1, formatter);

        LocalDate encerramentoEvento = LocalDate.parse(dia2, formatter);

        Long duracaoInicio = inicioEvento.getYear() * 365L + inicioEvento.getMonthValue() * 30L + inicioEvento.getDayOfYear();

        Long duracaoEncerramento = encerramentoEvento.getYear() * 365L + encerramentoEvento.getMonthValue() * 30L + encerramentoEvento.getDayOfYear();

        Long diasTotais = duracaoEncerramento - duracaoInicio;

        Long anos = diasTotais / 365;
        diasTotais %= 365;

        Long meses = diasTotais / 30;
        diasTotais %= 60;

        System.out.printf("A duração do evento foi de:\n %s anos\n %s meses\n %s dias\n ", anos, meses, diasTotais);
    }

    private static void resultHoras(String hora1, String hora2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime inicioEvento = LocalTime.parse(hora1, formatter);

        LocalTime encerramentoEvento = LocalTime.parse(hora2, formatter);

        Long duracaoInicio = inicioEvento.getHour() * 3600L + inicioEvento.getMinute() * 60L + inicioEvento.getSecond();

        Long duracaoEncerramento = encerramentoEvento.getHour() * 3600L + encerramentoEvento.getMinute() * 60L + encerramentoEvento.getSecond();

        Long segundosTotais = duracaoEncerramento - duracaoInicio;

        Long horas = segundosTotais / 3600;
        segundosTotais %= 3600;

        Long minutos = segundosTotais / 60;
        segundosTotais %= 60;

        System.out.printf("%s:%s:%s", horas, minutos, segundosTotais);
    }
}
