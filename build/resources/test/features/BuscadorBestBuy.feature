Feature: Reto de semillero
  Yo como usuario quiero ingresar en la barra buscadora 5 items diferentes

  Scenario: Ingresar a la barra buscadora desde la pagina principal el item a buscar
    Given El usuario se encuentra en la pagina principal de BestBuy
    When Ingresa en la barra de busqueda el item a buscar da click en el boton de buscar
    Then Se debe redirigir a la pantalla donde salen los resultados del item buscado y selecionar el item