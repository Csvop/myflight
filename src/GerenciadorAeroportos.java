import java.util.ArrayList;

public class GerenciadorAeroportos implements Contrato{
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
            if(a.getCodigo().equals(codigo))
                return a;
        }
        return null;
    }

    @Override
    public String toString(){
        String ax = "Gerenciador de Aeroportos\n _______________________ \n";
        ax+=String.format("%3s %29s %12s %10s", "Código","Nome","Latitiude","Longitude")+"\n";
        for (Aeroporto b: lista) {
            ax += b.toString()+"\n";
        }
        return ax;
    }
}
