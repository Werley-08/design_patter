public class Queijo extends SanduicheDecorator {

    public Queijo(ISanduiche sanduiche) {
        super(sanduiche);
    }

    public String getIngrediente() {
        return sanduiche.getIngrediente() + ", Queijo";
    }
}
