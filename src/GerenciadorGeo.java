import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GerenciadorGeo {
    private ArrayList<Geo> lista;

    private GerenciadorGeo() {lista = new ArrayList<>();}

    private static GerenciadorGeo instance;

    public static GerenciadorGeo getInstance(){
        if(instance==null){
            instance= new GerenciadorGeo();
        }
        return instance;
    }

    public void insert(Geo geo){
        lista.add(geo);
    }

    public boolean readFile(String nomeArq) {
        Path path= Paths.get(nomeArq);
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                double lat=Double.parseDouble(dados[1]);
                double lon=Double.parseDouble(dados[2]);
                insert(new Geo(dados[0],lat ,lon));
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        return true;
    }

    public void list(){
        for (Geo g: lista) {
            System.out.println(g.toString());
        }
    }
}