public class Comprador {

    AbstractConsecionaria consecionaria;

    public Comprador(AbstractConsecionaria consecionaria) {
        this.consecionaria = consecionaria;
    }

    public IVeiculo comprarVeiculo(String tipo){
        return consecionaria.comprarVeiculo(tipo);
    }

    public String getMarca(){
        return consecionaria.getMarca();
    }

    public void setConsecionaria(AbstractConsecionaria consecionaria){
        this.consecionaria = consecionaria;
    }

}
