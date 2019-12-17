package br.com.fundatec.Pedido.api;

import br.com.fundatec.Pedido.service.PedidoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PedidoApi {

    private final PedidoService pedidoService;

    public PedidoApi(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/pedidos")
    public List<String> getPedidos() {
        return pedidoService.listarPedidos();
    }
}
