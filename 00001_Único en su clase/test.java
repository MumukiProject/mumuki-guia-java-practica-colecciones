Huella laura = new Huella("Laura");
Huella martin = new Huella("Martin");
ArrayList<Huella> huellas;
@Test
public void cuandoHay3RepetidosSoloQuedaUno() {
  huellas = Array.asList(laura, laura, laura);
  RegistroNacional registro = new RegistroNacional(huellas);
  Assert.assertEquals(new Set(huellas), registro.procesarHuellas());
}