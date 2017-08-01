class Integrante {
  String nombre;
  int rentaPaga;

  Integrante(String nombre, int rentaPaga) {
    this.nombre = nombre;
    this.rentaPaga = rentaPaga;
  }
  
  int getRentaPaga() {
    return rentaPaga;
  }
  String getNombre() {
    return nombre;
  }
}