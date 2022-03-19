package easy;

import javax.swing.JOptionPane;

public class Exercicio02 {

    //Exercício 2 - Faça um algoritmo para ler e exibir uma palavra.

    public void lerExibirUmaPalavra() {

        String palavra;
        palavra = JOptionPane.showInputDialog("Digite uma palavra");
        System.out.println("A palavra digitada é: " + palavra);
        
    }
  
}
