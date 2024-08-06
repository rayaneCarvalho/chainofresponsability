package org.example.implementacao;

public class Demanda {

    private TipoDemanda tipoDemanda;

    public Demanda(TipoDemanda tipoDemanda) {
        this.tipoDemanda = tipoDemanda;
    }

    public TipoDemanda getTipoDemanda() {
        return tipoDemanda;
    }

    public void setTipoDemanda(TipoDemanda tipoDemanda) {
        this.tipoDemanda = tipoDemanda;
    }
}

