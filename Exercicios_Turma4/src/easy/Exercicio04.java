package easy;

import javax.swing.JOptionPane;

public class Exercicio04 {

         //Exercício 4 - Faça um algoritmo para ler um número inteiro, 
         //armazenar em uma variável, calcular o dobro, e exibir.
      
    public void dobroDoNumeroInteiroDigitado() {
        
        int numeroUm, calculo;

        numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
        calculo = numeroUm * 2;

        System.out.println(" O valor duplicado é: " + calculo);

    }
    
}
