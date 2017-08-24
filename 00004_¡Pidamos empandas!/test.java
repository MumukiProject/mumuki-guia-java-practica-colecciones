Gusto jamonYQueso  =  new Gusto("Jamon y Queso");
Gusto carneSuave   =  new Gusto("Carne Suave");
Gusto carnePicante =  new Gusto("Carne Picante");

@Test
public void cuando_no_se_pidio_nada() {
  Pedido unPedido = new Pedido();
  unPedido.anotar(jamonYQueso);
  unPedido.anotar(jamonYQueso);
  unPedido.anotar(carnePicante);
  unPedido.anotar(carnePicante);
  unPedido.anotar(jamonYQueso);
  unPedido.anotar(jamonYQueso);
  
  Assert.assertEquals("Hay 0 de jamón y queso", 0, unPedido.gustos().getOrDefault(jamonYQueso, 0));
  Assert.assertEquals("Hay 0 de carne suave", 0, unPedido.gustos().getOrDefault(carneSuave, 0));
  Assert.assertEquals("Hay 0 de carne picante", 0, unPedido.gustos().getOrDefault(carnePicante, 0));
}


@Test
public void cuando_hay_3_de_jamonYQueso_2_de_carnePicante_y_2_de_carneSuave() {
  Pedido unPedido = new Pedido();
  unPedido.anotar(jamonYQueso);
  unPedido.anotar(jamonYQueso);
  unPedido.anotar(carnePicante);
  unPedido.anotar(carnePicante);
  unPedido.anotar(carneSuave);
  unPedido.anotar(carneSuave);
  unPedido.anotar(jamonYQueso);
  
  Assert.assertEquals("Hay 3 de jamón y queso", 3, unPedido.gustos().get(jamonYQueso));
  Assert.assertEquals("Hay 2 de carne suave",   2, unPedido.gustos().get(carneSuave));
  Assert.assertEquals("Hay 2 de carne picante", 2, unPedido.gustos().get(carnePicante));
}


@Test
public void cuando_hay_4_de_jamonYQueso_y_2_de_carnePicante() {
  Pedido unPedido = new Pedido();
  unPedido.anotar(jamonYQueso);
  unPedido.anotar(jamonYQueso);
  unPedido.anotar(carnePicante);
  unPedido.anotar(carnePicante);
  unPedido.anotar(jamonYQueso);
  unPedido.anotar(jamonYQueso);
  
  Assert.assertEquals("Hay 4 de jamón y queso", 4, unPedido.gustos().get(jamonYQueso));
  Assert.assertEquals("Hay 0 de carne suave",   2, unPedido.gustos().getOrDefault(carneSuave, 0));
  Assert.assertEquals("Hay 2 de carne picante", 2, unPedido.gustos().get(carnePicante));

}