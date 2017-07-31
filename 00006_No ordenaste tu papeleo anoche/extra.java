class Monstruo {
  String nombre;
  
  Monstruo(String nombre) {
    this.nombre = nombre;
  }
  
  Papeleo getPapeleo() {
    return new Papeleo(nombre.length());
  }
}
class Papeleo {
  int cantidad;

  Papeleo(int cantidad) {
    this.cantidad = cantidad;
  }
}