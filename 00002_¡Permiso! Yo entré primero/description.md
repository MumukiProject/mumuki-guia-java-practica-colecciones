El tio de uno de nosotros tiene una panadería :bread:, y tiene muchos problemas para saber que cliente llegó primero.

Por suerte **Java** <i class="da da-java"></i> ya pensó en nosotros y nos dió el tipo de colección `Queue` que funciona como una fila o cola.

Las colas entienden 2 mensajes:

* `add` -> recibe un elemento y lo ingresa a la cola
* `poll` -> quita el primer elemento ingresado

> Ayudemos al tio implementando los métodos:
>
> * `entrarALaPanaderia` que ingrese una `Persona` a la cola
>
> * `quienSigue` que retorne la `Persona` que sigue