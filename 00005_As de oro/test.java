Carta asDeOro = new Carta("as de oro");
Carta dosDeEspada = new Carta("dos de espada");
Carta cuatroDeCopa = new Carta("cuatro de copa");

Baraja baraja = new Baraja();

@Test
public void cuand_solo_hay_un_as_de_oro() {
  baraja.barajar(Arrays.asList(asDeOro));
  Assert.assertEquals(true, baraja.jugar());
  Assert.assertEquals(0, baraja.getPila().size());
}