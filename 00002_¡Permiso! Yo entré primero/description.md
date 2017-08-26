Nuestro tío Gustavo tiene una panadería :bread:...

```java
Panaderia laFlorDelCenteno = new Panaderia();
```

...y tiene muchos problemas para saber qué cliente llegó primero. Por ejemplo, si primero entran Jorge y luego Amalia...

```java
laFlorDelCenteno.entrar(jorge);
laFlorDelCenteno.entrar(amalia);
```

...quedan ambos en espera....

```java
laFlorDelCenteno.enEspera();
// devuelve una colección con jorge y amalia
```

... y si atiende al primero (Jorge), en espera queda sólo Amalia....

```java
laFlorDelCenteno.atender();
laFlorDelCenteno.enEspera();
// devuelve una sólo amalia
```

Pero si luego entra Magadalena, se pone al final de la fila y atiende primero a Amalia...

```java
laFlorDelCenteno.entrar(magdalena);
laFlorDelCenteno.atender();
laFlorDelCenteno.enEspera();
// devuelve una sólo Magdalena.
```

Esto es lo que se conoce como una _cola_: el primero que entra es el primero que sale (principio abreviado como [FIFO](https://es.wikipedia.org/wiki/First_in,_first_out), por sus siglas en inglés). La buena noticia es que Java cuenta con una interfaz de colección llamada `Queue` que trabaja así que tiene 2 mensajes principales:

* `offer` recibe un elemento y lo ingresa a la cola
* `poll` quita el primer elemento ingresado

> Ayudemos al tío Gustavo desarrollando la clase `Panaderia`. Asumí que ya existe una clase `Cliente`. 

