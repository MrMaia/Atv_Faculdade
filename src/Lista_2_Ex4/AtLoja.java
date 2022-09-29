package Lista_2_Ex4;

public class AtLoja {

    public static void main(String[] args) {

        Item_Loja it = new Item_Loja();
        Alimento a = new Alimento();
        Ferramenta f = new Ferramenta();

        it.setCodigo_item(32);
        a.setSelo(4987);
        f.setSerial(4583);

        System.out.println("Código do Item: " + it.getidentificador());
        System.out.println("Selo: " + a.getidentificador());
        System.out.println("Serial: " + f.getIdentificador());

        f.setCategoria("Verduras");
        it.setNome_item("Tomate");
        it.setDescricao_item("Comida");
        f.separa(6,00);

        System.out.println("Categoria: " + f.separar());
        System.out.println("Nome: " + it.getNome_item());
        System.out.println("Descrição: " + it.getDescricao_item());
        System.out.println("Valor: " + f.valor_item);
    }

}