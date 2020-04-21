public class CiaAerea implements Contavel{
    private String codigo;
    private String nome;
    private static int contCias=0;

    public CiaAerea(String codigo, String nome) {
        contCias++;
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public int getCont(){return contCias;}

    @Override
    public String toString() {
        return String.format("%4s %25s",
                codigo,
                nome);
    }
}
