package br.com.fundatec.Donuteria.repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class DonuteriaRepository {

    public List<String> listarDonuteria() {
        List<String> donuteria = Arrays.asList("Café com leite e donut de chocolate",
                "Coca-cola e 2 donuts de morango",
                "4 donuts com cobertura de Nutella");

        return donuteria;
    }
}
