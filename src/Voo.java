import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class Voo {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Status status;
    private static int contVoos=0;

    public Voo(LocalDateTime datahora, Duration duracao, Rota rota, Status status) {
        contVoos++;
        this.datahora=datahora;
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }

    public LocalDateTime getDate(){
        return datahora;
    }
    public Duration getDuracao(){return duracao;}
    public Rota getRota(){
        return rota;
    }
    public Status getStatus(){return status;}
    public int getContVoos(){return contVoos;}

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
