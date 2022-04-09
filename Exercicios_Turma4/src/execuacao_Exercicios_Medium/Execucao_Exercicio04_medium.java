package execuacao_Exercicios_Medium;

import medium.Exercicio04;

public class Execucao_Exercicio04_medium {

    public static void main(String[] args) {

        Exercicio04 executarExercicio04 = new Exercicio04();
        int[] vetorMultiZeroAMil = executarExercicio04.multiplicacaoDeZeroAMil();
        int[] vetorIteracao = executarExercicio04.itercaoDeZeroAMil();
        exibirVetorCalculoZeroAMil(vetorMultiZeroAMil, vetorIteracao);

    }

    public static void exibirVetorCalculoZeroAMil(int[] vetorMultiZeroAMil, int[] vetorIteracao) {

        int i = 0;
        while (i <= 1000) {
            int soma = vetorMultiZeroAMil[i];
            if (soma >= 1000) {
                soma = 1 ;
            }
            System.out.println("soma é igual: " + vetorMultiZeroAMil[i] + " Sua Iteracao é:" + vetorIteracao[i]);

            i++;

        }

    }

}
