<h1>ProjetoDonuteria<h1>

O negócio dela é resumido em receber uma ligação, ou mensagem para saber a descrição dos pedidos e o endereço para realizar a entrega. Para facilitar o processo, eles têm como objetivo fazer a automação desses pedidos tanto do recebimento do pedido quanto para a finalização e também conseguir verificar as situações dos pedidos. 

A gestão das entregas é feita da seguinte maneira: 
1. Recebe o pedido e ele é cadastrado.
2. Atribui um entregador e inicia a entrega.
3. Faz a entrega e finaliza o pedido.

<h1>Explicando a construção da aplicação.</h1>
  
<h2>api</h2>
 <b>PedidoApi</b>
  <ul>
 <li>Nessa classe fazemos a inclusão, exclusão, atualização e consulta de dados do pedido.</li>
  </ul>
      
 <b>EntregaApi</b>
 <ul>
  <li>Nessa classe fazemos a inclusão de uma entrega no pedido.</li>
  </ul>
  
  <h2>dto</h2>
  <b>PedidoInputDto</b>
  <ul>
  <li> O usuário insere dados como descrição do pedido e o endereço para realizar entrega.</li>
  </ul>
  
  <b>PedidoOutputDto</b>
  <ul>
  <li>Mostra as informações importantes.</li>
  </ul>
  
  <b>EntregaInputDto</b>
  <ul>
  <li>Um entregador é atribuído para realizar a entrega.</li>
  </ul>
  
  <b>EntregaOutputDto</b>
  <ul>
  <li>Mostra informações importantes.</li>
  </ul>
  
<b>ErroOutputDto</b>
<ul>
  <li>Mostra uma mensagem de erro para o usuário.</li>
  </ul>
  
  <h2>enum</h2>
  <b>SituacaoPedidoEnum</b>
  <ul>
    <li>Conjunto de valores pré definidos(PENDENTE,ENTREGUE).</li>
  </ul>
  
 <h2>mapper</h2>
 <b>PedidoMapper</b>
 <ul>
  <li> Mapeamento das classes Pedido, PedidoInputDto e PedidoOutputDto. Pega as informações inseridas no PedidoInputDto, as armazena no Pedido, e posteriormente as armazena no PedidoOutputDto onde as mostra.</li>
   </ul>
    <b>EntregaMapper</b>
    <ul>
      <li>Mapeamento das classes Entrega, EntregaInputDto e EntregaOutputDto. Pega as informações inseridas no EntregaInputDto, as armazena na Entrega, e posteriormente as armazena no EntregaOutputDto, onde vai mapear entrega com o pedido.</li>
    </ul>
    <h2>model</h2>
    <b>Pedido</b>
    <ul>
      <li>Armazena os atributos do pedido.</li>
    </ul>
    <b>Entrega</b>
    <ul>
      <li>Armazena os atributos da Entrega.</li>
      </ul>
      <h2>repository</h2>
      <b>PedidoRepository</b>
      <ul>
      <li>Interface que irá salvar as informações no nosso banco de dados.</li>
      </ul>
      <b>EntregaRepository</b>
      <ul>
      <li>Interface que irá salvar as informações no nosso banco de dados.</li>
      </ul>
      <h2>service</h2>
      <b>PedidoService</b>
      <ul>
      <li>Regras de negócio presentes. Instanciamos PedidoRepository para que possamos ter conexão com nosso banco de dados. No PedidoService, temos os nossos métodos de incluir, deletar, buscar, atualizar e listar.</li>
      </ul>
      <b>EntregaService</b>
      <ul>
      <li> Instanciamos PedidoService(para que possamos consultar o idPedido e atribuir a uma entrega) e EntregaRepository para que possamos ter a conexão com nosso banco de dados. No entregaService temos o método que consulta o idPedido e atribuí-o a uma entrega.
        </ul>
        <h2>swagger</h2>
        <b>SwaggerConfig</b>
        <ul>
      <li> Aqui temos a documentação de formato "agradável". De modo que nos mostre nossos métodos(incluir, deletar, consultar, atualizar e listar) e nossas classes presentes no model.</li>
        </ul>
        <h2>test</h2>
        <b>IncluirPedidoTest</b>
        <ul>
  <li> Cria um pedido e depois testa sua inclusão(IncluirPedidoTest).</li>
  </ul>
        <b>AtualizarPedidoTest</b>
        <ul>
        <li> Faz a criação de um pedido(setIUP) e depois testa sua atualização(AtualizarPedidoTest).</li>
        </ul>
        <b>ConsultarPedidoTest</b>
        <ul>
        <li> Faz a criação de um pedido(setUp) e depois consulta(ConsultarPedidoTest).</li>
        </ul>
        <b>ExcluirPedidoTest</b>
        <ul>
  <li> Faz a criação de um pedido(setUp) e depois testa sua exclusão(ExcluirPedidoTest).</li>
  </ul>
