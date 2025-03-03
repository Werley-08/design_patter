public class Comprador {

    Consecionaria consecionaria;

    public Comprador(Consecionaria consecionaria) {
        this.consecionaria = consecionaria;
    }

    public IVeiculo comprarVeiculo(String tipo){
        return consecionaria.comprarVeiculo(tipo);
    }
}
