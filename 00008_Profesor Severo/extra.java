class ProfesorSevero {
  Map<String, int> inventario = new HashMap<>();
  
  ProfesorSevero(HashMap<String, int> inventario) {
    this.inventario = inventario;
  }
  
  Map<String, int> getInventario() {
    return inventario;
  }
}