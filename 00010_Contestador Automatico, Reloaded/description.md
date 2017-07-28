Te presentamos el tipo de coleccion `Map`. Los mapas son estructuras indexadas, que te permiten asignarle a ciertas claves el valor que corresponda.

Por ejemplo, si quisieramos almacenar las edades de algunas personas:

```java
HashMap<Int, String> edades = new HashMap<>();
edades.put("Laura", 24);
edades.put("Martin", 30);
```

Luego se puede obtener el valor pasandole la clave

``` java
edades.get("Laura");
```

> Mejorá utilizando un mapa la solución del ejercicio pasado
