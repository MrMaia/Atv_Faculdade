/*Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2
 notas de um aluno. Calcule a média ponderada do aluno, sabendo que a nota A tem
 peso 3.5 e a nota B tem peso 7.5. A soma dos pesos é 11. Assuma que cada nota
 pode ir de O até 10.0, sempre com uma casa.

 Entrada
 O arquivo de entrada contém 2 valores com uma casa decimal cada um.

 Saída
 Calcule e imprima a variável MÉDIA conforme exemplo abaixo, com um espaço em
 branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double).
 */

package Lista_1;

import java.util.Scanner;

public class Ex_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Informe sua primeira média: ");
        nota1 = s.nextDouble();
        System.out.println("Informe sua segunda média: ");
        nota2 = s.nextDouble();
        if (nota1 < 0) {
            nota1 = 0;
        } else if (nota1 > 10) {
            nota1 = 10;
        }
        if (nota2 < 0) {
            nota2 = 0;
        } else if (nota2 > 10) {
            nota2 = 10;
        }
        media = ((3.5*nota1) + (7*nota2)) / 11;
        System.out.printf("Sua média é: %.5f ", media);
    }
}