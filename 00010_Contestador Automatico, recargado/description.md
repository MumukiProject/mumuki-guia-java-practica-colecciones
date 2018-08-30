Te presentamos un nuevo tipo de colección: los mapas `HashMap`. Son estructuras _indexadas_, en criollo, que se accede a través de un índice. Estas colecciones nos permiten asignarle a ciertas _claves_ un _valor_. 

Podés pensarlo como un diccionario que te permite buscar definiciones :book:. Por ejemplo, podríamos guardar definiciones (nuestros valores)...

```java
Map<String, String> diccionarioRae = new HashMap<>();
diccionarioRae.put("casa", "Edificio para habitar. Una casa de ocho plantas");
diccionarioRae.put("noctámbulo", "Que anda vagando durante la noche");
```
...y obtenerlas más tarde pasándole la palabra (nuestra clave):

``` java
diccionarioRae.get("noctámbulo"); // retorna "Que anda vagando durante la noche"
```

> ¿Te animás a mejorar tu solución usando un `HashMap` y sin usar `if`s?
