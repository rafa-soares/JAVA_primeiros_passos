package com.exercicios.sessao3;

import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.println("Para encontrar a distância entre dois pontos em um plano cartesicano, forneça os valores das coordenadas: ");

        System.out.print("x1= ");
        double x1 = ler.nextDouble();

        System.out.print("y1= ");
        double y1 = ler.nextDouble();

        System.out.print("x2= ");
        double x2 = ler.nextDouble();

        System.out.print("y2= ");
        double y2 = ler.nextDouble();

        double distancia = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 2);

        System.out.printf("A distância entre os pontos (%s,%s) e (%s,%s) é igual a: %.4f%n", x1, y1, x2, y2, distancia);
    }
}
