package execuacao_Exercicios_Medium;
import medium.Exercicio10;

public class Execucao_Exercicios10_medium {

    public static void main(String[] args) {

        Exercicio10 exercicio10 = new Exercicio10();
        //System.out.println("Exibe o valor do termo: " + exercicio10.calcularFibonacci(10));
        exibirVetor(exercicio10.calcularFibonacciVetor(10));
    }

    public static void exibirVetor(int[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println("Valor de Fibonacci é " + vetorParaImprimir[i]);
            i++;
        }
    }

}
