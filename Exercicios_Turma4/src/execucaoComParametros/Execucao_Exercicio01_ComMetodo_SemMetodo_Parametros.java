package execucaoComParametros;

import metodoComRetorno.Exercicio01_com_retorno_e_parametros;
import metodoSemRetorno.Exercicio01_sem_retorno_com_parametros;

public class Execucao_Exercicio01_ComMetodo_SemMetodo_Parametros {

    public static void main(String[] args) {

        Exercicio01_com_retorno_e_parametros executarComretorno = new Exercicio01_com_retorno_e_parametros();
        System.out.println("\n **COM RETORNO E COM PARAMETRO **\n");

        executarComretorno.multiplicao(10.1, 10.1);
        executarComretorno.NomeDeRua("Avenida", "Paulista");
        executarComretorno.verificarNota(10);
        executarComretorno.verificaProfessores("Flavio", "Dias");
        executarComretorno.soma(10, 20);

        Exercicio01_sem_retorno_com_parametros executarSemRetorno = new Exercicio01_sem_retorno_com_parametros();
        System.out.println("\n** SEM RETORNO E COM PARAMETRO **\n");
        executarSemRetorno.textoUm("Claudio");
        executarSemRetorno.textoDois("Junior");
        executarSemRetorno.numeroUm(1);
        executarSemRetorno.numeroDois(1.0);
        executarSemRetorno.textotres("Sucesso");
    }

}
