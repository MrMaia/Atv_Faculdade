/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma
duração mínima de 1 hora e máxima de 24 horas.
Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de
fim do jogo.
Saída
Apresente a duração do jogo conforme exemplo abaixo.
 */

package Lista_1;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int hora, hora2;
        System.out.println("Informe a hora de início do jogo: ");
        hora = s.nextInt();
        System.out.println("Infome a hora de término do jogo: ");
        hora2 = s.nextInt();
        if (hora > hora2) {
            System.out.println("O jogo durou: " + (24 - (hora - hora2)) + " hora(s)");
        } else if (hora2 > hora) {
            System.out.println("O jogo durou: " + (hora2 - hora) + " hora(s)");
        } else {
            System.out.println("O jogo durou 24 hora(s)");
        }
    }
}