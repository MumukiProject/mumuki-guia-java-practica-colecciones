@Test
public void primer_primo_es_3() {
  MatematicoHindu ramanujan = new MatematicoHindu(Arrays.asList(2,3,4));
  Assert.assertEquals(new Optional.of(3), ramanujan.obtenerPrimerImpar());
  Assert.assertEquals(new Integer(4), ramanujan.siguienteAlPrimerImpar());
}