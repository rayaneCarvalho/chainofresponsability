package org.example.implementacao;

public class TipoDemandaDesenvolvimento implements TipoDemanda {

    private static TipoDemandaDesenvolvimento tipoDemandaDesenvolvimento = new TipoDemandaDesenvolvimento();

    private TipoDemandaDesenvolvimento() {};

    public static TipoDemandaDesenvolvimento getTipoDemandaDesenvolvimento() {
        return tipoDemandaDesenvolvimento;
    }
}
