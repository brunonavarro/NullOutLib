# NullOut -> Una biblioteca Kotlin para minimizar los nulos en el desarrollo de software

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![](https://jitpack.io/v/brunonavarro/NullOutLib.svg)](https://jitpack.io/#brunonavarro/NullOutLib)
![GitHub all releases](https://img.shields.io/github/downloads/brunonavarro/NullOutLib/total)
![GitHub release (by tag)](https://img.shields.io/github/downloads/brunonavarro/NullOutLib/1.0.0-beta1/total)


[![issues](https://img.shields.io/github/issues/brunonavarro/NullOutLib?style=for-the-badge)](https://github.com/brunonavarro/NullOutLib/issues)
[![pull requests](https://img.shields.io/github/issues-pr/brunonavarro/NullOutLib?style=for-the-badge)](https://github.com/brunonavarro/NullOutLib/pulls)
[![contributors](https://img.shields.io/github/contributors/brunonavarro/NullOutLib?style=for-the-badge)](https://github.com/brunonavarro/NullOutLib/graphs/contributors)

## :loudspeaker: **¡Nos encantaría conocer tu opinión! Proporciona feedback [Aquí](https://github.com/brunonavarro/NullOutLib/issues/new?assignees=brunonavarro&labels=feedback&projects=&template=feedback-libreria-NullOutLib.md&title=%5BFEEDBACK%5D)** :loudspeaker:

### Accede a la documentacion en Español: [Guia de Inicio Rapido](https://github.com/brunonavarro/NullOutLib/blob/master/docs/es/README-es.md)

### Access the documentation in English: [Quick Start Guide](https://github.com/brunonavarro/NullOutLib/blob/master/docs/en/README-en.md)

---

![image](https://github.com/user-attachments/assets/a7073f08-d4f5-4efa-b078-a5acc2c2309e) ![image](https://github.com/user-attachments/assets/a731ac2d-f9c9-42d1-b422-182549e12eda)







### Objetivos:

* Reducir el uso del operador ‘?’ en Kotlin, en situaciones donde no se amerita.
* Reducir la cantidad de condiciones por linea de codigo, causados por el operador ‘?’, en situaciones donde aun sabiendo que el campo no es nulo, por declaracion de variables me obliga controlar nulos con el operador.
* Aumentar la cobertura de codigo en sonarQube.
* Evitar los nulls object y culturizar el principio de cohesion y de minimos nulos o  cero nulos

## Princio de minimos Nulos (PMN) 

### El problema con los nulls:

(Contieri, 2020) menciona que Null es un flag el cual representa diferentes situaciones según el contexto en que se utiliza e invoca.
Esto provoca el error mas grave en desarrollo de software el cual es acoplar una decision oculta en el contrato entre un objeto y quien lo utiliza. 
Un buen principio de software nos reta a tener alta cohesion. Es decir, que los objetos sean lo mas especificos posibles y tengan una unica responsabilidad. Siendo Null el objeto con la menor cohesion en cualquier sistema.

### Cohesion o Biyección:

(Contieri, El único principio de diseño de software importante. , 2020) Menciona que ser minimalista y ser axiomatico implica que podamos derivar un conjunto de reglas a partir de una unica definicion.
Cada objeto del dominio debe estar representado por un unico objeto en nuestro modelo computable y viceversa.

![image](https://github.com/user-attachments/assets/1ef7efc5-6ee6-49a2-a906-e942ab0d0708)


### El problema de los Nulls en proyectos de software:

Anteriormente se comprende el problema que genera el uso de nulos en la capa de modelo o incluso en dominio, ya que el uso de null ocasiona una dependencia casi incorregible a todas las capas superiores de la arquitectura del software. Esta claro que deberia desarrollarse software eliminando la posibilidad de nulls por completo desde la capa de modelado de entidades, y llendo mas lejos teniendo clara la estructura de datos y la obligatoriedad de los mismos. 
Ahora si bien el problema inicia desde el modelado de datos, el mismo termina en afectar la calidad, legibilidad, compresion y escalabilidad del codigo fuente. Por tanto es considerado un Principio no negociable el expulsar del diseño de software la posibilidad de admitir nulos dentro del modelado principalmente, pero al mismo tiempo evitarlo durante todo el ciclo de vida del desarrollo de software, de principio a fin e incluso durante la mejora continua. 
Si bien el problema ya es grave, y practicamente es obligatorio evitar el uso de nulos desde el inicio de un proyecto de software, imaginar y observar el problema desde el punto de vista de un proyecto en producción, es seriamente complejo. Cuya unica solucion pensable es acudir a la refactorización. Sin embargo muchas veces la refactorización implica ser realizada desde la estructura de datos y la obligatoriedad de los mismos desde la fuente como base de datos. 

### Problemas de Modelar con Nulls en Kotlin:

En kotlin tanto con la mayoria de lenguajes de programacion que admiten Nulls, se puede observar y replicar el problema mencionado anteriormente, sin embargo Kotlin al ser un lenguaje que ofrece una solucion robusta para el control de posibles excepciones como las NullPointerException permite codificar y reemplazar los famosos try catch de Java por los operadores ternarios “?” y “?:” permitiendo controlar los nulls desde una misma linea de codigo. Sin embargo, dentro de las buenas practicas del desarrollo de software existe el analisis de codigo estatico y la cobertura de pruebas unitarias, Siendo la herramienta SonarQube una de las mas utilizadas para ese proposito; La cual dentro de sus reglas de analisis interpreta de kotlin los operadores ternarios “?” y “?:” como ramas de condición, situacion que si la combinamos con el problema de admitir Nulls dentro del modelado, llegamos a un punto donde SonarQube nos va a exigir realizar pruebas unitarias para casos nulos que no corresponden al caso de uso, por ejemplo:


 > _**Tenemos el caso de uso**: “un usuario que es empleado debe organizar los productos de una tienda en un orden por categoria y derivados del producto.” Si modelamos todos los objetos admitiendo nulos tendriamos 6 objetos asumiendo la siguiente jerarquia:_
  * _Tienda_
      * _getCategorias()_
      * _getDerivados()_
    * _Usuario_
      * _Empleado_
        * _organizarProducto(producto, categoria, derivados)_
    * _Categorias_
    * _Derivados_
    * _Producto_
        * _asignarCategoria(categoria)_
        * _asignarDerivados(derivados)_
      * _Derivados_
      * _Categoria_
  
  > _Entonces a nivel de codigo podriamos tener una situacion asi:_

  ![image](https://github.com/user-attachments/assets/7889b4b1-eec5-406b-a9f0-1beda117f772)

  > _Luego de usar la librería NullOut, obtenemos el siguiente resultado:_

  ![image](https://github.com/user-attachments/assets/8cc54e3d-0728-41ad-aa5f-5fbbca73d3c7)

  > Aun sabiendo que para organizar un producto unicamente es necesario validar que el empleado no sea nulo, Kotlin nos fuerza a validar que usuario tampoco sea nulo. Y por ende SonarQube luego nos pedira cubrir esas casuisticas con pruebas unitarias. 

# NullOut como alternativa a un refactor escalonado.
NullOut es una librería de software que brinda como solucion una alternativa para eliminar los nulos en proyectos que se encuentran en produccion y en los cuales la opcion de eliminar los nulls desde la raiz, es decir desde la capa de Modelo, es mas tedioso y requiere alto consumo de recurso de mano de obra o dependencia con otros equipos. NullOut está enfocado en eliminar las ramas condicionales ocaciondas por el operador ternario “?” en Kotlin, dentro del analisis de cobertura de la herramienta SonarQube. 
