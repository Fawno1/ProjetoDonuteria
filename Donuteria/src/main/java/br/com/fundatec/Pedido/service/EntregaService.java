package br.com.fundatec.Pedido.service;

import br.com.fundatec.Pedido.model.Entrega;
import br.com.fundatec.Pedido.model.Pedido;
import br.com.fundatec.Pedido.repository.EntregaRepository;
import org.springframework.stereotype.Service;

@Service
public class EntregaService {

        private final PedidoService pedidoService;
        private final EntregaRepository entregaRepository;

    public EntregaService(PedidoService pedidoService, EntregaRepository entregaRepository) {
        this.pedidoService = pedidoService;
        this.entregaRepository = entregaRepository;
    }

    public Entrega incluir(Entrega entrega, Long idPedido) {
        Pedido pedido = pedidoService.consultar(idPedido);
        entrega.setPedido(pedido);
        return entregaRepository.save(entrega);
    }
}
