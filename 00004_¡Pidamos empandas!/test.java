Pedido pedido;
Empanada pollo = new Empanada("Pollo");
Empanada atun = new Empanada("Atun");

@Before
public void before() {
  pedido = new Pedido();
}
@Test
public void cuando_hay_4_de_pollo_2_de_atun() {
  pedido.setEmpanadas(Arrays.asList(pollo, pollo, atun, pollo, atun, pollo));
  Assert.assertEquals((int) 4, pedido.realizarPedido().get("Pollo"));
  Assert.assertEquals((int) 2, pedido.realizarPedido().get("Atun"));
}