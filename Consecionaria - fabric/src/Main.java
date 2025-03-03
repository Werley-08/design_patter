public class Main {
    public static void main(String[] args) {

        Comprador comprador = new Comprador(new Consecionaria());

        IVeiculo moto = comprador.comprarVeiculo("Moto");

        System.out.println(moto.getTipo() + " tem " + moto.getQtdRodas() + " rodas");

        IVeiculo carro = comprador.comprarVeiculo("Carro");

        System.out.println(carro.getTipo() + " tem " + carro.getQtdRodas() + " rodas");

        IVeiculo caminhao = comprador.comprarVeiculo("Caminhao");

        System.out.println(caminhao.getTipo() + " tem " + caminhao.getQtdRodas() + " rodas");
    }
}