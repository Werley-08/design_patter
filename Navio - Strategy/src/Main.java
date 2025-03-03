public class Main {
    public static void main(String[] args) {

        Exercito exercito = new Exercito(new Canhao());

        System.out.println(exercito.getArma() + exercito.atirar());

        exercito.setArma(new Bomba());

        System.out.println(exercito.getArma() + exercito.atirar());

        exercito.setArma(new Tanque());

        System.out.println(exercito.getArma() + exercito.atirar());

    }
}