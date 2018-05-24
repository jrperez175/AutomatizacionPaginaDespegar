# Automatizacion Vuelos en la Pagina DESPEGAR.COM

Buscar los 10 precios más baratos de tiquetes en el siguiente enlace: https://www.despegar.com.co/  
Origen: Medellín  
Destino: Cartagena  
Viajeros: dos personas  
Fecha Inicio: 01/09/2018  
Fecha Regreso: 29/09/2018  
Guardar en Excel los 7 precios más baratos de la primera página del sitio.  
Marcar en verde el precio más económico.  



## Tabla de Contenido

- [Resumen de codificación](#resumen-de-la-codificacion)
- [Framework](#framework) 
- [Compilador](#compilador)  
- [Patrones desarrollo](#patrones-desarrollo)   
- [Prácticas de automatización](#practicas-de-automatizacion)   
- [Herramienta de automatización utilizadas](#herramientas-de-automatizacion-utilizadas)   
- [Estrategia de automatización](#estrategia-de-automatizacion)  
- [Navegador y version](#navegador-y-version)
- [Repositorio](#repositorio)  


---

## Resumen de la Codificacion

![imagen](http://img.fenixzone.net/i/AqosyPb.png)

Se creo el projecto (AutomatizacionVueloPaginaDespegar) con la siguiente estructura:  

*Carpeta:src/main/java* : Contiene los siguiente   
- Paquete principal **co.com.bancolombia.certificacion.despegartest**: Contiene lo siguiente:  
**1.co.com.bancolombia.certificacion.despegartest.configuration** = Contiene la clase ShareDriver.java que instancia el navegador.  
**2. co.com.bancolombia.certificacion.despegartest.pages ** = Contiene las clases  
	-HomePage.java (Ingreso a la URl)  
	-SearchPage.java (Ideinficacion de elementos web y acciones)      
**3.co.com.bancolombia.certificacion.despegartest.runners** = Contiene la clase TestRunner.java la cual inicia la ejecucion de la automatizacion.  
**4.co.com.bancolombia.certificacion.despegartest.stepDefinitions** = Contiene la clases  
SearchSteps.java (Definicion de pasos de la busqueda)  
StartSteps.java (Pasos del ingreso a la URL)  
**5.co.com.bancolombia.certificacion.despegartest.util** = Contine la clase TrabajarConExcel.java para manipular archivos de excel.



*Carpeta:projectFeatures*
![feature](http://img.fenixzone.net/i/KbZ735O.png)  

Contine el feature **1SeleccionarVuelo.feature** el cual define la historia de usuario con escenarios positivos y negativos , cada uno cson sus respectivos parametros.



## Framework

Selenium


---

## Compilador

JAVA

---
## Patrones desarrollo
Page Object:Permite separar el comportamiento de una pagina de los detalles de su implementación, es simplemente una clase que encapsula los detalles de implementación de una pagina web, permitiendo que la automatización se centre solamente en el comportamiento



## Practicas de automatizacion

    

---
## Herramientas de automatizacion utilizadas
* [Cucumber-JVM](https://github.com/cucumber/cucumber-jvm) - Cucumber es una herramienta para hacer pruebas de aceptación de usuario (mediante enfoque BDD -Behaviour Driven Development-).
 * [Selenium](http://docs.seleniumhq.org/) - Selenium es un entorno de pruebas de software para aplicaciones basadas en la web.
 * [Gradle](https://gradle.org/) - Gradle es un sistema de automatización de construcción de código abierto.
 * [Eclipse](https://eclipse.org/ide/) - IDE Ambiente de desarrollo integrado para JAVA y otras.
 * [Gherkin](https://github.com/cucumber/cucumber/wiki/Gherkin) - Gherkin es un lenguaje comprensible por humanos y por ordenadores, con el que vamos a describir las funcionalidades, definiendo el comportamiento del software, sin entrar en su implementación
 * [JUnit](http://junit.org/) - Es un framework que nos permite realizar pruebas unitarias de nuestro codigo de manera controlada para verificar que todo este funcionando correctamente.
   
      
---
## Estrategia de automatizacion

- Entender  los requerimientos solicitados en el pdf enviado.  
- Identificar aspectos donde se tenia conocimiento y en cuales me debia documentar.  
- Navegar por la pagina para comprender como funcionaba el proceso de compra de un tiquete y determinar con cuales elementos se interactuaban.  
- Definir las herramientas necesarias para la implementación del reto.  
- Identificar paquetes, clase y métodos necesarios y construirlos.

---
## Navegador y version
ChromeDriver 2.36.540470

---
## Repositorio  
[Repositorio en Git](https://github.com/jrperez175/AutomatizacionPaginaDespegar.git)

---
## Conclusiones  

- Se cumplieron los objetivos planteados en el reto.  
- Gran oportunidad para seguir afianzando los conocimientos y destrezas en todo el tema de automatización.  
- Excelente página con temas muy versátiles y diferentes que nos retaban a conocer con más detalle cada uno de los temas necesarios para sacar adelante el reto.

