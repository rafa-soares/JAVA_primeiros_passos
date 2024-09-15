package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1049 {

    public static void main(String[] args) {
        String alimentacaoAnimal = null;
        String tipoAnimal = null;
        String vertebrado_invertebrado = null;

        Scanner ler = new Scanner(System.in);

        System.out.println("O animal é vertebrado ou invertebrado?");
        vertebrado_invertebrado = ler.nextLine();

        validacao(alimentacaoAnimal, tipoAnimal, vertebrado_invertebrado, ler);
    }

    private static void validacao(String alimentacaoAnimal, String tipoAnimal, String vertebrado_invertebrado, Scanner ler) {
        if (vertebrado_invertebrado.equals("vertebrado")) {
            System.out.println("O animal é ave ou mamífero?");
            tipoAnimal = ler.nextLine();

            if (tipoAnimal.equals("ave")) {
                System.out.println("Qual a forma de alimentação do animal, carnívoro ou onívoro?");
                alimentacaoAnimal = ler.nextLine();

                if (alimentacaoAnimal.equals("onívoro")) {
                    System.out.println("O animal escolhido é a POMBA!");
                } else if (alimentacaoAnimal.equals("carnívoro")) {
                    System.out.println("O animal escolhido é a ÁGUIA!");
                } else {
                    System.out.println("O animal só pode ser onívoro ou carnívoro, tente outra vez");
                }
            } else if (tipoAnimal.equals("mamífero")) {
                System.out.println("Qual a forma de alimentação do animal?");

                if (alimentacaoAnimal.equals("onívoro")) {
                    System.out.println("O animal escolhido é o HOMEM!");
                } else if (alimentacaoAnimal.equals("herbívoro")) {
                    System.out.println("O animal escolhido é a VACA!");
                } else {
                    System.out.println("O animal só pode ser onívoro ou herbívoro, tente outra vez");
                }
            } else {
                System.out.println("O animal só pode ser ave ou mamífero, tente outra vez");
            }
        } else if (vertebrado_invertebrado.equals("invertebrado")) {
            System.out.println("O animal é inseto ou anelídio");

            if (tipoAnimal.equals("inseto")) {
                System.out.println("Qual a forma de alimentação do animal, hematófago ou herbívoroo?");

                if (alimentacaoAnimal.equals("herbívoro")) {
                    System.out.println("O animal escolhido é a LAGARTA!");
                } else if (alimentacaoAnimal.equals("hematófago")) {
                    System.out.println("O animal escolhido é a PULGA!");
                } else {
                    System.out.println("O animal só pode ser herbívoro ou hematófago, tente outra vez");
                }
            } else if (tipoAnimal.equals("anelídio")) {
                System.out.println("Qual a forma de alimentação do animal, hematófago ou herbívoro");

                if (alimentacaoAnimal.equals("onívoro")) {
                    System.out.println("O animal escolhido é a MINHOCA!");
                } else if (alimentacaoAnimal.equals("hematófago")) {
                    System.out.println("O animal escolhido é o SANGUESSUGA!");
                } else {
                    System.out.println("O animal só pode ser onívoro ou hematófago, tente outra vez");
                }
            } else {
                System.out.println("O animal só pode ser inseto ou anelídio, tente outra vez");
            }
        } else {
            System.out.println("O animal só pode ser vertebrado ou invertebrado, tente outra vez");
        }
    }
}
