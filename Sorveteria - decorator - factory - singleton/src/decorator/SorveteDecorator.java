package decorator;

public abstract class SorveteDecorator implements ISorvete {

    ISorvete sorvete;

    SorveteDecorator(ISorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public String getIngrediente(){
       return sorvete.getIngrediente();
    }
}