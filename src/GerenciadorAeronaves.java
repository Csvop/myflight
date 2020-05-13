import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    public boolean readFile(String nomeArq) {
        Path path= Paths.get(nomeArq);
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                int cap=Integer.parseInt(dados[2]);
                insert(new Aeronave(dados[0],dados[1],cap));
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        return true;
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
