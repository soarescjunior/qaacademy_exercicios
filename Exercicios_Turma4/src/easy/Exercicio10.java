package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {

    // Exercício 10 - Faça um algoritmo para ler um valor de investimento, com uma
    // taxa de juros de 5% a.a.
    // Ao final de 10 anos, exibir o valor investido, valor dos juros e o total com
    // juros.
    // Considerando que a remuneração será no regime de juros simples.

    public static void main(String[] args) {

        String valorInvestimento = JOptionPane.showInputDialog("Digite o valor do investimento: ");
        double valorInvestido, juros, taxa = 0, totalComJuros = 0;
        int ano = 1;

        valorInvestido = Double.parseDouble(valorInvestimento);
        System.out.printf("Valor investido inicialmente é: R$ %.2f %n", valorInvestido);

        while (ano <= 10) {
            juros = valorInvestido * 0.05;
            taxa = juros * ano;
            totalComJuros = taxa + valorInvestido;
            ano++;
        }
        System.out.printf("Valor do total do juros é: R$ %.2f %n", taxa);
        System.out.printf("Valor do total com juros é: R$ %.2f %n", totalComJuros);

    }

}
