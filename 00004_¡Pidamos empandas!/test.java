Pedido pedido;
Empanada pollo = new Empanada("Pollo");
Empanada atun = new Empanada("Atun");

@Before
public void before() {
  pedido = new Pedido();
}
@Test
public void 4_de_pollo_2_de_atun() {
  pedido.setEmpanadas(Arrays.asList(pollo, pollo, atun, pollo, atun, pollo));
  Assert.assertEquals(4, pedido.realizarPedido().get("Pollo"));
  Assert.assertEquals(2, pedido.realizarPedido().get("Atun"));
}