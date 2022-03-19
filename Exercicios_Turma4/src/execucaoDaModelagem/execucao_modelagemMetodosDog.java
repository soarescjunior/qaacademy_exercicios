package execucaoDaModelagem;

import modelagemMetodosDog.modelagemMetodosDog;

public class execucao_modelagemMetodosDog {

    public static void main(String[] args) {
        int filhotes = 2;
        String nomeAdestrador = "Dr. Dogão";
        
        modelagemMetodosDog executarmetodo = new modelagemMetodosDog();
        //executando somente a variavel da outra classe;
        System.out.println(executarmetodo.variavelInteiraGlobal);
        System.out.println(executarmetodo.variavelStringGlobal);

        //executando todo o metodo;
        executarmetodo.nomeCachorro("Sansa"); //sem retorno e com parametro
        executarmetodo.comeMuito(); // sem retorno e sem parametro
        executarmetodo.tipoCachorro("Sptiz"); // com retorno e parametro
        executarmetodo.idadeCachorro(); // com retorno e sem parametro
        executarmetodo.Criacao("QAAcademy " + "deram uma quantidade de " + filhotes +
        " filhotes " + "criador é " + nomeAdestrador ); //com retorno e com paratemtro e variaveis locais
    }

    
}
