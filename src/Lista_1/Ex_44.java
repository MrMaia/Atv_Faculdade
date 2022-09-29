/*
Faça um programa que leia cinco números com dupla precisão(double)
diferentes entre si e imprima: a Média dos ímpares, o Maior número par e a
Diferença entre o maior e o menor número informado.
Entrada
A entrada deve conter os cinco valores reais recebidos.
Saída
Seu programa deverá imprimir a Média dos ímpares, o Maior número par e a
Diferença entre o maior e o menor número informado.
 */

package Lista_1;

import java.util.Scanner;

public class Ex_44 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double numero;

        int maior_par = 0, maior = 0, menor = 0, soma = 0, q_impar = 0, i;

        for(i = 1; i < 6; i++) {

            System.out.printf("Informe %d número: ", i);
            numero = s.nextDouble();

            if(numero % 2 != 0) {

                soma = (int) (soma + numero);
                q_impar++;

            } else if(maior_par == 0 || numero > maior_par) {

                maior_par = (int) numero;
            }

            if(i == 1 || numero > maior) {

                maior = (int) numero;
            }

            if(i == 1 || numero < menor) {

                menor = (int) numero;
            }
        }

        System.out.println("Média dos impares: " + (soma / q_impar));
        System.out.println("Maior número Par: " + maior_par);
        System.out.println("Diferença: " + (maior - menor));
    }
}