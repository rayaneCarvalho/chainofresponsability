package org.example.implementacao;

import org.example.abstrata.Equipe;
import org.example.abstrata.SuporteDados;
import org.example.abstrata.SuporteDesenvolvimento;
import org.example.abstrata.SuporteInfraestrutura;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemandaTest {

    Equipe suporteInfraestrutura;
    Equipe suporteDesenvolvimento;
    Equipe suporteDados;

    @BeforeEach
    void setUp() {
        suporteInfraestrutura = new SuporteInfraestrutura(null);
        suporteDesenvolvimento = new SuporteDesenvolvimento(suporteInfraestrutura);
        suporteDados = new SuporteDados(suporteDesenvolvimento);
    }

    @Test
    void deveRetornarSuporteDadosParaDemandaDados() {
        assertEquals("Suporte de Dados", suporteDados.tratarDemanda(new Demanda(TipoDemandaDados.getTipoDemandaDados())));
    }

    @Test
    void deveRetornarSuporteDesenvolvimentoParaDemandaDesenvolvimento() {
        assertEquals("Suporte de Desenvolvimento", suporteDados.tratarDemanda(new Demanda(TipoDemandaDesenvolvimento.getTipoDemandaDesenvolvimento())));
    }

    @Test
    void deveRetornarSuporteInfraestruturaParaDemandaInfraestrutura() {
        assertEquals("Suporte de Infraestrutura", suporteDados.tratarDemanda(new Demanda(TipoDemandaInfraestrutura.getTipoDemandaInfraestrutura())));
    }

    @Test
    void deveRetornarSemTratamentoParaDemandaNaoReconhecida() {
        assertEquals("Sem tratamento", suporteDados.tratarDemanda(new Demanda(TipoDemandaNaoReconhecida.getTipoDemandaNaoReconhecida())));
    }
}

class TipoDemandaNaoReconhecida implements TipoDemanda {
    private static TipoDemandaNaoReconhecida tipoDemandaNaoReconhecida = new TipoDemandaNaoReconhecida();

    private TipoDemandaNaoReconhecida() {}

    public static TipoDemandaNaoReconhecida getTipoDemandaNaoReconhecida() {
        return tipoDemandaNaoReconhecida;
    }
}

