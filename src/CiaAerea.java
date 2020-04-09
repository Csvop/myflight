public class CiaAerea {
    private String codigo;
    private String nome;
    private static int contCias=0;

    public CiaAerea(String umCodigo, String umNome) {
        contCias++;
        codigo = umCodigo;
        nome = umNome;
    }

    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public int getContCias(){return contCias;}

    @Override
    public String toString() {
        return String.format("%4s %25s",
                codigo,
                nome);
    }
}
