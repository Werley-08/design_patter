package fabric;

import decorator.ISorvete;
import enums.BasesSorvete;
import enums.SaboresSorvete;

public interface ILanchonete {

    ISorvete escolherBase(BasesSorvete base);
    ISorvete escolherSabores(SaboresSorvete sabor, ISorvete sorvete);
}
