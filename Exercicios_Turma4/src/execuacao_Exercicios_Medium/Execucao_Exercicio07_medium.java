package execuacao_Exercicios_Medium;
import medium.Exercicio07;

public class Execucao_Exercicio07_medium {

    public static void main(String[] args) {
        Exercicio07 executarExercicio07 = new Exercicio07();
        String [] vetorMeses = executarExercicio07.MesesDoAno();
        exibirVetorMeses(vetorMeses);
    }

    public static void exibirVetorMeses(String[] vetorMeses) {

        int i = 1;
        while (i<=12) {
            System.out.println("Mes " + i + " " + vetorMeses[i-1]);
            i++;
        }

        }

}
