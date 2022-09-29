/*
Você deve fazer um programa que apresente a sequência conforme o exemplo
abaixo.
Entrada
Não tem entrada.
Saída
Imprima a sequência conforme exemplo abaixo.
 */

package Lista_1;

public class Ex_28 {

    public static void main(String[] args) {

        int i, j;

        for (i = 1, j = 60; j != -5; i += 3, j -= 5) {

            System.out.printf("L = [%d], J = [%d] \n ", i, j);
        }
    }
}