public class Rota {
    private Aeronave aeronave;
    private Aeroporto origem;
    private Aeroporto destino;
    private CiaAerea ciaAerea;

    public Rota(CiaAerea ciaAerea, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
        this.aeronave = aeronave;
        this.origem = origem;
        this.destino = destino;
        this.ciaAerea = ciaAerea;
    }

    @Override
    public String toString() {
        return "Rota{" +
                "aeronave=" + aeronave +
                ", origem=" + origem +
                ", destino=" + destino +
                ", ciaAerea=" + ciaAerea +
                '}';
    }
}
