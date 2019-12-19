package br.com.fundatec.Pedido.api;

import br.com.fundatec.Pedido.api.dto.PedidoInputDto;
import br.com.fundatec.Pedido.api.dto.PedidoOutputDto;
import br.com.fundatec.Pedido.mapper.PedidoMapper;
import br.com.fundatec.Pedido.model.Pedido;
import br.com.fundatec.Pedido.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PedidoApi{

    private final PedidoService pedidoService;
    private final PedidoMapper pedidoMapper;

    public PedidoApi(PedidoService pedidoService, PedidoMapper pedidoMapper) {
        this.pedidoService = pedidoService;
        this.pedidoMapper = pedidoMapper;
    }
    @GetMapping("/pedidos")
    public ResponseEntity<List<PedidoOutputDto>> getPedidos(@RequestParam(required = false, defaultValue = "") String descricao) {
        List<Pedido> pedidos = pedidoService.listarPedidos(descricao);
        if (pedidos.size() == 0) {
            return ResponseEntity.noContent()
                    .build();
        }
        List<PedidoOutputDto> pedidosOutputDto = pedidoMapper.mapear(pedidos);
        return ResponseEntity.ok(pedidosOutputDto);
    }

    @GetMapping("/pedidos/{id}")
    public ResponseEntity<PedidoOutputDto> getPedido(@PathVariable Long id) {
        Pedido pedido = pedidoService.consultar(id);
        if(pedido != null) {
           PedidoOutputDto pedidoOutputDto = pedidoMapper.mapear(pedido);
           return ResponseEntity.ok(pedidoOutputDto);
        }
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/pedidos")
    public ResponseEntity<PedidoOutputDto> incluir(@RequestBody PedidoInputDto pedidoInputDto) {
        Pedido pedido = pedidoMapper.mapear(pedidoInputDto);
        pedido = pedidoService.incluir(pedido);
        PedidoOutputDto pedidoOutputDto = pedidoMapper.mapear(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoOutputDto);
    }

}
