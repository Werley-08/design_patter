public class Carne extends SanduicheDecorator {

    public Carne(ISanduiche sanduiche) {
        super(sanduiche);
    }

    public String getIngrediente() {
        return sanduiche.getIngrediente() + ", Carne";
    }
}
