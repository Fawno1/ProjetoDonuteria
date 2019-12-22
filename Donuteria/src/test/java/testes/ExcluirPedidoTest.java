package testes;

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
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class ExcluirPedidoTest {
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
//        pedido.setData(LocalDate.of(2018,10,21));
//        pedido.setDescricao("Donut de morango com leite condensado");
//        pedido.setEndereco("Rua das palmeiras, 265");
//        pedido.setSituacao(SituacaoPedidoEnum.PENDENTE);
//
//        pedido = pedidoRepository.save(pedido);
//    }
//
//    @Test
//    public void deveExcluirUmPedido () {
//        RestAssured.given()
//                .when()
//                .delete("/pedidos/{id}", pedido.getId())
//                .then()
//                .statusCode(HttpStatus.OK.value());
//
//        Assert.assertEquals(0, pedidoRepository.count());
//    }
//}
