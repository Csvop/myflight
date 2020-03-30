import java.util.ArrayList;


public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public ArrayList<Aeroporto> list() {
        return  aeroportos;
    }

    public String toString() {
        return "GerenciadorAeroportos{" +
                "aeroportos=" + aeroportos +
                '}';
    }
}
