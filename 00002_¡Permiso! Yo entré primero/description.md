Nuestro tío tiene una panadería :bread:, y tiene muchos problemas para saber que cliente llegó primero.

En Java tenemos un tipo de colección `Queue` que funciona como una fila o cola. `Queue` es una interfaz que entiende 2 mensajes principales:

* `add` recibe un elemento y lo ingresa a la cola
* `poll` quita el primer elemento ingresado

¿Y quien implementa esta interfaz? Una vieja conocida: ¡la `LinkedList`!

> Ayudemos al tío implementando los métodos:
>
> * `entrarALaPanaderia` que ingrese una `Persona` a la cola
> * `quienSigue` que retorne la `Persona` que sigue