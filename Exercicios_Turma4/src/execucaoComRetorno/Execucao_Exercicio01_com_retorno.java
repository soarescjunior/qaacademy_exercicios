package execucaoComRetorno;

import metodoComRetorno.Exercicio01_com_retorno;

public class Execucao_Exercicio01_com_retorno {

    
    public static void main(String[] args) {
            
        Exercicio01_com_retorno executar = new Exercicio01_com_retorno();

       System.out.println(executar.verificarNota());

       System.out.println(executar.verificaProfessores());

       System.out.println(executar.verificarTotalAluno());

       System.out.println(executar.mesaDisponivel());

       System.out.println(executar.cadeiraDisponivel());
     
    }

    
    
}
