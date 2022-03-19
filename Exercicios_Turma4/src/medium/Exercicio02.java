package medium;

import javax.swing.JOptionPane;

public class Exercicio02 {

    //Exercício 2 - Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a. 
    //Ao final de 10 anos, exibir o valor investido, valor dos juros, e o total. 
    //Considerando que a remuneração será no regime de juros compostos.

    public static void main(String[] args) {

        String digiteOValor = JOptionPane.showInputDialog("digite o Valor para ser investido");
        double taxa = 0.05, valorDeIvestimento, total, valorJuros;
        int ano = 1;
        valorDeIvestimento = Double.parseDouble(digiteOValor);

        System.out.printf("O valor de invetimento incial é: R$ %.2f %n", valorDeIvestimento );
        total = valorDeIvestimento;
        while(ano <= 10){
        total = (total * taxa) + total;
        ano++;
        }
        valorJuros = total - valorDeIvestimento;
        
        System.out.printf("O valor total do juros é: R$ %.2f %n", valorJuros);
        System.out.printf("O valor total do investimento é: R$ %.2f %n", total);

    }
    
}
