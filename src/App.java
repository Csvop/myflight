import java.util.Collections;

public class App {

    public static void main(String[] args) {

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

        System.out.println("Rotas de CGR a POA");
        System.out.println("------------------");
        voos.search("CGR","POA");

        System.out.println("\nOrdenação das aeronaves por capacidade");
        System.out.println("---------------------------------------");
        Collections.sort(aeronaves.getList(), Aeronave.compare());
        aeronaves.print();

        System.out.println("\nOrdenação das rotas por orderm alfabetica das copanhias aereas");
        System.out.println("--------------------------------------------------------------");
        Collections.sort(rotas.getList(), Rota.compare());
        rotas.print();

        System.out.println("\nOrdenação alfabetica dos aeroportos");
        System.out.println("-----------------------------------");
        Collections.sort(aeroportos.getList(), Aeroporto.compare());
        aeroportos.print();
    }
}