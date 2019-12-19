package br.com.fundatec.Pedido.mapper;

import br.com.fundatec.Pedido.api.dto.EntregaInputDto;
import br.com.fundatec.Pedido.api.dto.EntregaOutputDto;
import br.com.fundatec.Pedido.api.dto.PedidoInputDto;
import br.com.fundatec.Pedido.model.Entrega;
import br.com.fundatec.Pedido.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class EntregaMapper {

    private final PedidoMapper pedidoMapper;

    public EntregaMapper(PedidoMapper pedidoMapper) {
        this.pedidoMapper = pedidoMapper;
    }

    public Entrega mapear(EntregaInputDto entregaInputDto) {
        Entrega entrega = new Entrega();
        entrega.setEntregador(entrega.getEntregador());
        return entrega;
    }

    public EntregaOutputDto mapear(Entrega entrega) {
        EntregaOutputDto entregaOutputDto = new EntregaOutputDto();
        entregaOutputDto.setId(entrega.getId());
        entregaOutputDto.setEntregador(entrega.getEntregador());
       // entregaOutputDto.setPedidoOutputDto(pedidoMapper.mapear((Pedido) entrega.getPedidos()));
        return entregaOutputDto;
    }
}

