package br.com.fundatec.Pedido.model;

import br.com.fundatec.Pedido.enums.SituacaoPedidoEnum;
import sun.util.resources.LocaleData;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data;
    private String descricao;
    private String endereco;
    @Enumerated(EnumType.STRING) //proprio valor do enum
    private SituacaoPedidoEnum situacao;

    @ManyToOne
    @JoinColumn
    private Entrega entrega;


    public Pedido(Long id, String descricao, String endereco) {
        this.id = id;
        this.descricao = descricao;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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

    public SituacaoPedidoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoPedidoEnum situacao) {
        this.situacao = situacao;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
}
