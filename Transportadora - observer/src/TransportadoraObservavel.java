public interface TransportadoraObservavel {

    void notificarClientes();
    void adicionarObservador(TransportadoraObservador observador);
}
