import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Collections;
//ab
public class App {

    public static void main(String[] args) {

        GerenciadorGeo geGeo= GerenciadorGeo.getInstance();
        geGeo.readFile("localizacaoAeroportos.txt");
        geGeo.list();

        GerenciadorCias ciasAereas = GerenciadorCias.getInstance();
        ciasAereas.readFile("ciasAereas.txt");
        ciasAereas.print();

        GerenciadorAeronaves aeronaves = GerenciadorAeronaves.getInstance();
        aeronaves.readFile("aeronaves.txt");
        aeronaves.print();

        GerenciadorAeroportos aeroportos = GerenciadorAeroportos.getInstance();
        aeroportos.readFile("aeroportos.txt");
        aeroportos.print();

        /*
        GerenciadorRotas rotas = GerenciadorRotas.getInstance();
        Rota r0=new Rota(ciasAereas.search("AD"),aeroportos.search("CGR"),aeroportos.search("GRU"),aeronaves.search("320"));
        Rota r1=new Rota(ciasAereas.search("G3"),aeroportos.search("GRU"),aeroportos.search("POA"),aeronaves.search("738"));
        Rota r2=new Rota(ciasAereas.search("G3"),aeroportos.search("POA"),aeroportos.search("GRU"),aeronaves.search("738"));
        Rota r3=new Rota(ciasAereas.search("TP"),aeroportos.search("MIA"),aeroportos.search("LIS"),aeronaves.search("332"));
        Rota r4=new Rota(ciasAereas.search("JJ"),aeroportos.search("GRU"),aeroportos.search("LIS"),aeronaves.search("320"));
        rotas.insert(r0);rotas.insert(r1);rotas.insert(r2);rotas.insert(r3);rotas.insert(r4);

        GerenciadorVoos voos = GerenciadorVoos.getInstance();
        Voo v0=new Voo(LocalDateTime.of(2016, 8, 10, 8,  0), Duration.ofMinutes(90) ,r0, Voo.Status.ATRASADO  );
        Voo v1=new Voo(LocalDateTime.of(2016, 8, 10, 8,  0), Duration.ofMinutes(90) ,r2, Voo.Status.CANCELADO  );
        Voo v2=new Voo(LocalDateTime.of(2016, 8, 10, 15, 0), Duration.ofMinutes(120),r3, Voo.Status.CONFIRMADO);
        Voo v3=new Voo(LocalDateTime.of(2016, 8, 15, 12, 0), Duration.ofMinutes(120),r1, Voo.Status.CONFIRMADO );
        voos.insert(v0);voos.insert(v1);voos.insert(v2);voos.insert(v3);

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
        aeroportos.print();*/

    }
}