public class FabricaPizzaWerley implements FabricaPizzaAbstrata {

    FabricaPizzaWerley() {}

    public String getAssinatura() {
        return " Do Werley";
    }

    public IPizza fazerPizza(String tipo){

             if(tipo.equals("Calabresa")){ return new Calabresa(); }
        else if(tipo.equals("Mussarela")){ return new Mussarela(); }
        else { return new Calabresa(); }
    }
}