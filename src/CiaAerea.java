public class CiaAerea {
    private String codigo;
    private String nome;

    public CiaAerea(String umCodigo, String umNome) {
        codigo = umCodigo;
        nome = umNome;
    }

    //teste git
    //teste2

    @Override
    public String toString() {
        return "CiaAerea{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
