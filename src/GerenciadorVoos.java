import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorVoos {
    private ArrayList<Voo> lista;

    private GerenciadorVoos() {lista = new ArrayList<>();}

    private static GerenciadorVoos instance;

    public static GerenciadorVoos getInstance(){
        if(instance==null){
            instance= new GerenciadorVoos();
        }
        return instance;
    }

    public boolean readFile(String nomeArq) {
        Path path= Paths.get(nomeArq);
        GerenciadorRotas gRota = GerenciadorRotas.getInstance();
        Voo voo = new Voo();
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                int ano =Integer.parseInt(dados[0]);
                int mes=Integer.parseInt(dados[1]);
                int dia=Integer.parseInt(dados[2]);
                int hora=Integer.parseInt(dados[3]);
                int minuto=Integer.parseInt(dados[4]);
                int duracao=Integer.parseInt(dados[5]);
                int cod_rota = Integer.parseInt(dados[6]);
                int cod_status=Integer.parseInt(dados[7]);
                insert(new Voo(LocalDateTime.of(ano, mes, dia, hora,minuto), Duration.ofMinutes(duracao) , gRota.getRota(cod_rota), voo.getStatus(cod_status)));
            }
        }

        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        return true;
    }

    public void insert(Voo voo){
        lista.add(voo);
    }

    public Voo searchDate(LocalDateTime date){
        for(Voo v:lista){
            if(v.getDate()==date)
                return v;
        }
        return null;
    }

    public void search(String origem,String destino){
        Aeroporto desembarque;
        for(Voo v1:lista){
            if(v1.getRota().getOrigem().getCodigo().equals(origem)){
                desembarque=v1.getRota().getDestino();
                if(desembarque.equals(destino)){
                    System.out.println("Voo Direto:");
                    System.out.println(v1.toString());
                }else{
                    for(Voo v2:lista){
                        if(v2.getRota().getOrigem().getCodigo().equals(desembarque.getCodigo())){
                            if(v2.getRota().getDestino().getCodigo().equals(destino)) {
                                System.out.println("Voo com escala em: "+"["+desembarque.getCodigo()+"] "+desembarque.getNome());
                                System.out.println(v1.toString());
                                System.out.println(v2.toString());
                            }
                        }
                    }
                }
            }
        }
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
        String ax = "Gerenciador de Voos\n _______________________ \n";
        ax+=String.format("%7s %11s %10s %6s %15s","Data","Horário","Duração","Rota","Estado")+"\n";
        for (Voo r: lista) {
            ax += r.toString()+"\n";
        }
        return ax;
    }
}
