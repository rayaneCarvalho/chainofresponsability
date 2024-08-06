package org.example.implementacao;

public class TipoDemandaDados implements TipoDemanda {

    private static TipoDemandaDados tipoDemandaDados = new TipoDemandaDados();

    private TipoDemandaDados() {};

    public static TipoDemandaDados getTipoDemandaDados() {
        return tipoDemandaDados;
    }
}
