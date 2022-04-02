package execucao_Exercicios_Easy;

import easy.Exercicio11;

public class Execucao_Exercicio11_easy {

    public static void main(String[] args) {
    
       
        Exercicio11 executarExercicio11 = new Exercicio11();

        int [] vetorIntercaoes =  executarExercicio11.numeroMaisDoisAte100Iteracoes(10);
        exibirVetor(vetorIntercaoes);

        }

        public static void exibirVetor(int[] vetorIntercaoes) {
            int i = 0;
            while (i < 100) {
                System.out.println("Iteracao de numero " + i + " tem o valor " + vetorIntercaoes[i]);
                i++;
            }
        }
    
}
