package medium;

public class Exercicio03 {

    // Exercício 3 - Faça um algoritmo para calcular e exibir a soma de todos os
    // números de 0 a 1000.
    // E parar se caso a soma atingir 1500(ou mais).

    public static void main(String[] args) {

        int numeros = 0, soma = 0;

        while (numeros <= 1000) {

            soma = soma + numeros;
            System.out.println("Soma = " + soma);

            if (soma >= 1500) {
                break;
            }

            System.out.println("Iterações = " + numeros);

            numeros++;

        }

    }

}
