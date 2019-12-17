package br.com.fundatec.Pedido.model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String entregador;
    @OneToMany(mappedBy = "entrega")
    private Set<Pedido> pedidos;

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

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
