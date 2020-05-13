import java.util.Comparator;

public class Aeroporto implements Contavel{
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
    public int getCont(){return contAeroportos;}

    public static Comparator<Aeroporto> compare(){
        return new Comparator<Aeroporto>(){
            public int compare(Aeroporto a1, Aeroporto a2){
                return a1.getNome().compareTo(a2.getNome());
            }
        };
    }

    @Override
    public String toString() {
        return String.format("[%3s] %30s %25s",
                codigo,
                nome,
                localizacao);
    }
}
