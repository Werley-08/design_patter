import java.util.Observer;

public class Dragao implements PersonagemObservador{

    String estado;

    public Dragao(){
        estado = "Dormindo";
    }

    public void setAcordado(){
        if(estado.equals("Dormindo")){
            estado = "Acordado";
            System.out.println("Cuidado! O Dragão Acordou");
        }
    }

    public void SetDormindo(){
        if(estado.equals("Acordado")){
            estado = "Dormindo";
        }
    }

    public String getEstado(){
        return estado;
    }

    @Override
    public void PersonagemColetou100Ovos(){
        setAcordado();
    }
}
