public class SanduicheDecorator implements ISanduiche {

    ISanduiche sanduiche;

    SanduicheDecorator(ISanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public String getIngrediente(){
        return sanduiche.getIngrediente();
    }
}
