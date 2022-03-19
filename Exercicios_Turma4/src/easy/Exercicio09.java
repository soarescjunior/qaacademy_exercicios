package easy;

import javax.swing.JOptionPane;

public class Exercicio09 {

    //Exercício 9 - Faça um algoritmo para ler um número inteiro entre: 1 a 10, 
    //calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 = 100.

    public static void main(String[] args) {
        
        String numeroParaGerarTabuada = JOptionPane.showInputDialog("Digite um numero para gera a tabuada:");
        int numeroTabuada, i=0, calculo;

        numeroTabuada = Integer.parseInt(numeroParaGerarTabuada);
        System.out.println("A tabuada do numero " + numeroTabuada + " é: ");
        while(i<=10){
            calculo = i * numeroTabuada;
            System.out.println(numeroTabuada + " * "+ i + " = " + calculo);
            i++;
        }
    }
    
}
