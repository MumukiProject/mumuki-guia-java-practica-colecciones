Nuestro tío Gustavo tiene una panadería :bread:...

```java
Panaderia laParadigmatica = new Panaderia();
```

...y tiene muchos problemas para saber qué cliente llegó primero. Por ejemplo, si primero entran Carlos y luego Amalia...

```java
laParadigmatica.entrar(carlos);
laParadigmatica.entrar(amalia);
```

...quedan ambos en espera....

```java
laParadigmatica.enEspera();
// devuelve una colección con carlos y amalia
```

... y si atiende al primero (Carlos), en espera queda sólo Amalia....

```java
laParadigmatica.atender();
laParadigmatica.enEspera();
// devuelve una colección con sólo amalia
```

Pero si luego entra Magadalena, se pone al final de la fila y atiende primero a Amalia...

```java
laParadigmatica.entrar(magdalena);
laParadigmatica.atender();
laParadigmatica.enEspera();
// devuelve una colección con sólo magdalena
```

Esto es lo que se conoce como una _cola_: el primero que entra es el primero que sale (principio abreviado como [FIFO](https://es.wikipedia.org/wiki/First_in,_first_out), por sus siglas en inglés). La buena noticia es que Java cuenta con una interfaz de colección llamada `Queue` que tiene 2 mensajes principales:

* `offer` recibe un elemento y lo ingresa a la cola
* `poll` quita el primer elemento ingresado

> Ayudemos al tío Gustavo desarrollando la clase `Panaderia`. Asumí que ya existe una clase `Cliente`. 

