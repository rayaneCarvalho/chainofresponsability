package org.example.abstrata;

import org.example.implementacao.TipoDemandaInfraestrutura;

public class SuporteInfraestrutura extends Equipe {

    public SuporteInfraestrutura(Equipe superior) {
        listaDemandas.add(TipoDemandaInfraestrutura.getTipoDemandaInfraestrutura());
        setEquipeSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte de Infraestrutura";
    }
}
