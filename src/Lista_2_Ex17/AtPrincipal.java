package Lista_2_Ex17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AtPrincipal {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        String prioridade;

        System.out.println("Para qual prioridade você vai querer: ");
        prioridade = sc.next().toUpperCase();

        sc.close();

        Teste_NPrioridade teste = new Teste_NPrioridade(prioridade);
        teste.selecao_nivel_prioridade();

        Evento ev = new Evento();

        String dataInicio = "19/08/2022";
        String dataFinal = "25/08/2022";

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(dataInicio);

        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada2 = formato.parse(dataFinal);

        ev.setNome("Programação");
        ev.setDescricao("Desenvolvimento em Java");
        ev.setDataInicio(dataFormatada);
        ev.setDataFim(dataFormatada2);
        ev.setHoraInicio(ev.getHoraInicio());
        ev.setHoraFim(ev.getHoraFim());

        ev.compartilharEvento();
    }

}