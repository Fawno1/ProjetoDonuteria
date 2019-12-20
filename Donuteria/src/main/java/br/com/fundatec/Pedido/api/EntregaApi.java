package br.com.fundatec.Pedido.api;

import br.com.fundatec.Pedido.api.dto.EntregaInputDto;
import br.com.fundatec.Pedido.api.dto.EntregaOutputDto;
import br.com.fundatec.Pedido.mapper.EntregaMapper;
import br.com.fundatec.Pedido.model.Entrega;
import br.com.fundatec.Pedido.service.EntregaService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EntregaApi {

    private final EntregaService entregaService;
    private final EntregaMapper entregaMapper;

    public EntregaApi(EntregaService entregaService, EntregaMapper entregaMapper) {
        this.entregaService = entregaService;
        this.entregaMapper = entregaMapper;
    }

    @PostMapping("/pedidos/{id}/entregas")
    public ResponseEntity<?> incluirEntrega(@RequestBody @Valid EntregaInputDto entregaInputDto,
                                            @PathVariable(value = "id") Long idPedido) {
        Entrega entrega = entregaMapper.mapear(entregaInputDto);
        entrega = entregaService.incluir(entrega, idPedido);
        EntregaOutputDto entregaOutputDto = entregaMapper.mapear(entrega);
        return ResponseEntity.ok(entregaOutputDto);

    }
}
