public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo localizacao;
    private static int contAeroportos=0;

    public Aeroporto(String codigo, String nome, Geo localizacao) {
        contAeroportos++;
        this.codigo = codigo;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String getCodigo() {return codigo;}
    public String getNome(){return nome;}
    public Geo getLocalizacao(){return localizacao;}
    public int getContAeroportos(){return contAeroportos;}

    @Override
    public String toString() {
        return String.format("[%3s] %30s %25s",
                codigo,
                nome,
                localizacao);
    }
}
