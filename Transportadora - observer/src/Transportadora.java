import java.util.ArrayList;

public class Transportadora implements TransportadoraObservavel {

    ArrayList<TransportadoraObservador> observadores;
    private boolean chegou;

    public Transportadora(){
        observadores = new ArrayList<>();
        chegou = false;
    }

    public void setChegou(boolean chegou){

        this.chegou = chegou;

        if(chegou) { notificarClientes(); }
    }

    @Override
    public void notificarClientes(){
        for(TransportadoraObservador o : observadores){
            o.encomendaChegou(chegou);
        }
    }
    @Override
    public void adicionarObservador(TransportadoraObservador observador){
        observadores.add(observador);
    }
}
