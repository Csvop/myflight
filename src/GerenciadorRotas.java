import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public boolean readFile(String nomeArq) {
        Path path= Paths.get(nomeArq);
        GerenciadorCias ciasAereas = GerenciadorCias.getInstance();
        GerenciadorAeronaves aeronaves = GerenciadorAeronaves.getInstance();
        GerenciadorAeroportos aeroportos = GerenciadorAeroportos.getInstance();
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                int cod_rota=Integer.parseInt(dados[0]);
                insert(new Rota(cod_rota,ciasAereas.search(dados[1]),aeroportos.search(dados[2]),aeroportos.search(dados[3]),aeronaves.search(dados[4])));
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        return true;
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
