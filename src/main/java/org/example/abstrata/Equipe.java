package org.example.abstrata;

import org.example.implementacao.Demanda;
import org.example.implementacao.TipoDemanda;

import java.util.ArrayList;

public abstract class Equipe {

    protected ArrayList<TipoDemanda> listaDemandas = new ArrayList<>();
    private Equipe equipeSuperior;

    public Equipe getEquipeSuperior() {
        return equipeSuperior;
    }

    public void setEquipeSuperior(Equipe equipeSuperior) {
        this.equipeSuperior = equipeSuperior;
    }

    public abstract String getDescricaoCargo();

    public String tratarDemanda(Demanda demanda) {
        if (listaDemandas.contains(demanda.getTipoDemanda())) {
            return getDescricaoCargo();
        } else {
            if (equipeSuperior != null) {
                return equipeSuperior.tratarDemanda(demanda);
            } else {
                return "Sem tratamento";
            }
        }
    }
}

