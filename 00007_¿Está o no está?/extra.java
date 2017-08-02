class TeoriaDeNumeros {
  public static boolean esPrimo(double numero) {
      return numero > 2
        && IntStream.rangeClosed(2, (double) numero ^ 0.5)
        .noneMatch(n -> (numero % n == 0));
  }  
}
