public class Exercito{

    IArma arma;

    public Exercito(IArma arma){
        this.arma = arma;
    }

    public String getArma(){
        return arma.getArma();
    }

    public void setArma(IArma arma){ this.arma = arma; }

    public String atirar(){
        return arma.atirar();
    }
}
