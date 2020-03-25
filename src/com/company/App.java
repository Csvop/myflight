package com.company;

import static com.company.Voo.Estado.*;

public class App {

    public static void main(String[] args) {
        CiaAerea cia1 = new CiaAerea("G3", "Gol Linhas Aéreas SA");
        CiaAerea cia2 = new CiaAerea("JJ", "LATAM Linhas Aéreas");
        CiaAerea cia3 = new CiaAerea("TP", "TAP Portugal");
        CiaAerea cia4 = new CiaAerea("AD", "Azul Linhas Aéreas");

        Aeronave nave1 = new Aeronave("733", "Boeing 737-300", 140);
        Aeronave nave2 = new Aeronave("73G", "Boeing 737-700", 126);
        Aeronave nave3 = new Aeronave("380", "Airbus Industries A380", 644);
        Aeronave nave4 = new Aeronave("764", "Boeing 767-400", 304);

        Geo coord1 = new Geo(-29.9939, -51.1711);
        Geo coord2 = new Geo(-23.4356, -46.4731);
        Geo coord3 = new Geo(38.7742, -9.1342);
        Geo coord4 = new Geo(25.7933, -80.2906);

        Aeroporto porto1 = new Aeroporto("POA", "Salgado Filho Intl Apt", coord1);
        Aeroporto porto2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", coord2);
        Aeroporto porto3 = new Aeroporto("LIS", "Lisbon", coord3);
        Aeroporto porto4 = new Aeroporto("MIA", "Miami International Apt", coord4);

        Rota r1 = new Rota(cia1, porto2, porto1, nave1);
        Rota r2 = new Rota(cia1, porto1, porto2, nave1);
        Rota r3 = new Rota(cia3, porto4, porto3, nave3);
        Rota r4 = new Rota(cia2, porto2, porto4, nave4);

        Voo v1 = new Voo("10/08/2016", "8h", 5400, r2, ATRASADO);
        Voo v2 = new Voo("10/08/2016", "15h", 7200, r3, CONFIRMADO);
        Voo v3 = new Voo("15/08/2016", "12h", 7200, r1, CANCELADO);

        
    }
}
