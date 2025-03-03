public class Main {
    public static void main(String[] args) {

        Transportadora transportadora = new Transportadora();

        TransportadoraObservador cliente1 = new Cliente();
        TransportadoraObservador cliente2 = new Cliente();
        TransportadoraObservador cliente3 = new Cliente();

        transportadora.adicionarObservador(cliente1);
        transportadora.adicionarObservador(cliente2);
        transportadora.adicionarObservador(cliente3);

        transportadora.setChegou(true);
    }
}