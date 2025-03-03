public class FabricaPizzaMiqueias implements FabricaPizzaAbstrata {

    FabricaPizzaMiqueias() {}

    public String getAssinatura(){
        return " Do Miqueias";
    }

    public IPizza fazerPizza(String tipo){

        if(tipo.equals("Calabresa")){ return new Calabresa(); }
        else if(tipo.equals("Mussarela")){ return new Mussarela(); }
        else { return new Calabresa(); }
    }
}