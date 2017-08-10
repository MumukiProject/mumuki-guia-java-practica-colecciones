@Test
public void responde_llama_mas_tarde_si_llama_martin() {
  ContestadorAutomatico ca = new ContestadorAutomatico();
  Assert.assertEquals("Llamá mas tarde", ca.responderA("martin"));
}

@Test
public void responde_shu_si_llama_lucas() {
  ContestadorAutomatico ca = new ContestadorAutomatico();
  Assert.assertEquals("¡Shu!", ca.responderA("lucas"));
}

@Test
public void responde_ahora_no_puedo_si_llama_laura() {
  ContestadorAutomatico ca = new ContestadorAutomatico();
  Assert.assertEquals("Ahora no puedo, te llamo después", ca.responderA("laura"));
}