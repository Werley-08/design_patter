public class Presunto extends SanduicheDecorator {

    public Presunto(ISanduiche sanduiche) {
        super(sanduiche);
    }

    public String getIngrediente() {
        return sanduiche.getIngrediente() + ", Presunto";
    }
}
