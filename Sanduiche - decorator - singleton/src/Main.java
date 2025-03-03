public class Main {
    public static void main(String[] args) {

        // Criação dos sanduiches
        ISanduiche sanduiche1 = new SanduicheBase();
        sanduiche1 = new Carne(sanduiche1);
        sanduiche1 = new Alface(sanduiche1);
        sanduiche1 = new Presunto(sanduiche1);

        ISanduiche sanduiche2 = new SanduicheBase();
        sanduiche2 = new Carne(sanduiche2);
        sanduiche2 = new Queijo(sanduiche2);
        sanduiche2 = new Tomate(sanduiche2);

        // Criação da hamburgueria
        Hamburgueria hamburgueria = Hamburgueria.getInstance();

        // Adição dos pedidos
        hamburgueria.addPedido(sanduiche1);
        hamburgueria.addPedido(sanduiche2);

        for(ISanduiche sanduiche : hamburgueria.getPedidos()){
            System.out.println(sanduiche.getIngrediente());
        }
    }
}