HuellaDactilar laura = new HuellaDactilar("Laura");
HuellaDactilar martin = new HuellaDactilar("Martin");
ArrayList<HuellaDactilar> huellas;
@Test
public void cuandoHay3RepetidosSoloQuedaUno() {
  huellas = Array.asList(laura, laura, laura);
  RegistroNacional registro = new RegistroNacional(huellas);
  Assert.assertEquals(new Set(huellas), registro.procesarHuellas());
}