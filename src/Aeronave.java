public class Aeronave implements Imprimivel, Contavel, Comparable<Aeronave> {
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
    public int getContAeronaves(){return contAeronaves;}

    @Override
    public String toString() {
        return String.format("[%3s] %30s %10d",
                codigo,
                descricao,
                capacidade);
    }

    public String imprimir() {
        return String.format("[%3s] %30s %10d",
                codigo,
                descricao,
                capacidade);
    }

    public int getTotal() {
        return contAeronaves;
    }

    public int compareTo(Aeronave outra) {
        return descricao.compareTo(outra.descricao);
    }
}
