package fabric;

import decorator.*;
import enums.BasesSorvete;
import enums.SaboresSorvete;

import java.util.ArrayList;

public class Lanchonete implements ILanchonete {

    private static Lanchonete instance;
    private final ArrayList<ISorvete> pedidos;

    private Lanchonete(){
        pedidos = new ArrayList<>();
    }

    public static Lanchonete getInstance(){
        if(instance == null){
            return new Lanchonete();
        }
        return instance;
    }

    @Override
    public ISorvete escolherBase(BasesSorvete base){

        if(BasesSorvete.LEITE == base) { return new SorveteBaseLeite(); }
        if(BasesSorvete.LEITE_SEM_LACTOSE == base) { return new SorveteBaseLeiteSemLactose(); }

        return null;
    }

    @Override
    public ISorvete escolherSabores(SaboresSorvete sabor, ISorvete sorvete){

        if(SaboresSorvete.CHOCOLATE == sabor) { return new Chocolate(sorvete); }
        if(SaboresSorvete.LIMAO == sabor) { return new Limao(sorvete); }
        if(SaboresSorvete.MARACUJA == sabor) { return new Maracuja(sorvete); }
        if(SaboresSorvete.MORANGO == sabor) { return new Morango(sorvete); }

        return null;
    }

    public void adicionarPedido(ISorvete pedido){
        this.pedidos.add(pedido);
    }

    public ArrayList<ISorvete> getPedidos(){
        return this.pedidos;
    }
}