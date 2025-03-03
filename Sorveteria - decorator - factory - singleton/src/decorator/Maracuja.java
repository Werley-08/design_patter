package decorator;

public class Maracuja extends SorveteDecorator {

    public Maracuja(ISorvete sorvete){
        super(sorvete);
    }

    public String getIngrediente(){
        return sorvete.getIngrediente() + ", Maracujá";
    }
}