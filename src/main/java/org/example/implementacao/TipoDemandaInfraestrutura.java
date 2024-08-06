package org.example.implementacao;

public class TipoDemandaInfraestrutura implements TipoDemanda {

    private static TipoDemandaInfraestrutura tipoDemandaInfraestrutura = new TipoDemandaInfraestrutura();

    private TipoDemandaInfraestrutura() {};

    public static TipoDemandaInfraestrutura getTipoDemandaInfraestrutura() {
        return tipoDemandaInfraestrutura;
    }
}
