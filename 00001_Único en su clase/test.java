HuellaDactilar laura = new HuellaDactilar("Laura");
HuellaDactilar martin = new HuellaDactilar("Martin");
List<HuellaDactilar> huellas = new ArrayList<>();

@Test
public void cuando_hay_3_repetidos_solo_queda_uno() {
  huellas.add(laura);
  huellas.add(laura);
  huellas.add(laura);
  RegistroNacional registro = new RegistroNacional(huellas);
  Assert.assertEquals(new HashSet(huellas), registro.procesarHuellas());
  Assert.assertEquals(1, registro.cantidadDePersonasRegistradas());
}

@Test
public void cuando_hay_3_pero_solo_1_repetido() {
  huellas.add(laura);
  huellas.add(laura);
  huellas.add(martin);
  RegistroNacional registro = new RegistroNacional(huellas);
  Assert.assertEquals(new HashSet(huellas), registro.procesarHuellas());
  Assert.assertEquals(2, registro.cantidadDePersonasRegistradas());
}

@Test
public void cuando_hay_0_no_hay_nadie() {
  RegistroNacional registro = new RegistroNacional(huellas);
  Assert.assertEquals(new HashSet(), registro.procesarHuellas());
  Assert.assertEquals(0, registro.cantidadDePersonasRegistradas());
}