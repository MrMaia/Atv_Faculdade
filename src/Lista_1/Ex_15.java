/*
A sequência de números 0 1 1 2 3 5 6 8 13 21 ... é conhecida como série de
Fibonacci. Nesta sequência, cada número, depois dos 2 primeiros, é igual à soma
dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N
primeiros números dessa série.
Entrada
O arquivo de entrada contém um valor inteiro N (0 < N< 46).
Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em
branco. Não deve haver espaço após o último valor.
 */

package Lista_1;

import java.util.Scanner;

public class Ex_15 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N;
        int proximo, anterior = 0, atual = 1;
        System.out.println("Insira um número inteiro: ");
        N = s.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i == N)
                System.out.println(anterior);
            else
                System.out.print(anterior + " ");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}