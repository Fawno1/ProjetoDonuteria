package br.com.fundatec.Donuteria.service;

import java.util.Arrays;
import java.util.List;

public class DonuteriaService {
    public static List<String> listarDonuteria() {
        List<String> donuteria = Arrays.asList("Café com leite e donut de chocolate",
                "Coca-cola e 2 donuts de morango",
                "4 donuts com cobertura de Nutella");

        return donuteria;

    }
}
