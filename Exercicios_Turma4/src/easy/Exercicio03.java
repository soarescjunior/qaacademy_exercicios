package easy;

import javax.swing.JOptionPane;

public class Exercicio03 {

    //Exercício 3 - Faça um algoritmo para ler dois valores,
    //armazenar em variáveis, e exibir os valores das variáveis, trocados.

    public void lerDoisValoresExibirValoresTrocados() {

    String numeroum, numerodois;
        numeroum = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        numerodois = JOptionPane.showInputDialog("Digite o segundo numero: ");
        System.out.println("numero um é " + numerodois + " e " + "numero dois é: " + numeroum);

    }
    
}
