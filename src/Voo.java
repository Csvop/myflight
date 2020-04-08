import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

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

    public Rota getRota(){
        return rota;
    }
    public LocalDateTime getDate(){
        return datahora;
    }

    @Override
    public String toString() {
        return String.format("%10s %7s %10s [%1s:%1s-%1s] %10s",
                datahora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                datahora.format(DateTimeFormatter.ofPattern("HH:mm")),
                duracao,
                rota.getCiaAerea().getCodigo(),
                rota.getOrigem().getCodigo(),
                rota.getDestino().getCodigo(),
                status);
    }
}
