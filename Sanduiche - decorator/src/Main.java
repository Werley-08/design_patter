public class Main{
    public static void main(String[] args){

        Sanduiche sanduiche = new SanduicheBase();
        System.out.println(sanduiche.getIngrediente());

        sanduiche = new Alface(sanduiche);
        System.out.println(sanduiche.getIngrediente());

        sanduiche = new Bacon(sanduiche);
        System.out.println(sanduiche.getIngrediente());

        sanduiche = new Carne(sanduiche);
        System.out.println(sanduiche.getIngrediente());

        sanduiche = new Molho(sanduiche);
        System.out.println(sanduiche.getIngrediente());

        sanduiche = new Presunto(sanduiche);
        System.out.println(sanduiche.getIngrediente());

        sanduiche = new Queijo(sanduiche);
        System.out.println(sanduiche.getIngrediente());
    }
}