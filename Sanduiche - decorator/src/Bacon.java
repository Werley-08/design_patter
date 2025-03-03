public class Bacon extends SanduicheDecorator{

    Bacon(Sanduiche sanduiche) {

        super(sanduiche);

    }

    @Override
    public String getIngrediente() {
        return super.getIngrediente() + ", Bacon";

    }

}
