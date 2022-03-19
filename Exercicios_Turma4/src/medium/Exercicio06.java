package medium;

import javax.swing.JOptionPane;

public class Exercicio06 {

    // Exercício 6 - Faça um algoritmo para ler um número inteiro, calcular e exibir
    // o Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3)..
    // *(10-1) = 3.628.800

    public static void main(String[] args) {

        int Fatorial, i = 1;
    
        String numeroDigitado = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        Fatorial = Integer.parseInt(numeroDigitado);
        i = Fatorial;
        while (i > 1) {
            Fatorial = Fatorial * (i - 1);
            System.out.println("Fatorial é : " + Fatorial);

            i= i-1;
        }
        
    }

}
