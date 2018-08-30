Estamos tan ocupados resolviendo los ejercicios que no tenemos ganas de atender el télefono :telephone_receiver:.

Pero como no queremos quedar mal, vamos a tratar de decirle algo simpático a las personas que más queremos, según las siguientes reglas:

<table class="table table-bordered table-striped">
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Respuesta</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>"Martin"</td>
      <td>"Llamá más tarde"</td>
    </tr>
    <tr>
      <td>"Laura"</td>
      <td>"Ahora no puedo, te llamo después"</td>
    </tr>
    <tr>
      <td>"Lucas"</td>
      <td>"¡Shu!"</td>
    </tr>
    <tr>
      <td>Cualquier otra persona</td>
      <td>" "</td>
    </tr>
  </tbody>
</table>

> Implementá una clase `ContestadorAutomatico` y un método `responderA` que cumpla con dichas reglas: 
> 
> ```java
> ContestadorAutomatico contestador = new ContestadorAutomatico();
> contestador.responderA("Laura"); // devuelve "Ahora no puedo, te llamo después"
> contestador.responderA("Lucas"); // devuelve "¡Shu!"
> contestador.responderA("Gustavo"); // devuelve " " porque no definimos ningún mensaje para él
> ```
> 
