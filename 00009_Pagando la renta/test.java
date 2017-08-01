Integrante donRamon = new Integrante("Don Ramon", -500);
Integrante chavo = new Integrante("Chavo del 8", 0);
Integrante bruja = new Integrante("Bruja del 71", 1000);
Integrante florinda = new Integrante("Doña Florinda", 1200);
Vecindad vecindad;

@Test
public void solo_don_ramon_debe() {
  vecindad = new Vecindad(Arrays.asList(donRamon, chavo, bruja, florinda));
  Assert.assertEquals(1, vecindad.cuantosDeben());
}
@Test
public void lo_que_paga_la_bruja() {
  vecindad = new Vecindad(Arrays.asList(donRamon, chavo, bruja, florinda));
  Assert.assertEquals(1000, vecindad.pagoEmbrujado());
}
@Test
public void lo_que_pagaron_todos() {
  vecindad = new Vecindad(Arrays.asList(donRamon, chavo, bruja, florinda));
  Assert.assertEquals(1700, vecindad.loQuePagaronTodos());
}
@Test
public void el_que_mas_pago_donia() {
  vecindad = new Vecindad(Arrays.asList(donRamon, chavo, bruja, florinda));
  Assert.assertEquals("Doña Florinda", vecindad.elQueMasPago());
}
@Test
public void el_que_mas_pago_bruja() {
  vecindad = new Vecindad(Arrays.asList(donRamon, chavo, bruja));
  Assert.assertEquals("Bruja del 71", vecindad.elQueMasPago());
}
@Test
public void el_que_mas_pago_chavo() {
  vecindad = new Vecindad(Arrays.asList(donRamon, chavo));
  Assert.assertEquals("Bruja del 71", vecindad.elQueMasPago());
}
@Test
public void los_mas_pudientes() {
  vecindad = new Vecindad(Arrays.asList(donRamon, chavo, bruja, florinda));
  Assert.assertEquals(Arrays.asList(bruja, florinda), vecindad.losMasPudientes());
}