package execucao_Exercicios_Easy;

import easy.Exercicio09;

public class Execucao_Exercicio09_easy {

    public static void main(String[] args) {
    
       
        Exercicio09 executarExercicio09 = new Exercicio09();

            int[] vetorTabuada = executarExercicio09.calcularTabuada(10);
            exibirVetor(vetorTabuada);
        }

        public static void exibirVetor(int [] vetorParaImprimir) {
            Exercicio09 executarExercicio09 = new Exercicio09();
            int[] vetorTabuada = executarExercicio09.calcularTabuada(10);
            
            int i = 0;
            while (i < 11) {
                System.out.println(vetorTabuada[i] + " * " + i + " = " + vetorParaImprimir[i]);
                i++;
            }
        }
    
}
