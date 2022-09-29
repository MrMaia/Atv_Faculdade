/*
Faça um programa que leia do teclado três valores inteiros e exiba o maior e
menor entre eles.
Entrada
O arquivo de entrada contém 3 (três) valores inteiros, representando os valores a
serem verificados.
Saída
Imprima o maior e menor entre os valores lidos
 */

package Lista_1;

import java.util.Scanner;

public class Ex_4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int valor[] = new int[3];
        int maior = valor[0], menor = Integer.MAX_VALUE;
        for(int i = 0; i < valor.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            valor[i] = s.nextInt();
            if(valor[i] > maior){
                maior = valor[i];
            }
        }
        for (int j = 0; j < valor.length; j++) {
            if(valor[j] < menor){
                menor = valor[j];
            }
        }
        System.out.println("Maior valor = "+ maior);
        System.out.println("Menor valor = "+ menor);
    }

}