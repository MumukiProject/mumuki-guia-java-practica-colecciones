Persona martin = new Persona("Martin");
Persona laura = new Persona("Laura");
Persona valeria = new Persona("Valeria");
Panaderia panaderia;

@Before
public void before() {
  panaderia = new Panaderia();
}

@Test
public void martin_entra_despues_que_laura() {
  panaderia.entrarALaPanaderia(laura);
  panaderia.entrarALaPanaderia(martin);
  Assert.assertEquals(laura, panaderia.quienSigue());
}

@Test
public void solo_entra_valeria() {
  panaderia.entrarALaPanaderia(valeria);
  Assert.assertEquals(valeria, panaderia.quienSigue());
}

@Test
public void entra_martin_laura_valeria() {
  panaderia.entrarALaPanaderia(martin);
  panaderia.entrarALaPanaderia(laura);
  panaderia.entrarALaPanaderia(valeria);
  Assert.assertEquals(martin, panaderia.quienSigue());
  Assert.assertEquals(laura, panaderia.quienSigue());
  Assert.assertEquals(valeria, panaderia.quienSigue());
}