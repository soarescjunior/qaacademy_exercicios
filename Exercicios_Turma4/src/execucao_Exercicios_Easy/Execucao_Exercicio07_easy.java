package execucao_Exercicios_Easy;

import javax.swing.JOptionPane;

import easy.Exercicio07;

public class Execucao_Exercicio07_easy {

    public static void main(String[] args) {
    
    double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario"));

    Exercicio07 ex7 = new Exercicio07();

    double valorINSS = ex7.calcularExibirValorINSS(salario);
    System.out.printf("O valor do INSS a ser pago é R$ %.2f %n", valorINSS);

    }

}
