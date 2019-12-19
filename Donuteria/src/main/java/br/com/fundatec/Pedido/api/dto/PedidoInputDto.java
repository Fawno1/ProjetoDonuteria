package br.com.fundatec.Pedido.api.dto;

import br.com.fundatec.Pedido.enums.SituacaoPedidoEnum;
import br.com.fundatec.Pedido.model.Entrega;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class PedidoInputDto {

    @NotBlank(message = "O descrição é obrigatório.")
    private String descricao;

    @NotBlank(message = "O campo endereço é obrigatório.")
    private String endereco;

    @NotBlank(message = "O data é obrigatório.")
    private LocalDate data;

    @NotBlank(message = "O campo situação é obrigatório.")
    private SituacaoPedidoEnum situacao;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public SituacaoPedidoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoPedidoEnum situacao) {
        this.situacao = situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
