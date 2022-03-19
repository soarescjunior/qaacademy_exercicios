package easy;

public class Exercicio05 {

    //Exercício 5 - Faça um algoritmo para ler três números inteiros, 
    //armazenar em variáveis, e exibir a soma, a subtração, 
    //multiplicação e a média dos três números digitados.

    public void calculaOperracoesAritimeticas( int numeroUm, int numeroDois, int numeroTres) {
        
        int soma, subtração, divisao, multiplicacao;
        

        soma = numeroUm + numeroDois + numeroTres;
        subtração = numeroUm - numeroDois - numeroTres;
        multiplicacao = numeroUm * numeroDois * numeroTres;
        divisao = soma / 3;

        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é:  " + subtração);
        System.out.println("A multiplicação: " + multiplicacao);
        System.out.println("A divisao é:  " + divisao);
    
    }
    
}
