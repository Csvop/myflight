package com.company;

public class Voo {
    public enum Estado { CONFIRMADO, ATRASADO, CANCELADO };

    private String data;
    private String horario;
    private int duracao;
    private Rota rota;
    private Estado estado;
}
