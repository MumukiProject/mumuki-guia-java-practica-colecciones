:hand: ¡No tan rápido! Veamos dos cosas que quizás pasaron desapercibidas sobre éste código: 

```java
Map<String, String> diccionarioRae = new HashMap<>();
```

1. Tipamos a la variable como `Map`, en lugar de `HashMap`. Al igual que con las listas, existe una interfaz común todas las clases de mapas (sí, hay muchas también), llamada `Map`. Y por supuesto, `HashMap` la implementa. 
2. Ojo que `Map`, a diferencia de `Coleccion` y `List`, tiene dos prámetros de tipo: el primero corresponde al tipo de las claves,y el segundo al tipo de los valores. ¡Y podrían no coincidir! Por ejemplo: 

```java
Map<Computadora, Double> precios = new HashMap<>();

Computadora unaComputadora = ...;

precios.put(unaComputadora, 100_099.99);
```


 

