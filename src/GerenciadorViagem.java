import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorViagem  implements Contrato{
    private ArrayList<Viagem> lista;

    private GerenciadorViagem() {lista = new ArrayList<>();}

    private static GerenciadorViagem instance;

    public static GerenciadorViagem getInstance(){
        if(instance==null){
            instance= new GerenciadorViagem();
        }
        return instance;
    }

    public Viagem search(String codOrigem, String codDestino)
    {
        for(Viagem v:lista){
            if(v.getOrigem().getRota().getOrigem().getCodigo().equals(codOrigem)
                    && v.getOrigem().getRota().getOrigem().getCodigo().equals(codDestino)){
                return v;
            }
        }
        return null;
    }

    public void insert(Voo origem,Voo destino){
        lista.add(new Viagem(origem,destino));
    }


    @Override
    public String toString() {
        String ax = "Gerenciador de Viagens\n _______________________ \n";
        for (Viagem v : lista) {
            ax +="Origem:" +v.getOrigem().getRota().getOrigem().getCodigo() + "\n";
            ax +="Escala:" +v.getOrigem().getRota().getDestino().getCodigo() + "\n";
            ax +="Destino:"+v.getDestino().getRota().getDestino().getCodigo() + "\n";
            ax +="-----------------------------------------------------------\n";
        }
        return ax;
    }

}
