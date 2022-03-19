package medium;

public class Exercicio10 {

    public static void main(String[] args) {

        int i = 2;
        int[] vetorFibonacci = new int[10];

        vetorFibonacci[0] = 0;
        System.out.println(vetorFibonacci[0]);
        vetorFibonacci[1] = 1;
        System.out.println(vetorFibonacci[1]);

        while(i<=9){
            vetorFibonacci[i]= vetorFibonacci[i-1] + vetorFibonacci[i-2];
			System.out.println(vetorFibonacci[i]);
			i++;
            
        }

    }

    

    
}
