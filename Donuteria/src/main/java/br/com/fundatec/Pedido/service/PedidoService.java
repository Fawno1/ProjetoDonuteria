package br.com.fundatec.Pedido.service;

import br.com.fundatec.Pedido.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<String> listarPedidos() {
        return pedidoRepository.listarPedido();

    }
}
