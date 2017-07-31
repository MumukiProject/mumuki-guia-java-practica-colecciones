Map<String, int> ingredientes = new HashMap<>() {{
  put("Piel de serpiente arborea", 2);   
  put("Bezoar", 1); 
}};
Quique quique = new Quique();
Profesor profesor = new Profesor(ingredientes);
quique.setProfesor(profesor);

@Test
public void quique_puede_hacer_la_pocion() {
  Assert.assertEquals(true, quique.puedeHacerPocion(Arrays.asList("Piel de serpiente arborea", "Bezoar")));
}

@Test
public void a_severo_le_falta_escarabajo_magico() {
  Assert.assertEquals(false, quique.puedeHacerPocion(Arrays.asList("Escarabajo Magico", "Bezoar")));
}

@Test
public void quique_puede_si_la_pocion_no_implica_ingredientes() {
  Assert.assertEquals(true, quique.puedeHacerPocion(Arrays.asList()));
}