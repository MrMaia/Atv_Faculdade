package Lista_2_Ex2;

import java.util.Scanner;

public class AtProduto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();

        System.out.println("Informe o id do Produto: ");
        p.setId(sc.nextInt());

        System.out.println(p.getId());

        sc.close();

    }

}