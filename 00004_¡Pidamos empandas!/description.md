Nos reunimos con amigos a comer empanadas, pero como siempre pasa... ¡hacer el `Pedido` es un lío! :scream:

Luego de que anotamos lo que todos quieren comer, el `Pedido` tiene una _lista_ de `Empanada`s.
¡Está todo repetido y desordenado!

> Implementá un método `realizarPedido` que convierta la _lista_ desordenada a un mapa donde la clave sea el gusto de empanada y el valor la cantidad
> 
Gusto jamonYQueso = new Gusto();
Gusto carneSuave = new Gusto();
Gusto carnePicante = new Gusto();

Pedido unPedido = new Pedido();
unPedido.anotar(jamonYQueso);
unPedido.anotar(carneSuave);
unPedido.anotar(carnePicante);
unPedido.anotar(jamonYQueso);
unPedido.gustos();