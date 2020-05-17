import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorAeroportos {
    private List<Aeroporto> lista;

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
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                double lat=Double.parseDouble(dados[2]);
                double lon=Double.parseDouble(dados[3]);
                insert(new Aeroporto(dados[0],dados[1],new Geo(lat ,lon)));
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        return true;
    }

    @Override
    public String toString(){
        String ax = "Gerenciador de Aeroportos\n _______________________ \n";
        ax+=String.format("%3s %29s %12s %10s", "Código","Nome","Latitiude","Longitude")+"\n";
        for (Aeroporto a: lista) {
            ax += a.toString()+"\n";
        }
        return ax;
    }
}
