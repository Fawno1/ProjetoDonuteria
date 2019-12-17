package br.com.fundatec.Pedido.repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PedidoRepository {

    public List<String> listarPedido() {
        List<String> pedido = Arrays.asList("Café com leite e donut de chocolate",
                "Coca-cola e 2 donuts de morango",
                "4 donuts com cobertura de Nutella");

        return pedido;
    }
}
