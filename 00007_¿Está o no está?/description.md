A veces en Java tenemos operaciones que pueden o no devolver un resultado. Como es un lenguaje con tipado estático, el tipo del retorno tiene que ser único, por lo que se creó el tipo `Optional<>`.

Por ejemplo:

``` java
List<Integer> numeros = new ArrayList<>();
...
numeros.stream().filter((numero) -> numero > 2).findFirst();
```

En caso de que el `filter` haya encontrado numeros mayores a 2, el `findFirst` retornaria el primero de esos números, pero si no hubiesen números mayores a 2 debería retornar vacío o null.

Para evitar este problema, en este caso `findFirst` devuelve un `Optional<Integer>`, que es un contenedor.
Los Optional entienden los siguientes mensajes:

* `get()` devuelve el valor si está presente, sino lanza la excepción `NoSuchElementException`
* `isPresent()` que retorna true si el valor está presente


