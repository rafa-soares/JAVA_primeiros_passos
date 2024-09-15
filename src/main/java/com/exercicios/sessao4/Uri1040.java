package com.exercicios.sessao4;

import java.util.Scanner;

public class Uri1040 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        float nota1 = ler.nextFloat();

        System.out.println("Digite a segunda nota");
        float nota2 = ler.nextFloat();

        System.out.println("Digite a terceira nota");
        float nota3 = ler.nextFloat();

        System.out.println("Digite a quarta nota");
        float nota4 = ler.nextFloat();

        double pesoNota1 = nota1 * 2;

        double pesoNota2 = nota2 * 3;

        double pesoNota3 = nota3 * 4;

        double pesoNota4 = nota4 * 1;

        double media = (pesoNota1 + pesoNota2 + pesoNota3 + pesoNota4) / 10;

        validacaoMedia(media);
    }

    private static void validacaoMedia(double media) {
        double notaExame = 0;
        double mediaExame = 0;
        Scanner ler = new Scanner(System.in);

        if (media >= 7) {
            System.out.println("ALUNO APROVADO!");
            System.out.printf("\nMédia do aluno é igual a %.2f", media);
        } else if (media < 5) {
            System.out.println("\nALUNO REPROVADO!");
            System.out.printf("Média do aluno é igual a %.2f", media);
        } else if (media > 5 && media < 7) {
            System.out.println("\nALUNO EM EXAME!");
            System.out.printf("Média do aluno é igual a %.2f", media);
            System.out.printf("\nDigite a nota do aluno no exame\n");
            notaExame = ler.nextDouble();
            if (notaExame >= 7) {
                mediaExame = (notaExame + media) / 2;

                System.out.println("\nALUNO APROVADO!");
                System.out.printf("Média do aluno é igual a %.2f", mediaExame);
            } else {
                mediaExame = (notaExame + media) / 2;

                System.out.println("\nALUNO REPROVADO!");
                System.out.printf("Média do aluno é igual a %.2f.", mediaExame);
            }
        }
    }
}
