public class SanduicheDecorator implements Sanduiche{

    protected Sanduiche sanduicheDecorator;

    public SanduicheDecorator(Sanduiche sanduiche) {
        this.sanduicheDecorator = sanduiche;
    }

    @Override
    public String getIngrediente() {
        return sanduicheDecorator.getIngrediente();
    }

}
