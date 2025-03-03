public class Cliente implements TransportadoraObservador {

    public Cliente(){
    }

    @Override
    public void encomendaChegou(boolean chegou){

        if(chegou){
            System.out.println("Indo buscar encomenda");
        }else{
            System.out.println("Esperando a escomenda chegar");
        }
    }
}
