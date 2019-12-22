package testes;

import br.com.fundatec.Pedido.api.dto.PedidoInputDto;
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


//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class IncluirPedidoTest {
//
//    @LocalServerPort
//    private int randomPort;
//
//    @Autowired
//    private PedidoRepository pedidoRepository;
//
//    @Before
//    public void setUp() throws Exception {
//        RestAssured.baseURI = "http://localhost";
//        RestAssured.port = randomPort;
//
//        pedidoRepository.deleteAll();
//    }
//
//    @Test
//    public void deveIncluirUmPedido () {
//        PedidoInputDto pedidoInputDto =  RestAssured.given()
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .accept(MediaType.APPLICATION_JSON_VALUE)
//                .body("{\n" +
//                        "\t\"data\": \"2018-10-21\",\n" +
//                        "\t\"descricao\": \"Donuts sabor chocolate\",\n" +
//                        "\t\"endereco\": \"jardim botanico\",\n" +
//                        "\t\"situacao\": \"PENDENTE\",\n" +
//                        "}")
//                .when()
//                .post("/pedidos")
//                .then()
//                .statusCode(HttpStatus.CREATED.value())
//                .extract()
//                .as(PedidoInputDto.class);
//
//        Assert.assertEquals("2018-10-21,", pedidoInputDto.getData());
//        Assert.assertEquals("Donuts sabor chocolate", pedidoInputDto.getDescricao());
//        Assert.assertEquals("jardim botanico", pedidoInputDto.getEndereco());
//        Assert.assertEquals("PENDENTE", pedidoInputDto.getSituacao());
//    }
//}
