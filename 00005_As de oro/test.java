Carta asDeOro = new Carta("as de oro");
Carta dosDeEspada = new Carta("dos de espada");
Carta cuatroDeCopa = new Carta("cuatro de copa");

Baraja baraja = new Baraja();

@Test
public void cuando_solo_hay_un_as_de_oro() {
  baraja.barajar(Arrays.asList(asDeOro));
    Assert.assertEquals(1, baraja.getPila().size());
  Assert.assertEquals(true, baraja.jugar());
  Assert.assertEquals(0, baraja.getPila().size());
}

@Test
public void cuand_el_as_esta_ultimo() {
  baraja.barajar(Arrays.asList(asDeOro, dosDeEspada));
  Assert.assertEquals(2, baraja.getPila().size());
  Assert.assertEquals(false, baraja.jugar());
  Assert.assertEquals(1, baraja.getPila().size());
  Assert.assertEquals(true, baraja.jugar());
  Assert.assertEquals(0, baraja.getPila().size());
}