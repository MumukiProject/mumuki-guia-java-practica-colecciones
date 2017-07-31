class ProfesorSevero {
  Map<String, Integer> inventario = new HashMap<>();
  
  ProfesorSevero(HashMap<String, Integer> inventario) {
    this.inventario = inventario;
  }
  
  Map<String, Integer> getInventario() {
    return inventario;
  }
}