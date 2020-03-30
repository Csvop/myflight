public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo localizacao;

    public Aeroporto(String codigo, String nome, Geo localizacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Aeroporto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", localizacao=" + localizacao +
                '}';
    }
}
