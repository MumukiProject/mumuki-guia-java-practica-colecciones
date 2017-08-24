Nos reunimos con amigos a comer empanadas, y como siempre pasa... ¡hacer el pedido es un lío! :scream:

Luego de que anotamos lo que todos quieren comer, nos queda un pedido con gustos desordenados y repetidos, así que nos gustaría poder solucionarlo de la siguiente forma: 

```java
Gusto jamonYQueso  = // ...
Gusto carneSuave   = // ...
Gusto carnePicante = // ...

Pedido unPedido = new Pedido();
unPedido.anotar(jamonYQueso);
unPedido.anotar(carneSuave);
unPedido.anotar(carnePicante);
unPedido.anotar(jamonYQueso);

unPedido.gustos();
// Nos devuelve un mapa donde la clave es el gusto de empanada y el valor la cantidad. 
// En este caso quedaría carneSuave => 1, carnePicante => 1, jamonYQueso => 2
```

> Implementá los métodos `anotar` y `gustos` de la clase `Pedido`, Asumí que la clase `Gusto` ya existe. 