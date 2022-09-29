/*
Faça um programa que receba via teclado o tempo de duração de um evento em
uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e mostre-o
expresso em horas, minutos e segundos.
Entrada
O arquivo de entrada contém valores com inteiros (int) referente a quantidade de
segundos informada.
Saída
Imprima a conversão realizada em HH (horas), MM (minutos) e Segundos (SS).
 */

package Lista_1;

import java.util.Scanner;

public class Ex_9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int valor, segundos, horas, minutos;
        System.out.println("Insira a duração do evento em segundos: ");
        valor = s.nextInt();
        horas = valor / 3600;
        minutos = (valor - (horas * 3600)) / 60;
        segundos = valor - (horas * 3600) - (minutos * 60);
        System.out.printf("HH:MM:SS = " + horas + ":" + minutos + ":" + segundos);
    }
}