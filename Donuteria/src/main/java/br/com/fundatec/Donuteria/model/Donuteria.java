package br.com.fundatec.Donuteria.model;

import sun.util.resources.LocaleData;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Donuteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroPedido;
    private LocaleData dataPedido;
    private String descricao;
    private String endereco;
    private String entregador;

    public Long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Long numeroPedido) {
        this.numeroPedido = numeroPedido;
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

    public String getEntregador() {
        return entregador;
    }

    public LocaleData getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocaleData dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setEntregador(String entregador) {
        this.entregador = entregador;


    }
}
