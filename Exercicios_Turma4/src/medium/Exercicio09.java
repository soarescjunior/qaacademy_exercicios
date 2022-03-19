package medium;

import javax.swing.JOptionPane;

public class Exercicio09 {

    public static void main(String[] args) {

        // Exercício 09 - Faça um algoritmo para: Criar dois vetores.Em um vetor:
        // ler e armazenar o nomes de alunos. No outro vetor: ler e armazenar a
        // numeração de cada aluno,
        // de acordo com a ordem inserida no vetor de nomes.
        // E exiba, o Nome e o número correspondente de cada um.

        String[] vetorNome = new String[3];
        String nomeDoAlunoDigitado;
        int[] vetorNumeroAluno = new int[3];
        String numeroDoAluno;
        int numeroDoAlunoDigitado;
        int iNome = 0;
        int inumero = 0;

        while (iNome <= 2 && inumero <= 2) {
            nomeDoAlunoDigitado = JOptionPane.showInputDialog("Digite o nome do aluno:");
            vetorNome[iNome] = nomeDoAlunoDigitado;
            numeroDoAluno = JOptionPane.showInputDialog("Digite o numero do aluno:");
            numeroDoAlunoDigitado = Integer.parseInt(numeroDoAluno);
            vetorNumeroAluno[inumero] = numeroDoAlunoDigitado;
            inumero++;
            iNome++;
        }

        iNome = 0;
        inumero = 0;
        while (iNome <= 2 && inumero <= 2) {

            System.out.println("Nome aluno: " + vetorNome[iNome] + " Nº Aluno: " + vetorNumeroAluno[inumero]);

            iNome++;
            inumero++;
        }

    }

}
