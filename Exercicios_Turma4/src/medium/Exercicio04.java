package medium;

public class Exercicio04 {

    // Exercício 4 - Faça um algoritmo para calcular e exibir a multiplicação de
    // todos os números de 1 a 1000.
    // E toda vez que resultado chegar ou ultrapassar 1000,
    // faça que o resultado das multiplicações volte a ser 1.

    public static void main(String[] args) {

        int numero=1 , saldo =1;

        while(numero <= 1000){

            saldo = numero * saldo;

            if( saldo >= 1000){

                saldo = 1;

            }
               numero++;

               System.out.println(saldo);
        }

    }

}
