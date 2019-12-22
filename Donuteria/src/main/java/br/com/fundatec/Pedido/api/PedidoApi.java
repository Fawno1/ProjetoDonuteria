package br.com.fundatec.Pedido.api;

import br.com.fundatec.Pedido.api.dto.ErroDto;
import br.com.fundatec.Pedido.api.dto.PedidoInputDto;
import br.com.fundatec.Pedido.api.dto.PedidoOutputDto;
import br.com.fundatec.Pedido.mapper.PedidoMapper;
import br.com.fundatec.Pedido.model.Pedido;
import br.com.fundatec.Pedido.service.PedidoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PedidoApi{

    private final PedidoService pedidoService;
    private final PedidoMapper pedidoMapper;

    public PedidoApi(PedidoService pedidoService, PedidoMapper pedidoMapper) {
        this.pedidoService = pedidoService;
        this.pedidoMapper = pedidoMapper;
    }

    @GetMapping("/pedidos/{id}")
    @ApiOperation(value = "Realiza busca de pedido", notes = "Realiza busca de um pedido em específico pelo ID")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Pedido encontrado.", response = PedidoOutputDto.class)})
    public ResponseEntity<?> getPedido(@PathVariable Long id) {
        Pedido pedido = pedidoService.consultar(id);
        if(pedido != null) {
           PedidoOutputDto pedidoOutputDto = pedidoMapper.mapear(pedido);
           return ResponseEntity.ok(pedidoOutputDto);
        }
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/pedidos")
    @ApiOperation(value = "Lista pedidos", notes = "Realiza listagem de todos pedidos no banco de dados.")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Listagem de pedidos pronta.", response = PedidoOutputDto.class)})
    public ResponseEntity<?> getPedidos() {
        List<Pedido> pedidos = pedidoService.listarPedidos();
        if (pedidos.size() == 0) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(pedidos);
    }

    @PostMapping("/pedidos")
    @ApiOperation(value = "Inclusão de pedido",
            notes = "Faz a inclusão de um pedido no banco de dados e verifica se os campos foram devidamente preenchidos")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "O pedido foi incluído.", response = PedidoOutputDto.class)})
    public ResponseEntity<?> incluir(@RequestBody PedidoInputDto pedidoInputDto) {
        try{
            Pedido pedido = pedidoMapper.mapear(pedidoInputDto);
            pedido = pedidoService.incluir(pedido);
            PedidoOutputDto pedidoOutputDto = pedidoMapper.mapear(pedido);
            return ResponseEntity.status(HttpStatus.CREATED).body(pedidoOutputDto);
        } catch (RuntimeException e) {
            ErroDto erroDto = new ErroDto();
            erroDto.setMensagem(e.getMessage());
            return ResponseEntity.status((HttpStatus.EXPECTATION_FAILED)).body(erroDto);
        }
    }

    @PutMapping("/pedidos/{id}")
    @ApiOperation(value = "Atualiza um pedido", notes = "Atualiza um pedido de acordo um ID em específico")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "O pedido foi atualizado.", response = PedidoOutputDto.class)})
    public ResponseEntity<?> atualizarPedido(@PathVariable Long id, @Valid @RequestBody PedidoInputDto pedidoInputDto) {
        Pedido pedido = pedidoMapper.mapear(pedidoInputDto);
        pedido = pedidoService.atualizar(id, pedido);
        if(pedido != null) {
            return ResponseEntity.noContent().build();
        }
        PedidoOutputDto pedidoOutputDto = pedidoMapper.mapear(pedido);
        return ResponseEntity.ok(pedidoOutputDto);
    }

    @DeleteMapping("/pedidos/{id}")
    @ApiOperation(value = "Exclusão de pedido", notes = "Deleta um pedido de acordo com um ID em específico")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Protocolo deletado com sucesso!")})
            public ResponseEntity<?> excluirPedido(@PathVariable Long id) {
           pedidoService.excluir(id);
           return ResponseEntity.ok().build();
    }

}
