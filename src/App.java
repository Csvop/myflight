import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        Geo coord1 = new Geo(-29.9939, -51.1711);
        Geo coord2 = new Geo(-23.4356, -46.4731);
        Geo coord3 = new Geo(38.7742 , -9.1342 );
        Geo coord4 = new Geo(25.7933 , -80.2906);

        GerenciadorCias ciasAereas = GerenciadorCias.getInstance();
        ciasAereas.insert(new CiaAerea("G3", "Gol Linhas Aéreas SA"));
        ciasAereas.insert(new CiaAerea("JJ", "LATAM Linhas Aéreas"));
        ciasAereas.insert(new CiaAerea("TP", "TAP Portugal"));
        ciasAereas.insert(new CiaAerea("AD", "Azul Linhas Aéreas"));

        GerenciadorAeronaves aeronaves = GerenciadorAeronaves.getInstance();
        aeronaves.insert(new Aeronave("733", "Boeing 737-300", 140));
        aeronaves.insert(new Aeronave("738", "Boeing 737-700", 126));
        aeronaves.insert(new Aeronave("332", "Airbus Industries A380", 644));
        aeronaves.insert(new Aeronave("320", "Boeing 767-400", 304));

        GerenciadorAeroportos aeroportos = GerenciadorAeroportos.getInstance();
        aeroportos.insert(new Aeroporto("POA", "Salgado Filho Intl Apt", coord1));
        aeroportos.insert(new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", coord2));
        aeroportos.insert(new Aeroporto("LIS", "Lisbon", coord3));
        aeroportos.insert(new Aeroporto("MIA", "Miami International Apt", coord4));
        aeroportos.insert(new Aeroporto("CGR", "Aeroporto de Campo Grande", coord4));

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
        aeroportos.print();
    }
}
