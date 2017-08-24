@Test 
public void si_no_registro_sugerencias_entonces_sugerencias_devuelve_una_coleccion_vacia() {
  LibroDeSugerencias libro = new LibroDeSugerencias();
  Assert.assertTrue(libro.sugerencias().isEmpty());
}

@Test 
public void si_no_registro_sugerencias_entonces_cantidadDnisUnicos_devuelve_0() {
  LibroDeSugerencias libro = new LibroDeSugerencias();
  Assert.assertEquals(0, libro.cantidadDnisUnicos());
}

@Test 
public void si_registro_3_dnis_diferentes_cantidadDnisUnicos_devuelve_3() {
  LibroDeSugerencias libro = new LibroDeSugerencias();
  libro.registrarSugerencia("1", "");
  libro.registrarSugerencia("2", "");
  libro.registrarSugerencia("3", "");
  Assert.assertEquals(3, libro.cantidadDnisUnicos());
}


@Test 
public void si_registro_3_dnis_guales_cantidadDnisUnicos_devuelve_1() {
  LibroDeSugerencias libro = new LibroDeSugerencias();
  libro.registrarSugerencia("3", "");
  libro.registrarSugerencia("3", "");
  libro.registrarSugerencia("3", "");
  Assert.assertEquals(1, libro.cantidadDnisUnicos());
}

@Test 
public void si_registro_3_sugerencias_iguales_sugerencias_devuelve_una_coleccion_con_3_elementos() {
  LibroDeSugerencias libro = new LibroDeSugerencias();
  libro.registrarSugerencia("3", "Hola");
  libro.registrarSugerencia("3", "Hola");
  libro.registrarSugerencia("3", "Hola");
  Assert.assertEquals(3, libro.sugerencias().size());
}