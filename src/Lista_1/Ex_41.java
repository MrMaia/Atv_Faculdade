/*
Elabore um programa que permita receber o peso (double) e a altura (double) de
uma pessoa adulta. O programa deverá exibir uma das seguintes mensagens:
“Parabéns peso ideal”, “Engorde XXX Kg” ou “Emagreça XXX Kg” de acordo com a
tabela abaixo:
Entrada
Serão recebidos dois valores com dupla precisão (double) referente ao PESO e a
ALTURA.
Saída
Será informado uma das mensagens: “Parabéns peso ideal!”, “Engorde XXX kg" ou
“Emagreça XXX kg”.

 */

package Lista_1;

import java.util.Scanner;

public class Ex_41 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double altura, peso, pesoideal = 0;
        double total = 0;

        System.out.println("Informe a altura da pessoa: ");
        altura = s.nextDouble();

        System.out.println("Informe o peso da pessoa: ");
        peso = s.nextDouble();

        if(altura <= 1.50) {

            pesoideal = 50;

        } else if(altura > 1.50 && altura <= 1.90) {

            pesoideal = 70;

        } else {

            pesoideal = 100;
        }

        calcular_peso(peso, pesoideal, total);

    }

    private static void calcular_peso(double peso, double pesoideal, double total) {

        total = peso - pesoideal;

        if(total > 0) {

            System.out.println("Emagreça: " + total + " kg ");
        }

        if(total < 0) {

            System.out.println("Engorde: " + Math.abs(total) + " kg ");

        } else {

            System.out.println("Parabens, peso ideal");
        }
    }
}