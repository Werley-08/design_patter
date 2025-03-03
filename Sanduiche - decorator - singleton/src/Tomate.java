public class Tomate extends SanduicheDecorator {

    public Tomate(ISanduiche sanduiche) {
        super(sanduiche);
    }

    public String getIngrediente() {
        return sanduiche.getIngrediente() + ", Tomate";
    }
}
