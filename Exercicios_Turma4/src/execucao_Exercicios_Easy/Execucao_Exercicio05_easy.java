package execucao_Exercicios_Easy;

import javax.swing.JOptionPane;

import easy.Exercicio05;

public class Execucao_Exercicio05_easy {
    
    public static void main(String[] args) {

        int numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero um: "));
        int numeroDois =  Integer.parseInt(JOptionPane.showInputDialog("Digite o numero dois: "));
        int numeroTres =  Integer.parseInt(JOptionPane.showInputDialog("Digite o numero tres: "));

        Exercicio05 ex5 = new Exercicio05();
        ex5.calculaOperracoesAritimeticas(numeroUm, numeroDois, numeroTres);        

    }

}
    