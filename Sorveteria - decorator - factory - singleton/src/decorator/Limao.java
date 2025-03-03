package decorator;

public class Limao extends SorveteDecorator {

    public Limao(ISorvete sorvete){
        super(sorvete);
    }

    @Override
    public String getIngrediente(){
        return sorvete.getIngrediente() + ", Limão";
    }
}