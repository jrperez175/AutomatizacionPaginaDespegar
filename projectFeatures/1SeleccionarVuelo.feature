#Author: jrperez@bancolombia.com.co
Feature: Seleccionar el vuelo mas barato Medellin-Cartagena de una lista de 7 posibles.
  Yo como usuario recurrente de la pagina despegar
  Quiero poder buscar el vuelo mas barato de la ruta MEdellin-Cartagena de una lista de 7 posibles
  Para comprarlo.

  @Busqueda_Exitosa
  Scenario Outline: Busqueda Exitosa Parametrizado
    Given Dado que el usuario esta en la opcion de busqueda de la pagina Despegar
    When el usuario haga click en el opcion vuelo
    And el usuario haga click en el opcion ida y regreso
    And el usuario ingresa la ciudad origen <origen>
    And el usuario ingresa la ciudad destino <destino>
    And el usuario ingresa la fecha de inicio YYYY <yyyy_ini> MM <mm_ini> DD <dd_ini>
    And el usuario ingresa la fecha final YYYY <yyyy_fin> MM <mm_fin> DD <dd_fin> <mm_ini>
    And el usuario ingresa el numero de personas a viajar <nro_pers_adultas> <nro_pers_ninos>
    And el usuario haga click en el boton enviar
    Then al usuario se le presentan la lista de los vuelos
    And el usuario ordena los vuelos <ordenar>
    And el usuario almacena los registros en excel <ruta_archivo>
    And el sistema resalta en color el vuelo mas economico

    Examples: 
      | origen   | destino   | yyyy_ini | mm_ini | dd_ini | yyyy_fin | mm_fin | dd_fin | nro_pers_adultas | nro_pers_ninos | ordenar | ruta_archivo                              |
      | Medellin | Cartagena |     2018 |     09 |     01 |     2018 |     09 |     29 |                2 |              0 | Salida  | D:\\ResultadosBusquedaVuelosDespegar.xlsx |

  @Busqueda_FechasEnblanco
  Scenario Outline: Fechas en Blanco
    Given Dado que el usuario esta en la opcion de busqueda de la pagina Despegar
    When el usuario haga click en el opcion vuelo
    And el usuario haga click en el opcion ida y regreso
    And el usuario ingresa la ciudad origen <origen>
    And el usuario ingresa la ciudad destino <destino>
    And el usuario haga click en el boton enviar
    Then el sistema presenta mensaje Ingresa una fecha de partida

    Examples: 
      | origen   | destino |
      | Medellin | Bogota  |

  @Busqueda_CiudadOrigenDestinoIguales
  Scenario Outline: Ciudad Origen y Destino iguales
    Given Dado que el usuario esta en la opcion de busqueda de la pagina Despegar
    When el usuario haga click en el opcion vuelo
    And el usuario haga click en el opcion ida y regreso
    And el usuario ingresa la ciudad origen <origen>
    And el usuario ingresa la ciudad destino <destino>
    And el usuario haga click en el boton enviar
    Then el sistema presenta mensaje El destino debe ser diferente del origen

    Examples: 
      | origen   | destino  |
      | Medellin | Medellin |
