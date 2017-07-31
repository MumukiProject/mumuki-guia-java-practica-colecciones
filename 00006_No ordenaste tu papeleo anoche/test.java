Monstruo miguel = new Monstruo("Miguel");
Monstruo sully = new Monstruo("Sully");
Monstruo randal = new Monstruo("Randall");
SecretariaMonstruosa secretaria;

@Before
public void before() {
  secretaria = new SecretariaMonstruosa();  
}

@Test
public void papeleo_de_miguel() {
  secretaria.encolar(miguel);
  Assert.assertEquals(1, secretaria.getFila().size());
  secretaria.trabajar();
  Assert.assertEquals(0, secretaria.getFila().size());
  Assert.assertEquals(1, secretaria.getPapeleos().size());
  Assert.assertEquals(6, secretaria.getPapeleos().pop().getCantidad());
}

@Test
public void papeleo_de_sully_y_randal() {
  secretaria.encolar(sully);
  secretaria.encolar(randal);
  Assert.assertEquals(2, secretaria.getFila().size());
  secretaria.trabajar();
  Assert.assertEquals(0, secretaria.getFila().size());
  Assert.assertEquals(2, secretaria.getPapeleos().size());
  Assert.assertEquals(5, secretaria.getPapeleos().pop().getCantidad());
  Assert.assertEquals(7, secretaria.getPapeleos().pop().getCantidad());
}