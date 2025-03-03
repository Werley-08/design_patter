package decorator;

public class SorveteBaseLeite implements ISorvete {

    public SorveteBaseLeite() {
    }

    @Override
    public String getIngrediente(){
        return "Esse sorvete tem leite";
    }
}