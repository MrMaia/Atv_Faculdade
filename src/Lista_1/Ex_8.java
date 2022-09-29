/*
Elabore um programa que permita calcular o Imposto de Renda (IR) de um casal
a partir das rendas do Homem (RH) e da Mulher (RM). O imposto é calculado sobre
a renda conjunta (RC=RH+RM) de acordo com a tabela abaixo:
Entrada
O arquivo de entrada contém valores com dupla precisão(double) referente a renda
do homem e a renda da mulher.
Saída
Imprima a renda conjunta (RC), a alíquota utilizada(ALIO), o imposto de renda(IR), a
renda líquida calculada(RL).
 */

package Lista_1;

import java.util.Scanner;

public class Ex_8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double rc, rh, rm, ipr = 0, rl;
        System.out.println("Informe a renda do marido: ");
        rh = s.nextDouble();
        System.out.println("Informa a renda da esposa: ");
        rm = s.nextDouble();
        rc = rh+rm;

        if(rc <= 900){
            ipr = rc*0;
            rl = rc-ipr;
            System.out.println("Isento");
            System.out.println("Renda conjunta: "+rc);
            System.out.println("Alíquota ultilizada: 0%");
            System.out.println("Imposto de renda: R$"+ipr);
            System.out.println("Renda líquida: "+rl);
        }else if(rc > 900 && rc <= 1500){
            ipr = rc*0.1;
            rl = rc-ipr;
            System.out.println("10%");
            System.out.println("Renda conjunta: "+rc);
            System.out.println("Alíquota ultilizada: 10%");
            System.out.println("Imposto de renda: R$"+ipr);
            System.out.println("Renda líquida: "+rl);
        }else if(rc > 1500 && rc <= 2500){
            ipr = rc*0.15;
            rl = rc-ipr;
            System.out.println("15%");
            System.out.println("Renda conjunta: "+rc);
            System.out.println("Alíquota ultilizada: 15%");
            System.out.println("Imposto de renda: R$"+ipr);
            System.out.println("Renda líquida: "+rl);
        }else if(rc > 2500){
            ipr = rc*0.25;
            rl = rc-ipr;
            System.out.println("25%");
            System.out.println("Renda conjunta: "+rc);
            System.out.println("Alíquota ultilizada: 25%");
            System.out.println("Imposto de renda: R$"+ipr);
            System.out.println("Renda líquida: "+rl);
        }
    }
}