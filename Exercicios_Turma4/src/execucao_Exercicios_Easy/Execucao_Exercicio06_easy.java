package execucao_Exercicios_Easy;

import javax.swing.JOptionPane;

import easy.Exercicio06;

public class Execucao_Exercicio06_easy {

    public static void main(String[] args) {

        double numeroUm = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota: "));
        double numeroDois = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota: "));       

        Exercicio06 ex6 = new Exercicio06();
        System.out.println(ex6.calcularMediaAluno(numeroUm, numeroDois)); 

    }
    
}
