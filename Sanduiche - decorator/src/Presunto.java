public class Presunto extends SanduicheDecorator{

    Presunto(Sanduiche sanduiche) {

        super(sanduiche);

    }

    @Override
    public String getIngrediente() {
        return super.getIngrediente() + ", Presunto";

    }

}
