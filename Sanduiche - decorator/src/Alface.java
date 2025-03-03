public class Alface extends SanduicheDecorator{

    Alface(Sanduiche sanduiche) {

        super(sanduiche);

    }

    @Override
    public String getIngrediente() {
        return super.getIngrediente() + ", Alface";

    }

}
