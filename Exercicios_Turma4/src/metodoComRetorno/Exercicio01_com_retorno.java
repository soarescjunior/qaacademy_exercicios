package metodoComRetorno;

public class Exercicio01_com_retorno {

    //{
    // 1. Criar uma classe;
    //2. Criar 5 metodos com retorno.
    //}

    //{
        //3. Adicionar uma instrução para exibir o nome do metodo;
        //4. Fazer a chamada deste 5 metodos main

    //}


    public String verificarNota() {

        int nota = 10;

        if (nota >= 5) {

            return "Aprovado " + nota;

        } else {

            return "reprovado " + nota;
        }

    }

    public String verificarTotalAluno() {

        int qtdadeAluno = 30;

        if (qtdadeAluno >= 40) {

            return "Sala lotada " + qtdadeAluno;

        } else {

            return "Sala disponivel " + qtdadeAluno;
        }

    }

    public String verificaProfessores() {

        int qtdadeProfessor = 30;

        if(qtdadeProfessor >= 28){

            return "Esta faltando Professor " + qtdadeProfessor;
            
        }else{

            return "Não falta Professor " + qtdadeProfessor;
        }
    }

    public String cadeiraDisponivel() {

            int qtdadeCadeira = 30;
    
            if(qtdadeCadeira >= 32){
    
                return "Esta faltando Cadeira " + qtdadeCadeira;
                
            }else{
    
                return "Não falta cadeira " + qtdadeCadeira;
            }

        }
    public String mesaDisponivel() {

        int qtdadeMesa = 35;

        if (qtdadeMesa >= 32) {

            return "Esta faltando Mesa " + qtdadeMesa;

        } else {

            return "Não falta mesa " + qtdadeMesa;
        }

    }

}
