/*
 Escreva um programa que leia o número de um funcionário, seu número de horas
 trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário.
 A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 Entrada
 O arquivo de entrada contém 2 números inteiros e 1 número com duas casas
 decimais, representando o número, quantidade de horas trabalhadas e o valor que o
 funcionário recebe por hora trabalhada, respectivamente.
 Saída
 Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um
 espaço em branco antes e depois da igualdade. No caso do salário, também deve
 haver um espaço em branco após o R$
 */

package Lista_1;

import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numerof, horas;
        double shora, salario;
        System.out.println("Informe seu número: ");
        numerof = s.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        horas = s.nextInt();
        System.out.println("Informe quanto você ganha por hora: ");
        shora = s.nextDouble();
        salario = horas * shora;
        System.out.println("Seu número é: " + numerof);
        System.out.println("Seu salário é de R$" + salario);
    }

}