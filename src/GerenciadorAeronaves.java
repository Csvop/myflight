import java.util.ArrayList;
public class GerenciadorAeronaves {
    private ArrayList<Aeronave> lista;
    private GerenciadorAeronaves() {lista = new ArrayList<>();}
    private static GerenciadorAeronaves instance;

    public void adicionar(String codigo, String descricao, int capacidade){
        lista.add(new Aeronave(codigo, descricao, capacidade));
    }

    public Aeronave buscarPorCodigo(String codigo){
        for(Aeronave cod:lista){
            if(cod.getCodigo() == codigo)
                return cod;
        }
        return null;
    }

    public String toString(){
        String a = "Gerenciador de Aeronaves\n _______________________ \n";
        for (Aeronave b: lista) {
            a = a + b.toString();
        }
        return a;
    }
}
