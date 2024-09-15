package com.exercicios.sessao5.exerciciosWhile;

import java.util.Scanner;

public class Uri1115 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Forneça as coordenadas X e Y de um ponto no sistema cartesiano");

        System.out.print("X: ");
        int coordenadaX = ler.nextInt();

        System.out.print("Y: ");
        int coordenadaY = ler.nextInt();

        while (coordenadaX != 0 || coordenadaY != 0) {
            if (coordenadaX > 0 && coordenadaY > 0) {
                System.out.println("PRIMEIRO");

                System.out.println("\nForneça as coordenadas X e Y de um ponto no sistema cartesiano");

                System.out.print("X: ");
                coordenadaX = ler.nextInt();

                System.out.print("Y: ");
                coordenadaY = ler.nextInt();
            } else if (coordenadaX < 0 && coordenadaY > 0) {
                System.out.println("SEGUNDO");

                System.out.println("\nForneça as coordenadas X e Y de um ponto no sistema cartesiano");

                System.out.print("X: ");
                coordenadaX = ler.nextInt();

                System.out.print("Y: ");
                coordenadaY = ler.nextInt();
            } else if (coordenadaX < 0 && coordenadaY < 0) {
                System.out.println("TERCEIRO");

                System.out.println("\nForneça as coordenadas X e Y de um ponto no sistema cartesiano");

                System.out.print("X: ");
                coordenadaX = ler.nextInt();

                System.out.print("Y: ");
                coordenadaY = ler.nextInt();
            } else if (coordenadaX > 0 && coordenadaY < 0){
                System.out.println("QUARTO");

                System.out.println("\nForneça as coordenadas X e Y de um ponto no sistema cartesiano");

                System.out.print("X: ");
                coordenadaX = ler.nextInt();

                System.out.print("Y: ");
                coordenadaY = ler.nextInt();
            }
//            System.out.println("\nForneça as coordenadas X e Y de um ponto no sistema cartesiano");
//
//            System.out.print("X: ");
//            coordenadaX = ler.nextInt();
//
//            System.out.print("Y: ");
//            coordenadaY = ler.nextInt();
        }
        ler.close();

        System.out.println("NULO");
    }
}
