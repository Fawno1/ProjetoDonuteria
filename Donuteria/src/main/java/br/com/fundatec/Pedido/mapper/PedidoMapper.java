package br.com.fundatec.Pedido.mapper;

import br.com.fundatec.Pedido.api.dto.PedidoOutputDto;
import br.com.fundatec.Pedido.model.Pedido;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PedidoMapper {

    public PedidoOutputDto mapear(Pedido pedido) {
        PedidoOutputDto pedidoOutputDto = new PedidoOutputDto();
        pedidoOutputDto.setId(pedido.getId());
        pedidoOutputDto.setDescricao(pedido.getDescricao());
        pedidoOutputDto.setEndereco(pedido.getEndereco());
        return pedidoOutputDto;
    }
    public List<PedidoOutputDto> mapear(List<Pedido> pedidos) {
        List<PedidoOutputDto> pedidoOutputDtos = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            pedidoOutputDtos.add(mapear(pedido));
        }
        return pedidoOutputDtos;
    }
}
