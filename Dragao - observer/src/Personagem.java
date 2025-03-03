import java.util.ArrayList;

public class Personagem implements PersonagemObservavel {

    ArrayList<PersonagemObservador> observadores;
    int ovosColetados;

    public Personagem(){
        observadores = new ArrayList<>();
        this.ovosColetados = 0;
    }

    public void adicionarOvosColetados(int ovosColetados){

        this.ovosColetados += ovosColetados;
        System.out.println(this.ovosColetados + " ovos coletados");
        if(getOvosColetados() >= 100){ notificarObservadores(); }
    }

    public int getOvosColetados(){
        return this.ovosColetados;
    }

    @Override
    public void notificarObservadores(){
        for(PersonagemObservador o : observadores){
            o.PersonagemColetou100Ovos();
        }
    }

    @Override
    public void adicionarObservador(PersonagemObservador o){
        observadores.add(o);
    }
}