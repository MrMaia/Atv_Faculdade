package Lista_2_Ex3;

import java.util.Scanner;

public class MTransporte extends Terrestre{

    public int id;
    public int ano;
    public String modelo;
    public double carga_maxima;

    public void consumo() {

        double total;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a carga maxima do Transporte: ");
        carga_maxima = sc.nextDouble();

        System.out.println("Informe a potencia do Transporte: ");
        potencia = sc.nextDouble();

        total = (potencia * carga_maxima) / 100;

        System.out.printf("O consumo médio é de: %.2f", total);
    }
}