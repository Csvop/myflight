import java.time.LocalDateTime;
import java.time.Duration;

public class Voo {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Status status;

    public Voo(LocalDateTime datahora, Duration duracao, Rota rota, Status status) {
        this.datahora=datahora;
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }

    public LocalDateTime getDate(){
        return datahora;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "data/hora='" + datahora + '\'' +
                ", duracao=" + duracao +
                ", rota=" + rota +
                ", estado=" + status +'}';
    }
}
