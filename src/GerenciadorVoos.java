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
