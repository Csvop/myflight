import java.util.ArrayList;
import java.util.List;

public class GerenciadorRotas {
    private ArrayList<Rota> lista;

    private GerenciadorRotas() {lista = new ArrayList<>();}

    private static GerenciadorRotas instance;

    public static GerenciadorRotas getInstance(){
        if(instance==null){
            instance= new GerenciadorRotas();
        }
        return instance;
    }

    public void insert(Rota rota){
        lista.add(rota);
    }

    public Rota searchOrigem(Aeroporto origem){
        for(Rota r:lista){
            if(r.getOrigem()==origem)
                return r;
        }
        return null;
    }

    public Rota searchDestino(Aeroporto destino){
        for(Rota r:lista){
            if(r.getDestino()==destino)
                return r;
        }
        return null;
    }

    public List getList() {
        return lista;
    }

    public void print(){
        for (Object a: lista) {
            System.out.println(a);
        }
    }

    @Override
    public String toString(){
        String ax = "Gerenciador de Rotas\n _______________________ \n";
        ax+=String.format("%10s %10s %10s %10s", "Cia Aérea","Origem","Destino","Aeronave")+"\n";
        for (Rota r: lista) {
            ax += r.toString()+"\n";
        }
        return ax;
    }
}
