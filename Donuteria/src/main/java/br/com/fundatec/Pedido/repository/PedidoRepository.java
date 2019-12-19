package br.com.fundatec.Pedido.repository;

import br.com.fundatec.Pedido.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido,Long> {
}
