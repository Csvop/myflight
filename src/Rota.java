public class Rota {
    private CiaAerea ciaAerea;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;


    public Rota(CiaAerea ciaAerea, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
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
    @Override
    public String toString() {
        return "Rota{" +
                "aeronave=" + aeronave +
                ", origem=" + origem +
                ", destino=" + destino +
                ", ciaAerea=" + ciaAerea +'}';
    }
}
