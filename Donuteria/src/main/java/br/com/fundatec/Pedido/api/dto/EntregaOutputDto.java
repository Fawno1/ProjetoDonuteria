package br.com.fundatec.Pedido.api.dto;

import br.com.fundatec.Pedido.model.Entrega;

public class EntregaOutputDto extends Entrega {

    private Long id;
    private String entregador;
    private PedidoOutputDto pedidoOutputDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntregador() {
        return entregador;
    }

    public void setEntregador(String entregador) {
        this.entregador = entregador;
    }

    public PedidoOutputDto getPedidoOutputDto() {
        return pedidoOutputDto;
    }

    public void setPedidoOutputDto(PedidoOutputDto pedidoOutputDto) {
        this.pedidoOutputDto = pedidoOutputDto;
    }
}
