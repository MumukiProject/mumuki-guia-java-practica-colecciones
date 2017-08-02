class TeoriaDeNumeros {
  public static boolean esPrimo(Integer numero) {
      return numero > 2
        && IntStream.rangeClosed(2, (Integer) Math.sqrt(number))
        .noneMatch(n -> (number % n == 0));
  }  
}
