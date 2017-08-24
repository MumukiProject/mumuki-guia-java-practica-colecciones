Todos los meses cientos de personas visitan el Museo Manuel Belgrano, y si lo desean pueden identificarse con su [DNI](https://es.wikipedia.org/wiki/Documento_Nacional_de_Identidad_(Argentina)) y dejar sugerencias. Tras años de hacer esto a mano, el director nos pidió que construyamos un pequeño sistema que nos permita guardar esta información...

```java
LibroDeSugerencias libro = new LibroDeSugerencias();
libro.registrarSugerencia("33401...", "Me encantó el Museo!");
libro.registrarSugerencia("41110...", "Bart estuvo aquí");
libro.registrarSugerencia("29323...", "Agreguen más ilumincación, por favor");
libro.registrarSugerencia("41110...", "Bart estuvo aquí, de nuevo");

```

... y luego obtener, por un lado las sugerencias, y por el otro, la cantidad de DNIs únicos que lo visitaron:

```java
libro.sugerencias(); 
// devuelve ["Me encantó el Museo!", 
             "Bart estuvo aquí", 
             "Agreguen más ilumincación, por favor", 
             "Bart estuvo aquí, de nuevo"]
             
libro.cantidadDnisUnicos();
// devuelve 3

```

> Implementá el libro de sugerencias. 
