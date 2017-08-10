Seguramente alguna vez jugaste a este famoso juego de cartas :diamonds:. Te recordamos las reglas:

* Las cartas se mezclan y apilan en la mesa.
* Luego cada jugador retira una carta de la parte de arriba del mazo hasta que alguien saque el _as de oro_, en ese caso el jugador pierte.

Por suerte en **Java** existe un tipo de colección perfecta para modelar este juego, la pila o `Stack`. El `Stack` tiene 2 operaciones:

* `push` para colocar un elemento encima de la pila
* `pop` para retirar el ultimo elemento colocado.

> Ahora vamos a divertirnos, implementá los métodos:
>
> * (void) `barajar` -> que dada una lista de cartas las coloque todas en la _Pila_ 
>
>* (boolean) `jugar` -> que retire una carta de la pila, y retorne :
>   * true en caso de que la carta sea el `as de oro`
>   * false en cualquier otro caso
