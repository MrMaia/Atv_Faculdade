/*
Elabore um programa que permita exibir na tela a tabuada de um número inteiro
informado via teclado.
Entrada
Será recebido um número inteiro positivo.
Saída
Será exibido uma tabuada de acordo com o formato abaixo.

 */

package Lista_1;

import java.util.Scanner;

public class Ex_39{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n, i;

        System.out.println("Informe um número para a sua tabuada: ");
        n = s.nextInt();

        for(i = 0; i < 10; i++) {

            System.out.printf(" %d * %d = %d \n", i, n, (i * n));
        }
    }
}