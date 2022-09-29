/*
Faça um programa que inverta um número inteiro com quatro algarismos.
Entrada
Você receberá um único número inteiro com quatro algarismos.
Saída
Você deve imprimir o número invertido seguido de um final de linha. Importante: se o
número dado for 3000 por exemplo, o invertido dele deve ser 3 e não 0003.
 */

package Lista_1;

import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {

        int numero;

        System.out.println("Digite um valor: ");
        Scanner s = new Scanner(System.in);
        numero = s.nextInt();
        String b = Integer.toString(numero);
        String c = "";

        for (int i=b.length(); i > 0; i--) {
            c += b.substring(i - 1, i);
        }

        System.out.println("Número invertido: " + c);
    }
}