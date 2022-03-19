package metodoComRetorno;

public class Exercicio01_com_retorno_e_parametros {

    public String verificarNota(int nota) {

        if (nota >= 5) {

            System.out.println("Você foi aprovado, sua nota é:  " + nota);
            return "Aprovado " + nota;

        } else {
            System.out.println("Você foi reprovado, sua nota é: " + nota);
            return "reprovado " + nota;
        }

    }

    public String verificaProfessores(String palavraUm, String palavraDois) {

        String palavra = palavraUm + " - " + palavraDois;
        System.out.println(palavra);
        return palavra;

    }

    public int soma(int numUm, int numDois) {

        int resultado = numUm + numDois;
        System.out.println("A Soma é: " + resultado);
        return resultado;
    }

    public double multiplicao(Double numUm, Double numDois) {

        double resultado = numUm + numDois;
        System.out.println("A multiplicação é: " + resultado);
        return resultado;
    }

    public String NomeDeRua(String nomeUm, String nomeDois) {

        String resultado = nomeUm + " " + nomeDois;
        System.out.println("O nome da rua é: " + resultado);
        return resultado;

    }

}
