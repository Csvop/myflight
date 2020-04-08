import java.time.LocalDateTime;
import java.time.Duration;
public class VooEscalas extends Voo {
    public enum Status {CONFIRMADO, ATRASADO, CANCELADO}
    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Rota rotaFinal;
    private Status status;

    public VooEscalas (LocalDateTime datahora, Duration duracao, Rota rota, Status status, Rota rotaFinal ){
        super(datahora, duracao, rota, status);
        this.rotaFinal = rotaFinal;
    }

    public Rota getRota() {return rota;}
    public Rota getRotaFinal() {return rotaFinal;}
    //public LocalDateTime getDatahora() {}
    //public Duration getDuracao() {}

    @Override
    public String toString(){
        return super.toString() + "\nrota final -> " + rotaFinal;
    }


}
