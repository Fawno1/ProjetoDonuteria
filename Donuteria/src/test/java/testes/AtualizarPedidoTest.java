package testes;

import br.com.fundatec.Pedido.api.dto.PedidoOutputDto;
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

import static br.com.fundatec.Pedido.enums.SituacaoPedidoEnum.PENDENTE;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//
//public class AtualizarPedidoTest {
//
//
//        @LocalServerPort
//        private int randomPort;
//
//        @Autowired
//        private PedidoRepository pedidoRepository;
//        private Pedido pedido;
//
//        @Before
//        public void setUp() throws Exception {
//            RestAssured.baseURI = "http://localhost";
//            RestAssured.port = randomPort;
//
//            pedidoRepository.deleteAll();
//
//            pedido = new Pedido();
//            pedido.setDescricao("Donut de chocolate com recheio de nutella");
//            pedido.setEndereco("Rua arvoredo azul, 58");
//            pedido.setData(LocalDate.of(2018, 11, 23));
//            pedido.setSituacao(PENDENTE);
//            pedido = pedidoRepository.save(pedido);
//        }
//
//        @Test
//        public void deveAtualizarUmPedido() {
//            PedidoOutputDto pedidoOutputDto = RestAssured.given()
//                    .contentType(MediaType.APPLICATION_JSON_VALUE)
//                    .accept(MediaType.APPLICATION_JSON_VALUE)
//                    .body("{" +
//                            "\"descricao\": \"Donut de morango com cobertua de brigadeiro\"," +
//                            "\"endereco\": \"Rua dos palmares, 48\",\n" +
//                            "\"data\": \"2018-10-21\"," +
//                            "\"situacao\": \"PENDENTE\"," +
//                            "}")
//                    .when()
//                    .put("/pedidos/{id}", pedido.getId())
//                    .then()
//                    .statusCode(HttpStatus.OK.value())
//                    .extract()
//                    .as(PedidoOutputDto.class);
//
//            Assert.assertEquals("Donut de morango com cobertura de brigadeiro" ,pedidoOutputDto.getDescricao());
//            Assert.assertEquals("Rua dos palmares, 48", pedidoOutputDto.getEndereco());
//            Assert.assertEquals("2018-10-21", pedidoOutputDto.getData().toString());
//            Assert.assertEquals("PENDENTE", pedidoOutputDto.getSituacao());
//        }
//
//
//    }

