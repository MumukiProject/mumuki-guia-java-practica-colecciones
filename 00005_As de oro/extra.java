class Carta {
  String nombre;
  
  Carta(String nombre) {
    this.nombre = nombre;
  }
  
  String esElAsDeOro() {
    return nombre == "as de oro";
  }
}