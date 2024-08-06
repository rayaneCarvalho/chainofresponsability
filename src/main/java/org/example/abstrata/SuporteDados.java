package org.example.abstrata;

import org.example.implementacao.TipoDemandaDados;

public class SuporteDados extends Equipe {

    public SuporteDados(Equipe superior) {
        listaDemandas.add(TipoDemandaDados.getTipoDemandaDados());
        setEquipeSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte de Dados";
    }
}