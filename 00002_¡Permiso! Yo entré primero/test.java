Cliente martin = new Cliente("Martin");
Cliente laura = new Cliente("Laura");
Cliente valeria = new Cliente("Valeria");
Panaderia panaderia;

@Before
public void before() {
  panaderia = new Panaderia();
}

@Test
public void si_entran_laura_primero_y_martin_despues_atiende_primero_a_laura() {
  panaderia.entrar(laura);
  panaderia.entrar(martin);
  
  panaderia.atender();

  Assert.assertEquals(Arrays.asList(martin), panaderia.enEspera());
}

@Test
public void si_solo_entra_valeria_y_no_la_atiende_queda_en_espera() {
  panaderia.entrar(valeria);
  Assert.assertEquals(Arrasys.asList(valeria), panaderia.enEspera());
}



@Test
public void si_solo_entra_valeria_y_la_atiende_no_queda_nadie_en_espera() {
  panaderia.entrar(valeria);
  panaderia.atender();
  Assert.assertTrue(panaderia.enEspera().isEmpty());
}


@Test
public void si_entra_martin_luego_laura_luego_valiera_atiende_primero_a_martin_despues_a_laura_despues_a_valeria() {
  panaderia.entrar(martin);
  panaderia.entrar(laura);
  panaderia.entrar(valeria);
  
  panaderia.atender();
  Assert.assertEquals(Arrays.asList(laura, valeria), panaderia.enEspera());

  panaderia.atender();
  Assert.assertEquals(Arrays.asList(valeria), panaderia.enEspera());

  
  panaderia.atender();
  Assert.assertTrue(panaderia.enEspera().isEmpty());

}
