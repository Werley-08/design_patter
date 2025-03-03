public class Queijo extends SanduicheDecorator{

    Queijo(Sanduiche sanduiche) {

        super(sanduiche);

    }

    @Override
    public String getIngrediente() {
        return super.getIngrediente() + ", Queijo";

    }

}
