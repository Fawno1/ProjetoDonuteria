package testes;

import br.com.fundatec.Pedido.api.dto.PedidoOutputDto;
import br.com.fundatec.Pedido.enums.SituacaoPedidoEnum;
import br.com.fundatec.Pedido.model.Pedido;
import br.com.fundatec.Pedido.repository.PedidoRepository;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class ConsultarPedidoTest {
//
//    @LocalServerPort
//    private int randomPort;
//
//    @Autowired
//    private PedidoRepository pedidoRepository;
//
//    private Pedido pedido;
//
//    @Before
//    public void setUp() throws Exception {
//        RestAssured.baseURI = "http://localhost";
//        RestAssured.port = randomPort;
//
//        pedidoRepository.deleteAll();
//
//        pedido = new Pedido();
//        pedido.setData(LocalDate.of(2018,12,28));
//        pedido.setDescricao("Donut de leite ninho");
//        pedido.setEndereco("Rua manuel euzebio, 945");
//        pedido.setSituacao(SituacaoPedidoEnum.PENDENTE);
//
//        pedido = pedidoRepository.save(pedido);
//    }
//
//    @Test
//    public void deveBuscarUmPedido() {
//        PedidoOutputDto pedidoOutputDto = RestAssured.given()
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .accept(MediaType.APPLICATION_JSON_VALUE)
//                .when()
//                .get("/pedidos/{id}", pedido.getId())
//                .then()
//                .statusCode(HttpStatus.OK.value())
//                .extract()
//                .as(PedidoOutputDto.class);
//
//        Assert.assertEquals("2018-12-28",pedidoOutputDto.getData());
//        Assert.assertEquals("Donut de leite ninho", pedidoOutputDto.getDescricao());
//        Assert.assertEquals("Rua manuel euzebio, 945", pedidoOutputDto.getEndereco());
//        Assert.assertEquals("PENDENTE", pedidoOutputDto.getSituacao());
//    }
//
//}
