import java.util.Comparator;

public class Rota implements Contavel{
    private CiaAerea ciaAerea;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;
    private static int contRotas;
    private int cod_rota;

    public Rota(int cod_rota,CiaAerea ciaAerea, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
        contRotas++;
        this.cod_rota=cod_rota;
        this.aeronave = aeronave;
        this.origem = origem;
        this.destino = destino;
        this.ciaAerea = ciaAerea;
    }

    public int getCod_rota() {
        return cod_rota;
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
    public int getCont(){return contRotas;}

    public static Comparator<Rota> compare(){
        return new Comparator<Rota>(){
            public int compare(Rota r1, Rota r2){
                return r1.getCiaAerea().getNome().compareTo(r2.getCiaAerea().getNome());
            }
        };
    }

    @Override
    public String toString() {
        return String.format("%8s %8s %10s %10s %10s",
                cod_rota,
                ciaAerea.getCodigo(),
                origem.getCodigo(),
                destino.getCodigo(),
                aeronave.getCodigo());
    }
}