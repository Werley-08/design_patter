public class Chevrolet implements AbstractConsecionaria{

    IVeiculo veiculo;

    Chevrolet() {
    }

    public IVeiculo comprarVeiculo(String tipo) {

             if(tipo.equals("Moto")) { return new Moto(); }
        else if(tipo.equals("Carro")) { return new Carro(); }
        else if(tipo.equals("Caminhao")) { return new Caminhao(); }
        else { return null; }
    }

    public String getMarca() {
        return "Chevrolet";
    }
}