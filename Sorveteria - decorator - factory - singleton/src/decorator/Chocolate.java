package decorator;

public class Chocolate extends SorveteDecorator {

    public Chocolate(ISorvete sorvete){
        super(sorvete);
    }

    public String getIngrediente(){

        return sorvete.getIngrediente() + ", Chocolate";
    }
}