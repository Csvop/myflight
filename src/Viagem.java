public class Viagem {
    private Voo origem;
    private Voo destino;

    public Viagem(Voo origem, Voo destino){
        this.origem=origem;
        this.destino=destino;
    }

    public Voo getOrigem(){
        return origem;
    }
    public Voo getDestino(){
        return destino;
    }
}
