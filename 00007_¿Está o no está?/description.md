A veces tenemos operaciones que pueden o no devolver un resultado. Un buen ejemplo es el mensaje `findFirst`, que devuelve el primer elemento de un _stream_: 

``` java
Arrays.asList(1, 2, 3, 4)
      .stream()
      .filter(numero -> numero > 2)
      .findFirst();
```

En caso de que el `filter` haya encontrado numeros mayores a 2, el `findFirst` retornaria el primero de esos números, pero si no hubiesen números mayores a 2 debería retornar vacío o null.

Para evitar este problema, en este caso `findFirst` devuelve un `Optional<Integer>`, que es un contenedor.
Los Optional entienden los siguientes mensajes:

* `get()` devuelve el valor si está presente, sino lanza la excepción `NoSuchElementException`
* `isPresent()` que retorna true si el valor está presente

> Implementá los métodos:
>
> * `obtenerPrimerImpar` que devuelva un `Optional`
> * `siguienteAlPrimerImpar` que devuelve el entero siguiente al primer primo encontrado
