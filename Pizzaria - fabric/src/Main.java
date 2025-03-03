public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(new FabricaPizzaWerley());

        System.out.println(cliente.pedirPizza("Calabresa").getTipo() + cliente.getFabricaPizzaAssinatura());

        System.out.println(cliente.pedirPizza("Mussarela").getTipo()  + cliente.getFabricaPizzaAssinatura());

        cliente.setFabricaPizza(new FabricaPizzaMiqueias());

        System.out.println(cliente.pedirPizza("Calabresa").getTipo()  + cliente.getFabricaPizzaAssinatura());

        System.out.println(cliente.pedirPizza("Mussarela").getTipo()  + cliente.getFabricaPizzaAssinatura());
    }
}