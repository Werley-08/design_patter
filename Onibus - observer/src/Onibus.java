import java.util.ArrayList;

public class Onibus implements OnibusObservavel {

    ArrayList<OnibusObservador> observadores;
    String estado;

    public Onibus(){
        this.observadores = new ArrayList<>();
        this.estado =  "Parado";
    }

    public void setAndando(){
        this.estado = "Andando";
        notificarObservadores();
    }

    public void setParado(){
        this.estado = "Parado";
        notificarObservadores();
    }

    @Override
    public void notificarObservadores(){
        for(OnibusObservador o : observadores){
            o.onibusMudouEstado(this.estado);
        }
    }

    @Override
    public void adicionarObservador(OnibusObservador observador){
        this.observadores.add(observador);
    }

}
