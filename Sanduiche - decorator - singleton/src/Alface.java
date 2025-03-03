public class Alface extends SanduicheDecorator {

    public Alface(ISanduiche sanduiche) {
        super(sanduiche);
    }

    public String getIngrediente() {
        return sanduiche.getIngrediente() + ", Alface";
    }
}
