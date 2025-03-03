package fabric;

import decorator.*;
import enums.BasesSorvete;
import enums.SaboresSorvete;

public class Cliente {

    ILanchonete lanchonete;

    public Cliente(ILanchonete lanchonete) {
        this.lanchonete = lanchonete;
    }

    public void setLanchonete(ILanchonete lanchonete) {
        this.lanchonete = lanchonete;
    }

    public ISorvete escolherBase(BasesSorvete base){
        return lanchonete.escolherBase(base);
    }

    public ISorvete escolherSabores(SaboresSorvete sabor, ISorvete sorvete){
        return lanchonete.escolherSabores(sabor, sorvete);
    }
}