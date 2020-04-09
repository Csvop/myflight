public class Rota {
    private CiaAerea ciaAerea;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;
    private static int contRotas;

    public Rota(CiaAerea ciaAerea, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
        contRotas++;
        this.aeronave = aeronave;
        this.origem = origem;
        this.destino = destino;
        this.ciaAerea = ciaAerea;
    }

    public Aeroporto getOrigem(){
        return origem;
    }
    public Aeroporto getDestino(){
        return destino;
    }
    public CiaAerea getCiaAerea(){
        return ciaAerea;
    }
    public int getContRotas(){return contRotas;}

    @Override
    public String toString() {
        return String.format("%8s %10s %10s %10s",
                ciaAerea.getCodigo(),
                origem.getCodigo(),
                destino.getCodigo(),
                aeronave.getCodigo());
    }
}
