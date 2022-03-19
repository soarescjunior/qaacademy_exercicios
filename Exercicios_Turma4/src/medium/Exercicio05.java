package medium;

import javax.swing.JOptionPane;

public class Exercicio05 {

    // Exercício 5 - Faça um algoritmo para ler 5 números, verificar e exibir,
    // quais dos 5 números digitados, é o menor.

    public static void main(String[] args) {

        int numeroDigitado, i = 1, valorMenor = 0;

        while (i < 5) {
            String numero1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
            numeroDigitado = Integer.parseInt(numero1);
            if (numeroDigitado < valorMenor || i==1) {
                valorMenor = numeroDigitado;
            } else {

            }
            i++;
        }
        System.out.println("O menor numero é: " + valorMenor);
    }
}
