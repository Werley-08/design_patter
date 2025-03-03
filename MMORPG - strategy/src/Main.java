public class Main {
    public static void main(String[] args) {

        IEspada espadaUmaMao = new EspadaUmaMao();
        IEspada espadaDuasMaos = new EspadaDuasMaos();

        System.out.println(espadaUmaMao.getDanoPorAtaque());
        System.out.println(espadaDuasMaos.getDanoPorAtaque());

    }
}