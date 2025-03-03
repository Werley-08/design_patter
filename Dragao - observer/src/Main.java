public class Main {
    public static void main(String[] args) {

        Personagem personagem = new Personagem();
        Dragao dragao = new Dragao();

        personagem.adicionarObservador(dragao);

        for(int i = 0; i < 12; i++){

            personagem.adicionarOvosColetados(10);

        }

        System.out.println("O estado final do dragão é " + dragao.getEstado());

    }
}