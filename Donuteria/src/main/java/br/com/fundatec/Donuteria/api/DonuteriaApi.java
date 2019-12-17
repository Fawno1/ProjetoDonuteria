package br.com.fundatec.Donuteria.api;

import br.com.fundatec.Donuteria.service.DonuteriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DonuteriaApi {

    private final DonuteriaService donuteriaService;

    public DonuteriaApi(DonuteriaService donuteriaService) {
        this.donuteriaService = donuteriaService;
    }

    @GetMapping("donuteria")
    public List<String> getDonuteria() {
        return donuteriaService.listarDonuteria();
    }
}
