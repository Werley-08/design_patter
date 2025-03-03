import java.util.ArrayList;

public class Hamburgueria {

    private static Hamburgueria instance;

    private ArrayList<ISanduiche> pedidos;

    private Hamburgueria(){
        pedidos = new ArrayList<ISanduiche>();
    }

    public static Hamburgueria getInstance(){
        if(instance == null){
            instance = new Hamburgueria();
            return instance;
        }
        return instance;
    }

    public void addPedido(ISanduiche sanduiche){
        pedidos.add(sanduiche);
    }

    public ArrayList<ISanduiche> getPedidos(){
        return pedidos;
    }
}
