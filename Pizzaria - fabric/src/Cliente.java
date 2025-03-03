public class Cliente {

    FabricaPizzaAbstrata fabricaPizza;

    public Cliente(FabricaPizzaAbstrata fabricaPizza) {
        this.fabricaPizza = fabricaPizza;
    }

    public IPizza pedirPizza(String tipo){
        return fabricaPizza.fazerPizza(tipo);
    }

    public void setFabricaPizza(FabricaPizzaAbstrata fabricaPizza) {
        this.fabricaPizza = fabricaPizza;
    }

    public String getFabricaPizzaAssinatura() {
        return fabricaPizza.getAssinatura();
    }

}
