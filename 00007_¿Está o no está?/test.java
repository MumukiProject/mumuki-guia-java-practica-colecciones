@Test
public void primer_impar_es_3() {
  MatematicoHindu ramanujan = new MatematicoHindu(Arrays.asList(2,3,4));
  Assert.assertEquals(Optional.of(3), ramanujan.obtenerPrimerImpar());
  Assert.assertEquals(new Integer(4), ramanujan.siguienteAlPrimerImpar());
}

@Test
public void no_hay_impares() {
  MatematicoHindu ramanujan = new MatematicoHindu(Arrays.asList(2,4));
  Assert.assertEquals(Optional.empty(), ramanujan.obtenerPrimerImpar());
  
}
@Test(expected = NoSuchElementException.class)
public void lanza_error_cuando_no_hay_impares() {
  MatematicoHindu ramanujan = new MatematicoHindu(Arrays.asList(4));
  ramanujan.siguienteAlPrimerImpar();
}