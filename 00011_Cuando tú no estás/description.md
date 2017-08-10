¿Y qué pasa si llama alguien que no está entre los conocidos? ¿Lanzará una excepción?

No. Cuando a un `Map` le pedimos el valor de una clave que no fue agregada previamente mediante `put`, `get` devolverá `null`:

```java
Map<String, String> diccionario = new HashMap<>();
diccionario.get("zorzal"); // Devuelve null
```

Esto no es muy útil, y puede dar lugar a problemas, ¡recordá que no podemos enviarle ningún mensaje a `null`!. Afortunadamente los `Map`s entienden un mensaje `getOrDefault` que podría serte útil, que toma como parámetro adicional qué devolver cuando la clave no está: 

```java
Map<String, String> diccionario = new HashMap<>();
diccionario.getOrDefault("zorzal", "Palabra desconocida"); // Devuelve "Palabra desconocida"
```

> Vamos a hacer una última mejora a nuestro contestador: queremos que a toda persona desconocida le responda `"Intente más tarde."`. 
> 
> Ah, nuevamente, no uses `if` :stuck_out_tongue:

