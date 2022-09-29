/*
Leia um valor inteiro X. Em seguida apresento os 6 valores ímpares
consecutivos a partir do X, um valor por linha, Inclusive o X se for o caso.
Entrada
A entrada será um valor inteiro positivo.
Saída
A saída será uma sequência de seis números ímpares.
 */

package Lista_1;

import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int valor;
        System.out.println("Digite um número inteiro: ");
        valor = s.nextInt();
        if(valor % 2 == 0){
            System.out.println(valor = valor+1);
            System.out.println(valor = valor+2);
            System.out.println(valor = valor+2);
            System.out.println(valor = valor+2);
            System.out.println(valor = valor+2);
            System.out.println(valor = valor+2);
        }else{
            System.out.println(valor = valor+2);
            System.out.println(valor = valor+2);
            System.out.println(valor = valor+2);
            System.out.println(valor = valor+2);
            System.out.println(valor = valor+2);
            System.out.println(valor = valor+2);
        }
    }
}