#Author: jrperez@bancolombia.com.co
@tag1
Feature: Seleccionar el vuelo mas barato Medellin-Cartagena de una lista de 7 posibles.
  Yo como usuario recurrente de la pagina despegar
  Quiero poder buscar el vuelo mas barato de la ruta MEdellin-Cartagena de una lista de 7 posibles
  Para comprarlo.

  Scenario Outline: Busqueda Exitosa Parametrizado
    Given Dado que el usuario esta en la opcion de busqueda de la pagina Despegar
    When el usuario haga click en el opcion vuelo
    And el usuario haga click en el opcion ida y vuelta
    And el usuario ingrese la ciudad origen <origen>
    And el usuario ingrese la ciudad destino <destino>
    And el usuario ingrese la fecha de inicio
    And el usuario ingrese la fecha final
    #And el usuario ingrese el numero de personas a viajar
    #And el usuario haga click en el boton enviar
    #Then el usuario se le presenta las lista de los vuelos seleccionados

    Examples: 
      | origen   | destino   | 
      | Medellin | Cartagena | 
