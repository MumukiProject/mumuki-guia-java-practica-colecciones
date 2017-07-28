HuellaDactilar laura = new HuellaDactilar("Laura");
HuellaDactilar martin = new HuellaDactilar("Martin");
ArrayList<HuellaDactilar> huellas;
@Test
public void cuandoHay3RepetidosSoloQuedaUno() {
  huellas = {laura, laura, laura};
  RegistroNacional registro = new RegistroNacional(huellas);
  Assert.assertEquals(new HashSet(huellas), registro.procesarHuellas());
}