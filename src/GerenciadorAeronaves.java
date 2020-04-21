import java.util.ArrayList;
import java.util.List;

public class GerenciadorAeronaves {
    private List<Aeronave> lista;

    private GerenciadorAeronaves() {lista = new ArrayList<>();}

    private static GerenciadorAeronaves instance;

    public static GerenciadorAeronaves getInstance(){
        if(instance==null){
            instance= new GerenciadorAeronaves();
        }
        return instance;
    }

    public void insert(Aeronave aeronave){
        lista.add(aeronave);
    }

    public Aeronave search(String codigo){
        for(Aeronave a:lista){
            if(a.getCodigo().equals(codigo))
                return a;
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
        String ax = "Gerenciador de Aeronaves\n _______________________ \n";
        ax+=String.format("%3s %29s %13s", "Código","Descrição","Capacidade")+"\n";
        for (Aeronave a: lista) {
            ax += a.toString()+"\n";
        }
        return ax;
    }
}
