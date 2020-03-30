public class Voo {
    public enum Estado { CONFIRMADO, ATRASADO, CANCELADO };

    private String data;
    private String horario;
    private int duracao;
    private Rota rota;
    private Estado estado;

    public Voo(String data, String horario, int duracao, Rota rota, Estado estado) {
        this.data = data;
        this.horario = horario;
        this.duracao = duracao;
        this.rota = rota;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                ", duracao=" + duracao +
                ", rota=" + rota +
                ", estado=" + estado +
                '}';
    }
}
