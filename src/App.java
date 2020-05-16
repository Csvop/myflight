import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Collections;
//ab
public class App {

    public static void main(String[] args) {

        GerenciadorGeo geGeo= GerenciadorGeo.getInstance();
        geGeo.readFile("localizacaoAeroportos.txt");

        GerenciadorCias ciasAereas = GerenciadorCias.getInstance();
        ciasAereas.readFile("ciasAereas.txt");

        GerenciadorAeronaves aeronaves = GerenciadorAeronaves.getInstance();
        aeronaves.readFile("aeronaves.txt");

        GerenciadorAeroportos aeroportos = GerenciadorAeroportos.getInstance();
        aeroportos.readFile("aeroportos.txt");

        GerenciadorRotas rotas = GerenciadorRotas.getInstance();
        rotas.readFile("rotas.txt");

        GerenciadorVoos voos = GerenciadorVoos.getInstance();
        voos.readFile("voos.txt");

        System.out.println(ciasAereas);
        System.out.println( aeronaves);
        System.out.println(aeroportos);
        System.out.println(     rotas);
        System.out.println(      voos);

        voos.search("CGR","POA");

        Collections.sort(aeronaves.getList(), Aeronave.compare());
        Collections.sort(rotas.getList(), Rota.compare());
        Collections.sort(aeroportos.getList(), Aeroporto.compare());

        aeronaves.print();
        rotas.print();
        aeroportos.print();

    }
}