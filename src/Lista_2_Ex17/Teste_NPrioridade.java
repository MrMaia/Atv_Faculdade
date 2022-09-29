package Lista_2_Ex17;

public class Teste_NPrioridade {

    NPrioridade  nivel_prioridade;

    Teste_NPrioridade(String nivel_prioridade){

        this.nivel_prioridade = NPrioridade.valueOf(nivel_prioridade);
    }

    public void selecao_nivel_prioridade() {

        switch(nivel_prioridade)  {

            case VERDE:

                System.out.println("Prioridade 1");
                break;

            case AMARELO:

                System.out.println("Prioridade 2");
                break;

            case VERMELHO:

                System.out.println("Prioridade 3");
                break;
        }
    }

}