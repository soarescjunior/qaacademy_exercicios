package easy;

import javax.swing.JOptionPane;

public class Exercicio11 {
  public static void main(String[] args) {

    // Exercício 11 - Faça um algoritmo para ler um número inteiro, somar 2 ao
    // número digitado,
    // até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
    // completar 100 iterações.

    String digiteUmNumero = JOptionPane.showInputDialog("Digite um numero inteiro para que seja somado mais dois: ");
    int numeroDigitado, seguencia = 1, soma = 0;

    numeroDigitado = Integer.parseInt(digiteUmNumero);
    soma = numeroDigitado;
    while (seguencia <= 100) {
      soma = soma + 2;
      System.out.println(soma);
      seguencia++;

    }

  }

}
