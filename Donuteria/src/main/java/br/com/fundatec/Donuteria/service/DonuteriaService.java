package br.com.fundatec.Donuteria.service;

import br.com.fundatec.Donuteria.repository.DonuteriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonuteriaService {

    private final DonuteriaRepository donuteriaRepository;

    public DonuteriaService(DonuteriaRepository donuteriaRepository) {
        this.donuteriaRepository = donuteriaRepository;
    }

    public List<String> listarDonuteria() {
        return donuteriaRepository.listarDonuteria();

    }
}
