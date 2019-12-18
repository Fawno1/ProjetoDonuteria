package br.com.fundatec.Pedido.api;

import br.com.fundatec.Pedido.model.Pedido;
import br.com.fundatec.Pedido.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PedidoApi{
    private final PedidoService pedidoService;
    public PedidoApi(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }
    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> getPedidos(@RequestParam(required = false, defaultValue = "") String descricao) {
        List<Pedido> pedidos = pedidoService.listarPedidos(descricao);
        if (pedidos.size() == 0) {
            return ResponseEntity.status((HttpStatus.NO_CONTENT))
                    .body(pedidos);
        }
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/pedidos/{id}")
    public ResponseEntity<Pedido> getPedido(@PathVariable Long id) {
        Pedido pedido = pedidoService.consultar(id);
        if(pedido != null) {
            return ResponseEntity.ok(pedido);
        }
        return ResponseEntity.noContent().build();
    }

}
