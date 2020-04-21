import java.util.ArrayList;
import java.util.List;

public class GerenciadorCias {
    private List<CiaAerea> lista;

    private GerenciadorCias() {lista = new ArrayList<>();}

    private static GerenciadorCias instance;

    public static GerenciadorCias getInstance(){
        if(instance==null){
            instance= new GerenciadorCias();
        }
        return instance;
    }

    public void insert(CiaAerea ciaAerea){
        lista.add(ciaAerea);
    }

    public CiaAerea search(String codigo){
        for(CiaAerea c:lista){
            if(c.getCodigo().equals(codigo))
                return c;
        }
        return null;
    }

    public CiaAerea searchName(String nome){
        for(CiaAerea c:lista){
            if(c.getNome().equals(nome))
                return c;
        }
        return null;
    }

    public void print(){
        for (Object a: lista) {
            System.out.println(a);
        }
    }

    public List getList() {
        return lista;
    }

    @Override
    public String toString(){
        String ax = "Gerenciador de Companhias Aereas\n _______________________ \n";
        ax+=String.format("%4s %23s", "Código","Nome")+"\n";
        for (CiaAerea c: lista) {
            ax += c.toString()+"\n";
        }
        return ax;
    }
}
