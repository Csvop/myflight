import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> lista;

    private GerenciadorAeroportos() {lista = new ArrayList<>();}

    private static GerenciadorAeroportos instance;

    public static GerenciadorAeroportos getInstance(){
        if(instance==null){
            instance= new GerenciadorAeroportos();
        }
        return instance;
    }

    public void insert(Aeroporto aeroporto){
        lista.add(aeroporto);
    }

    public Aeroporto search(String codigo){
        for(Aeroporto a:lista){
            if(a.getCodigo() == codigo)
                return a;
        }
        return null;
    }

    @Override
    public String toString(){
        String ax = "Gerenciador de Aeroportos\n _______________________ \n";
        for (Aeroporto b: lista) {
            ax += b.toString()+"\n";
        }
        return ax;
    }
}
