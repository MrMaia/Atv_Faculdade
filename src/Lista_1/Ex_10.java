/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a
em anos, meses e dias. Obs: Apenas para facilitar o cálculo, considere todo ano
com 365 dias e todo mês com 30 dias.
Entrada
O arquivo de entrada contém um valor inteiro.
Saída
Imprima a saída conforme exemplo fornecido.
 */

package Lista_1;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int idade, ano, mes, dia;
        System.out.println("Informa sua idade em dias vividos: ");
        idade = s.nextInt();
        ano = idade/365;
        idade = idade - (365*ano);
        mes = idade/30;
        idade = idade - (30*mes);
        dia = idade;
        System.out.println("Anos: "+ano+" Meses: "+mes+" Dias: "+dia);
    }
}