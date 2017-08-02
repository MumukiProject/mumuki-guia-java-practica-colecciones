class TeoriaDeNumeros {
  public static boolean esPrimo(Integer numero) {
      return numero > 2
        && IntStream.rangeClosed(2, (Integer) new Double(numero) ^ 0.5)
        .noneMatch(n -> (numero % n == 0));
  }  
}
