package modelagemMetodosDog;

public class modelagemMetodosDog {

    public int variavelInteiraGlobal = 9;
    public String variavelStringGlobal = "Claudio";

    public String tipoCachorro(String raça ){ // com retorno e parametro
        System.out.println("A raça do Cachorro é: " + raça);
        return raça;
    }

    public String idadeCachorro(){ // com retorno e sem parametro
        int idadeCachorro = 1;
        return "A idade do Cachorro é " + idadeCachorro + "anos";

    }

    public String Criacao(String nomeCanil){ // com retorno e com paratemtro
        String resultado;
        resultado = "A criação do Cachorro foi em " + nomeCanil;
        System.out.println(resultado);
        return resultado;


    }

    public void nomeCachorro(String nomeCachorro){// sem retorno e com parametro
        System.out.println("Nome do cachorro é: " + nomeCachorro);
    }

    public void comeMuito(){ // sem retorno e sem parametro
        int kilos = 10;
        System.out.println("O Cachorro come muito, " + kilos + "Kg por 15 dias" ) ;
    }
    
    
}
