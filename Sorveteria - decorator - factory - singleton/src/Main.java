import decorator.ISorvete;
import enums.BasesSorvete;
import enums.SaboresSorvete;
import fabric.Cliente;
import fabric.Lanchonete;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Lanchonete lanchonete = Lanchonete.getInstance();
        Cliente cliente = new Cliente(lanchonete);

        ISorvete sorvete1 = cliente.escolherBase(BasesSorvete.LEITE);
        sorvete1 = cliente.escolherSabores(SaboresSorvete.CHOCOLATE, sorvete1);
        sorvete1 = cliente.escolherSabores(SaboresSorvete.MORANGO, sorvete1);
        lanchonete.adicionarPedido(sorvete1);

        ISorvete sorvete2 = cliente.escolherBase(BasesSorvete.LEITE_SEM_LACTOSE);
        sorvete2 = cliente.escolherSabores(SaboresSorvete.LIMAO, sorvete2);
        sorvete2 = cliente.escolherSabores(SaboresSorvete.CHOCOLATE, sorvete2);
        lanchonete.adicionarPedido(sorvete2);

        ISorvete sorvete3 = cliente.escolherBase(BasesSorvete.LEITE);
        sorvete3 = cliente.escolherSabores(SaboresSorvete.MARACUJA, sorvete3);
        lanchonete.adicionarPedido(sorvete3);

        ArrayList<ISorvete> pedidos = lanchonete.getPedidos();

        for(ISorvete pedido : pedidos){

            System.out.println(pedido.getIngrediente());

        }
    }
}