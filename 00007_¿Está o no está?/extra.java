import java.lang.Math;
class TeoriaDeNumeros {
  public static boolean esPrimo(Integer numero) {
      return numero > 2
        && IntStream.rangeClosed(2, (Integer) Math.sqrt(numero))
        .noneMatch(n -> (numero % n == 0));
  }  
}
