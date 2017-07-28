class ContestadorAutomatico {
  private HashMap<String, String> respuestas;
  ContestadorAutomatico() {
  // Completá el mapa acá   
  }
  String responderA(String nombre) {
    String respuesta = "";
    if(nombre == "martin")
      respuesta = "Llamá mas tarde";
    if(nombre == "laura")
      respuesta = "Ahora no puedo, te llamo después";
    if(nombre == "franco")
      respuesta = "...";
    return respuesta;
  }
}