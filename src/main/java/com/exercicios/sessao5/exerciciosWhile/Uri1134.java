package com.exercicios.sessao5.exerciciosWhile;

public class Uri1134 {
    private boolean continuarAbastecimento = true;
    private int alcool = 0;
    private int gasolina = 0;
    private int diesel = 0;

    public boolean isContinuarAbastecimento() {
        return continuarAbastecimento;
    }

    public void setContinuarAbastecimento(boolean continuarAbastecimento) {
        this.continuarAbastecimento = continuarAbastecimento;
    }

    public void combustiveis(int codigoCombustivel) {
        switch (codigoCombustivel){
            case 1:
                this.alcool++;
                break;
            case 2:
                this.gasolina++;
                break;
            case 3:
                this.diesel++;
                break;
        }
    }

    public void escolherCombustivel1 () {
        System.out.println("\n");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|                   COMBUSTÍVEL                      |");
        System.out.println("+----------------------------------------------------+");
        System.out.println(
                "|  CÓDIGO  |  COMBUSTÍVEL  |\n" +
                        "|    1     |    Alcool     |\n" +
                        "|    2     |    Gasolina   |\n" +
                        "|    3     |    Diesel     |\n" +
                        "|    4     |    Fim        |"
        );
        System.out.println("+----------------------------------------------------+");
    }

    public void resultadoAbastecimento() {
            System.out.println("\nMUITO OBRIGADO!");
            System.out.println("\n");
            System.out.println("+----------------------------------------------------+");
            System.out.println("|          ABASTECIMENTOS DO DIA                     |");
            System.out.println("+----------------------------------------------------+");
            System.out.println(
                    "|  COMBUSTÍVEL  |   TOTAL   |" +
                            "\n|    Alcool     |     " + this.alcool + "     |" +
                            "\n|    Gasolina   |     " + this.gasolina + "     |" +
                            "\n|    Diesel     |     "  + this.diesel + "     |"
            );
            System.out.println("+----------------------------------------------------+");
    }
}