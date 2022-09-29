/*
Toda apresentação de trabalho tem seus requisitos mínimos, que precisam ser
atendidos, caso contrário, o trabalho não é aceito e o aluno fica com nota 0. A
apresentação de Programação 1 está chegando, e o Professor José deixou claro
que se os trabalhos não passassem por todos os requisitos mínimos, ele não iria
julgar o trabalho.
Eis os requisitos:
● Requisito 1: Interface gráfica ou Inteligência Artificial.
● Requisito 2: Encapsulamento e Indentação.
● Requisito 3: Uso de Structs
Dada a entrada, descubra se o aluno ficou com 0 ou o seu trabalho será avaliado.
Entrada
A entrada é composta de 5 números, representando respectivamente Interface
Gráfica, Inteligência Artificial, Encapsulamento, Indentação e Structs.
Os números podem ser:
0 - Se o trabalho não possui tal quesito.
1 - Se trabalho possui tal quesito.
Saída
Deve imprimir o número 0, se o aluno não atender aos requisitos e ficará com zero,
e a frase "AVALIADO" se ele atendeu aos requisitos mínimos.
 */

package Lista_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_25 {

    public static void main(String[] args) {

        int n1,n2,n3,n4,n5,result;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Informe se os requisitos estão prontos:\n\n0 - Não possui o requisito\n1 - Possui o requisito\n\n- Interface Gráfica\n- Inteligência Artificial\n- Encapsulamento\n- Indentação\n- Structs");
        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();
        n4 = s.nextInt();
        n5 = s.nextInt();
        lista.add(n1);
        lista.add(n2);
        lista.add(n3);
        lista.add(n4);
        lista.add(n5);
        result = lista.get(0)+lista.get(1)+lista.get(2)+lista.get(3)+lista.get(4);
        if(result >= 4) System.out.println("AVALIADO");
        else System.out.println("0 (ZERO)");
    }
}