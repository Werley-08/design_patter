public class Main {
    public static void main(String[] args) {

        Comprador comprador = new Comprador(new Chevrolet());

        IVeiculo moto = comprador.comprarVeiculo("Moto");
        System.out.println(moto.getTipo() + " da marca " + comprador.getMarca() + " tem " + moto.getQtdRodas() + " rodas");

        IVeiculo carro = comprador.comprarVeiculo("Carro");
        System.out.println(carro.getTipo() + " da marca " + comprador.getMarca() + " tem " + carro.getQtdRodas() + " rodas");

        IVeiculo caminhao = comprador.comprarVeiculo("Caminhao");
        System.out.println(caminhao.getTipo() + " da marca " + comprador.getMarca() + " tem " + caminhao.getQtdRodas() + " rodas");

        comprador.setConsecionaria(new Nissan());

        moto = comprador.comprarVeiculo("Moto");
        System.out.println(moto.getTipo() + " da marca " + comprador.getMarca() + " tem " + moto.getQtdRodas() + " rodas");

        carro = comprador.comprarVeiculo("Carro");
        System.out.println(carro.getTipo() + " da marca " + comprador.getMarca() + " tem " + carro.getQtdRodas() + " rodas");

        caminhao = comprador.comprarVeiculo("Caminhao");
        System.out.println(caminhao.getTipo() + " da marca " + comprador.getMarca() + " tem " + caminhao.getQtdRodas() + " rodas");
    }
}