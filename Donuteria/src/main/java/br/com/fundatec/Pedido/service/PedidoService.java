package br.com.fundatec.Pedido.service;

import br.com.fundatec.Pedido.enums.SituacaoPedidoEnum;
import br.com.fundatec.Pedido.model.Pedido;
import br.com.fundatec.Pedido.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> listarPedidos() {
        return (List<Pedido>) pedidoRepository.findAll();
    }

    public Pedido consultar(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public Pedido incluir(Pedido pedido) {
        pedido.setSituacao(SituacaoPedidoEnum.PENDENTE);
        return pedidoRepository.save(pedido);
    }

    public Pedido atualizar(Long idPedido, Pedido pedidoParaAtualizacao) {
        Pedido pedido = consultar(idPedido);
        if(pedido != null) {
            pedido.setDescricao(pedidoParaAtualizacao.getDescricao());
            pedido.setEndereco(pedidoParaAtualizacao.getEndereco());
            pedido.setData(pedidoParaAtualizacao.getData());
            pedido.setSituacao(pedidoParaAtualizacao.getSituacao());
            pedido = pedidoRepository.save(pedido);
        }
        return pedido;
    }

    public void excluir(Long id) {
        pedidoRepository.deleteById(id);
    }

}