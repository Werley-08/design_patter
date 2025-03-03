package decorator;

public class SorveteBaseLeiteSemLactose implements ISorvete {

    public SorveteBaseLeiteSemLactose() {
    }

    @Override
    public String getIngrediente(){
        return "Esse sorvete tem leite sem lactose";
    }
}