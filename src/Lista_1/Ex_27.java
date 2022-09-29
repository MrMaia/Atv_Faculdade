/*
Genival tem muito medo de ter diabetes e, por isso, o médico pediu que ele
medisse sua glicose ao longo do dia para ver se ela estava controlada. Escreva um
programa que receba como entrada 4 quatro medições dos valores da taxa de
glicose de Genival, para cada valor informado informe NORMAL ou ALTERADA e ao
final calcule a glicose média observada naquele dia.
Caso esse valor seja inferior a 110, o programa deve exibir a mensagem NORMAL,
se tiver entre 110 e 125 exibir a mensagem ALTERADA, acima de 125, a mensagem
exibida deve ser MUITO ALTA.
Entrada
Quatro valores inteiros representando o resultado das medições feitas no dia.
Saída
Uma das seguintes mensagens: NORMAL, ALTERADA ou MUITO ALTA e o valor
médio das medições ao final do processamento.
 */

package Lista_1;

import java.util.Scanner;

public class Ex_27 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        float media;
        int[] lista = new int[4];
        System.out.println("Digite suas quatro medições diárias: ");
        for(int x=0; x<4;x++){
            lista[x] = s.nextInt();
        }
        if(lista[0] < 110){
            System.out.println("Sua taxa está normal: "+lista[0]);
        }else if(lista[0] > 111 && lista[0] < 124){
            System.out.println("Sua taxa está alterada: "+lista[0]);
        }else if(lista[0] > 125){
            System.out.println("Sua taxa está muito alta: "+lista[0]);
        }
        if(lista[1] < 110){
            System.out.println("Sua taxa está normal: "+lista[1]);
        }else if(lista[1] > 111 && lista[1] < 124){
            System.out.println("Sua taxa está alterada: "+lista[1]);
        }else if(lista[1] > 125){
            System.out.println("Sua taxa está muito alta: "+lista[1]);
        }
        if(lista[2] < 110){
            System.out.println("Sua taxa está normal: "+lista[2]);
        }else if(lista[2] > 111 && lista[2] < 124){
            System.out.println("Sua taxa está alterada: "+lista[2]);
        }else if(lista[2] > 125){
            System.out.println("Sua taxa está muito alta: "+lista[2]);
        }
        if(lista[3] < 110){
            System.out.println("Sua taxa está normal: "+lista[3]);
        }else if(lista[3] > 111 && lista[3] < 124){
            System.out.println("Sua taxa está alterada: "+lista[3]);
        }else if(lista[3] > 125){
            System.out.println("Sua taxa está muito alta: "+lista[3]);
        }
        media = (lista[0]+lista[1]+lista[2]+lista[3])/4;
        System.out.println("Sua média das leituras são de: "+media);
    }
}