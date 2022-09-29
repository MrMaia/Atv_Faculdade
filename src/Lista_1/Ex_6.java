// Calcule o consumo médio de um automóvel sendo fornecidos a distância total
// percorrida (em km) e o total de combustível  gasto (em litros)

// Entrada = o arquivo de entrada contém dois valores: um valor inteiro x,
// representando a distância total percorrida (em km) e um valor real Y,
// representando o total de combustível gasto, com um dígito após o ponto
// decimal.

// Saída = Apresente o valor que representa o consumo médio do automóvel,
// seguido da mensagem "km/l"

package Lista_1;

import java.util.Scanner;

public class Ex_6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int distanciakm;
        double totalgasosa, mediagasto;
        System.out.println("Informe o total de distância percorrida em km: ");
        distanciakm = s.nextInt();
        System.out.println("Informe o total de combustivel gasto em litros: ");
        totalgasosa = s.nextDouble();
        mediagasto = distanciakm / totalgasosa;
        System.out.println(mediagasto + " km/l");
    }
}