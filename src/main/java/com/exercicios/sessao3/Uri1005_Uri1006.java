package com.exercicios.sessao3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri1005_Uri1006 {

    public static void main(String[] args) {
        Integer ordemNotas = 0;
        Double somaNotas = 0.0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Quantas notas o aluno possui? ");
        Integer quantidadeNotas = ler.nextInt();

        Map<Integer, Double> valueNotas = new HashMap<>();

        Map<Integer, Double> valuePesoNotas = new HashMap<>();

        for (int i = 0; i < quantidadeNotas; i++) {
            ordemNotas += 1;

            System.out.println("Digite a " + ordemNotas + "ª nota: ");
            Double notasAluno = ler.nextDouble();

            System.out.println("Qual o peso da " + ordemNotas + "ª nota? ");
            Double pesoNota = ler.nextDouble();

            valueNotas.put(ordemNotas, notasAluno);

            valuePesoNotas.put(ordemNotas, notasAluno * pesoNota);
        }

        System.out.println("\nAs notas do aluno são: " + valueNotas.entrySet());

        for (Map.Entry<Integer, Double> n : valuePesoNotas.entrySet()) {
            somaNotas += n.getValue();
        }

        Double mediaNotas = somaNotas / quantidadeNotas;

        System.out.printf("A média das notas do aluno é igual a: %.2f%n", mediaNotas);
    }
}
