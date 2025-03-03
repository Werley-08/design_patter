import java.util.Observer;

public interface PersonagemObservavel{

    void notificarObservadores();
    void adicionarObservador(PersonagemObservador o);
}
