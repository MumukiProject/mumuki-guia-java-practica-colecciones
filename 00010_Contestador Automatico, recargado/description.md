Te presentamos el tipo de coleccion: los mapas `HashMap`. Son estructuras _indexadas_, que te permiten asignarle a ciertas claves un valor. 

Podés pensarlo como un diccionario que te permite buscar definiciones :book:. Por ejemplo, podríamos guardar ...

```java
Map<String, String> diccionarioRae = new HashMap<>();
diccionarioRae.put("casa", "Edificio para habitar. Una casa de ocho plantas");
diccionarioRae.put("noctámbulo", "Que anda vagando durante la noche");
```
...podríamos obtenerlas pasandole la clave

``` java
diccionarioRae.get("noctámbulo"); // retorna "Que anda vagando durante la noche"
```

> ¿Te animás a mejorar tu solución usando un `HashMap`?
