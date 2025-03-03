package decorator;

public class Morango extends SorveteDecorator {

    public Morango(ISorvete sorvete){
        super(sorvete);
    }

    public String getIngrediente(){

        return sorvete.getIngrediente() + ", Morango";
    }
}