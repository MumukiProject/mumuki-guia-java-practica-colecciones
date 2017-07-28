HuellaDactilar laura = new HuellaDactilar("Laura");
HuellaDactilar martin = new HuellaDactilar("Martin");
List<HuellaDactilar> huellas = new ArrayList<>();

@Test
public void cuandoHay3RepetidosSoloQuedaUno() {
  huellas.add(laura);
  huellas.add(laura);
  huellas.add(laura);
  RegistroNacional registro = new RegistroNacional(huellas);
  Assert.assertEquals(new HashSet(huellas), registro.procesarHuellas());
  Assert.assertEquals(1, registro.cantidadDePersonasRegistradas());
}

@Test
public void cuandoHay3PeroSolo1Repetido() {
  huellas.add(laura);
  huellas.add(laura);
  huellas.add(martin);
  RegistroNacional registro = new RegistroNacional(huellas);
  Assert.assertEquals(new HashSet(huellas), registro.procesarHuellas());
  Assert.assertEquals(2, registro.cantidadDePersonasRegistradas());
}