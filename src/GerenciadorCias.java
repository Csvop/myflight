import java.util.ArrayList;

public class GerenciadorCias {
    private ArrayList<CiaAerea> lista;

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
            if(c.getCodigo() == codigo)
                return c;
        }
        return null;
    }

    public CiaAerea searchName(String nome){
        for(CiaAerea c:lista){
            if(c.getNome() == nome)
                return c;
        }
        return null;
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
