package medium;

import javax.swing.JOptionPane;

public class Exercicio07 {

  // Exercício 7 - Faça um algoritmo para ler todos os meses do ano, armazene em
  // um vetor.

  public static void main(String[] args) {

    String[] vetorMes = new String[12];
    String mesDigitado;
    int i = 0;

    while (i <= 11) {
      mesDigitado = JOptionPane.showInputDialog("digite o mes");
      vetorMes[i] = mesDigitado;
      i++;

    }

  }
}