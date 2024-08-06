package org.example.abstrata;

import org.example.implementacao.TipoDemandaDesenvolvimento;

public class SuporteDesenvolvimento extends Equipe {

    public SuporteDesenvolvimento(Equipe superior) {
        listaDemandas.add(TipoDemandaDesenvolvimento.getTipoDemandaDesenvolvimento());
        setEquipeSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte de Desenvolvimento";
    }
}
