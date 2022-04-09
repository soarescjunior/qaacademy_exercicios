package execuacao_Exercicios_Medium;
import medium.Exercicio03;

public class Execucao_Exercicio03_medium  {

    public static void main(String[] args) {

        Exercicio03 executarExercicio03 = new Exercicio03();
        int[] vetorDeZeroAMil = executarExercicio03.calcularSomaDeZeroAMil();
        int[] vetorIteracoes = executarExercicio03.somarIteracoes();
        exibirVetorCalculoZeroAMil(vetorDeZeroAMil,vetorIteracoes);

    }

    public static void exibirVetorCalculoZeroAMil(int[] vetorDeZeroAMil, int[] vetorIteracoes ) {

        int i = 0;
        while (i <= 1000) {
            int soma = vetorDeZeroAMil[i];
            if (soma > 1550) {
                break;
            }
              System.out.println("soma é igual: " + vetorDeZeroAMil[i] + " e a Iteracao é: " + vetorIteracoes[i]);
              i++;
            }
           
        }

    }
