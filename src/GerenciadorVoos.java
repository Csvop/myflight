import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> lista;

    private GerenciadorVoos() {lista = new ArrayList<>();}

    private static GerenciadorVoos instance;

    public static GerenciadorVoos getInstance(){
        if(instance==null){
            instance= new GerenciadorVoos();
        }
        return instance;
    }

    public void insert(Voo voo){
        lista.add(voo);
    }

    public Voo searchDate(LocalDateTime date){
        for(Voo v:lista){
            if(v.getDate()==date)
                return v;
        }
        return null;
    }

    @Override
    public String toString(){
        String ax = "Gerenciador de Voos\n _______________________ \n";
        for (Voo r: lista) {
            ax += r.toString()+"\n";
        }
        return ax;
    }
}
