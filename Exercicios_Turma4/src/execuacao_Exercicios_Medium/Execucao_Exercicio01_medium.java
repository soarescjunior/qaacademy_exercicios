package execuacao_Exercicios_Medium;

import medium.Exercicio01;

public class Execucao_Exercicio01_medium {

    public static void main(String[] args) {
        Exercicio01 executarExercicio01 = new Exercicio01();
        String [] vetorParImpar = executarExercicio01.verificarParOuImpar();
        exibirVetor(vetorParImpar);
    }

    public static void exibirVetor(String[] vetorParaImprimir) {

        int i = 0;
        while (i < 101) {
            System.out.println(vetorParaImprimir[i]);
            i++;
        }

    }

}