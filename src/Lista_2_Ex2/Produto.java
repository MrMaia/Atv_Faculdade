
package Lista_2_Ex2;

import java.util.Date;

public class Produto {

    private static int id;
    private static String nome;
    private static String descricao;
    private static Date validade;

    public static int getId() {

        return id;
    }

    public static void setId(int id) {

        Produto.id = id;

    }
}