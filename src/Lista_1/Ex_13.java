/*
Faça um programa que mostre os números pares entre 1 e 100, inclusive.
Entrada
Neste problema extremamente simples de repetição não há entrada.
Saída
Imprima todos os números pares entre 1 e 100, Inclusive se for o caso, um em cada
linha.
 */

package Lista_1;

public class Ex_13 {

    public static void main(String[] args) {

        for (int x = 0; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}