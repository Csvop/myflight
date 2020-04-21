import java.util.Comparator;
public class Aeronave implements Contavel {
    private String codigo;
    private String descricao;
    private int capacidade;
    private static int contAeronaves=0;

    public Aeronave(String codigo, String descricao, int capacidade) {
        contAeronaves++;
        this.codigo = codigo;
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    public String getCodigo() {return codigo;}
    public String getDescricao(){return descricao;}
    public int getCapacidade(){return capacidade;}
    public int getCont() {return contAeronaves;}

    public static Comparator<Aeronave> compare(){
        return new Comparator<Aeronave>(){
            public int compare(Aeronave a1, Aeronave a2){
                return a2.capacidade - a1.capacidade;
            }
        };
    }

    @Override
    public String toString() {
        return String.format("[%3s] %30s %10d",
                codigo,
                descricao,
                capacidade);
    }
}
