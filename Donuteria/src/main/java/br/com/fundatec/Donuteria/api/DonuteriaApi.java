package br.com.fundatec.Donuteria.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DonuteriaApi {

    @GetMapping("donuteria")
    public List<String> getDonuteria() {
        List donuteria = Arrays.asList("Café com leite e donut de chocolate",
                        "Coca-cola e 2 donuts de morango",
                                "4 donuts com cobertura de Nutella");

                return donuteria;
    }
}
