/*
Faça um programa que leia do teclado três valores inteiros e exiba-os em ordem
crescente.
Entrada
O arquivo de entrada contém 3 (três) valores inteiros, representando os valores a
serem ordenados.
Saída
Imprima os valores lidos em ordem crescente.
 */

package Lista_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int valores[] = new int[3];
        for (int x = 0; x < valores.length; x++) {
            System.out.print("Digite o " + (x + 1) + "º valor: ");
            valores[x] = s.nextInt();
        }
        Arrays.sort(valores);

        for (int y = 0; y < valores.length; y++) {
            System.out.println(valores[y]);
        }
    }

}