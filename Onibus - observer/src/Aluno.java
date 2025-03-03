public class Aluno implements OnibusObservador {

    public Aluno(){

    }

    @Override
    public void onibusMudouEstado(String estado){
        System.out.println("O onibus está " + estado);
    }
}
