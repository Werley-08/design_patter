public class Main {
    public static void main(String[] args) {

        Onibus onibus = new Onibus();

        Aluno aluno = new Aluno();

        onibus.adicionarObservador(aluno);

        onibus.setAndando();

        onibus.setParado();

        onibus.setAndando();
    }
}