public class Aeronave {
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(String codigo, String descricao, int capacidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Aeronave{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}
