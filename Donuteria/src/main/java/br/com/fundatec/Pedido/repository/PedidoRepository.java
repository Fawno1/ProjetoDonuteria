package br.com.fundatec.Pedido.repository;

import br.com.fundatec.Pedido.model.Pedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PedidoRepository {

    private static List<Pedido> listaPedidos =
            Arrays.asList(new Pedido(1L, "Café com leite e donut de chocolate", "Quadra 709 Sul Alameda 1"),
                            new Pedido(2L, "Coca-cola e 2 donuts de morango", "Rua Papagaios,412" ),
                    new Pedido(3L, "4 donuts com cobertura de Nutella","2ª Travessa Padre Cícero, 923" ));

        public List<Pedido> listarPedidos(String descricao) {
            List<Pedido> listaResultado = new ArrayList<>();

            for (Pedido pedido : listaPedidos) {
                if(pedido.getDescricao().toLowerCase().contains(descricao.toLowerCase())) {
                }
            }
            return listaResultado;
    }

       public Pedido consultar(Long id){
            for (Pedido pedido : listaPedidos) {
                if(pedido.getId().equals(id)) {
                    return pedido;
                }
            }
            return null;
       }
}
