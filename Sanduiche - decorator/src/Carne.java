public class Carne extends SanduicheDecorator{

    Carne(Sanduiche sanduiche) {

        super(sanduiche);

    }

    @Override
    public String getIngrediente() {
        return super.getIngrediente() + ", Carne";

    }

}
