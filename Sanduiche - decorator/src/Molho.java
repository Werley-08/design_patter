public class Molho extends SanduicheDecorator{

    Molho(Sanduiche sanduiche) {

        super(sanduiche);

    }

    @Override
    public String getIngrediente() {
        return super.getIngrediente() + ", Molho";

    }

}
