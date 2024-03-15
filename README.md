[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/mnkKwimk)

# Actividad: Desarrollo de Proyecto Software en Kotlin

**ID actividad:** 2324_PRO_u4u5u6_libre

**Agrupamiento de la actividad**: Individual

---

### Descripción:

La actividad consiste en el desarrollo de un proyecto software en Kotlin, permitiendo al estudiante elegir la temática.
Este proyecto debe demostrar la comprensión y aplicación de los conceptos de programación orientada a objetos (POO),
incluyendo la definición y uso de clases, herencia, interfaces, genericos, principios SOLID y el uso de librerías
externas.

**Objetivo:**

- Demostrar comprensión de los fundamentos de POO mediante la instanciación y uso de objetos.
- Aplicar conceptos avanzados de POO como herencia, clases abstractas, e interfaces.
- Crear y usar clases que hagan uso de genéricos.
- Aplicar principios SOLID.
- Integrar y utilizar librerías de clases externas para extender la funcionalidad del proyecto.
- Documentar y presentar el código de manera clara y comprensible.

**Trabajo a realizar:**

1. **Selección de la Temática:** Elige un tema de tu interés que pueda ser abordado mediante una aplicación software.
   Esto podría ser desde una aplicación de gestión para una pequeña empresa, una herramienta para ayudar en la
   educación, hasta un juego simple. Define claramente el problema que tu aplicación pretende resolver.

2. **Planificación:** Documenta brevemente cómo tu aplicación solucionará el problema seleccionado, incluyendo las
   funcionalidades principales que desarrollarás.

3. **Desarrollo:**
    - **Instancia de Objetos:** Tu aplicación debe crear y utilizar objetos, demostrando tu comprensión de la
      instanciación y el uso de constructores, métodos, y propiedades.
    - **Métodos Estáticos:** Define y utiliza al menos un método estático, explicando por qué es necesario en tu
      aplicación.
    - **Uso de IDE:** Desarrolla tu proyecto utilizando un IDE, aprovechando sus herramientas para escribir, compilar, y
      probar tu código.
    - **Definición de Clases:** Crea clases personalizadas con sus respectivas propiedades, métodos, y constructores.
    - **Clases con genéricos:** Define y utiliza al menos una clase que haga uso de genéricos en tu aplicación.
    - **Herencia y Polimorfismo:** Implementa herencia y/o interfaces en tu proyecto para demostrar la reutilización de
      código y la flexibilidad de tu diseño.  **Usa los principios SOLID:** Ten presente durante el desarrollo los
      principios SOLID y úsalos durante el diseño para mejorar tu aplicación.
    - **Librerías de Clases:** Integra y utiliza una o más librerías externas que enriquezcan la funcionalidad de tu
      aplicación.
    - **Documentación:** Comenta tu código de manera efectiva, facilitando su comprensión y mantenimiento.

4. **Prueba y Depuración:** Realiza pruebas para asegurarte de que tu aplicación funciona como se espera y depura
   cualquier error encontrado.
5. **Contesta a las preguntas** ver el punto **Preguntas para la Evaluación**

### Recursos

- Apuntes dados en clase sobre programación orientada a objetos, Kotlin, uso de IDEs, y manejo de librerías.
- Recursos vistos en clase, incluyendo ejemplos de código, documentación de Kotlin, y guías de uso de librerías.

### Evaluación y calificación

**RA y CE evaluados**: Resultados de Aprendizaje 2, 4, 6, 7 y Criterios de Evaluación asociados.

**Conlleva presentación**: SI

**Rubrica**: Mas adelante se mostrará la rubrica.

### Entrega

> **La entrega tiene que cumplir las condiciones de entrega para poder ser calificada. En caso de no cumplirlas podría
calificarse como no entregada.**
>

- **Conlleva la entrega de URL a repositorio:** El contenido se entregará en un repositorio GitHub.
- **Respuestas a las preguntas:** Deben contestarse en este fichero, README.md

# Preguntas para la Evaluación

Este conjunto de preguntas está diseñado para ayudarte a reflexionar sobre cómo has aplicado los criterios de evaluación
en tu proyecto. Al responderlas, **asegúrate de hacer referencia y enlazar al código relevante** en tu `README.md`,
facilitando así la evaluación de tu trabajo.

#### **Criterio global 1: Instancia objetos y hacer uso de ellos**

- **(2.a, 2.b, 2.c, 2.d, 2.f, 2.h, 4.f, 4.a)**: Describe cómo has instanciado y utilizado objetos en tu proyecto. ¿Cómo
  has aplicado los constructores y pasado parámetros a los métodos? Proporciona ejemplos específicos de tu código.

> El proyecto en general está pensado para que mantengamos un cierto número de plantas, de distinto tipo y podamos ir
> adquiriendo más.
> De momento se ha creado una clase padre Planta, con la información genérica que queremos saber de la planta y se ha
> instanciado la clase 'Suculentas'.
> También se ha comenzado a desarrollar la clase Vivero, que es donde iríamos acumulando nuestras plantas.

-

#### **Criterio global 2: Crear y llamar métodos estáticos**

- **(4.i)**: ¿Has definido algún método/propiedad estático en tu proyecto? ¿Cuál era el objetivo y por qué consideraste
  que debía ser estático en lugar de un método/propiedad de instancia?
- **(2.e)**: ¿En qué parte del código se llama a un método estático o se utiliza la propiedad estática?

> En la interfaz RealizarCuidados, se define un objeto compañero con métodos estáticos regar, abonar, transplantar y
> podar. Estos métodos estáticos operan sobre una instancia de la clase Planta, permitiendo realizar acciones de cuidado
> específicas sin necesidad de crear una instancia de la interfaz.

#### **Criterio global 3: Uso de entornos**

- **(2.i)**: ¿Cómo utilizaste el IDE para el desarrollo de tu proyecto? Describe el proceso de creación, compilación, y
  prueba de tu programa.

> Es un proyecto que sigue en construcción. Se ha creado con ItelliJIdea. El comienzo se ha hecho de una manera un poco
> más rudimentaria y manual, recreando algunos esquemas básicos de ideas generales para poder plasmar el esqueleto del
> proyecto e ir trabajando poco a poco conforme se vaya ramificando.

#### **Criterio global 4: Definir clases y su contenido**

- **(4.b, 4.c, 4.d, 4.g)**: Explica sobre un ejemplo de tu código, cómo definiste las clases en tu proyecto, es decir
  como identificaste las de propiedades, métodos y constructores y modificadores del control de acceso a métodos y
  propiedades, para representar al objeto del mundo real. ¿Cómo contribuyen estas clases a la solución del problema que
  tu aplicación aborda?
>En el proyecto, tenemos una clase principal llamada Planta, que es como un modelo genérico para cualquier tipo de
  planta. Esta clase tiene características comunes que todas las plantas comparten, como su nombre, tipo, nivel de
  humedad y estado de salud. También tiene métodos para realizar tareas de cuidado, como regar, abonar, transplantar y
  podar.
    Luego, tenemos una clase llamada Suculenta, que es un tipo específico de planta. Como las suculentas tienen sus propias
    características únicas, como la especie y la fecha del último trasplante, esta clase hereda de la clase Planta y agrega
    estas nuevas propiedades específicas.
    Además, tenemos algunas clases enumeradas que representan diferentes atributos de las plantas, como su altura, estado de
    crecimiento y especies de suculentas. Estas clases nos permiten definir conjuntos predefinidos de valores para estos
    atributos.
    Finalmente, tenemos una interfaz llamada RealizarCuidados, que define métodos para acciones de cuidado de plantas, como
    regar, abonar, transplantar y podar. Las clases concretas, como Planta y Suculenta, implementan esta interfaz para
    proporcionar funcionalidades específicas de cuidado de plantas.
    En resumen, todas estas clases y la interfaz trabajan juntas para representar y cuidar diferentes tipos de plantas en
    nuestro proyecto, lo que nos permite organizar y manejar fácilmente la información relacionada con el cuidado de las
    plantas de manera estructurada y coherente.

#### **Criterio global 5: Herencia y uso de clases abstractas e interfaces**

- **(4.h, 4.j, 7.a, 7.b, 7.c)**: Describe sobre tu código cómo has implementado la herencia o utilizado interfaces en tu
  proyecto. ¿Por qué elegiste este enfoque y cómo beneficia a la estructura de tu aplicación? ¿De qué manera has
  utilizado los principios SOLID para mejorar el diseño de tu proyecto? ¿Mostrando tu código, contesta a qué principios
  has utilizado y qué beneficio has obtenido?
> He usado la herencia para definir la clase Planta como clase padre, de la que derivarían otras, como 'Suculentas' que heredan tanto
    propiedades como métodos comunes. El enfoque del proyecto en sí es perfecto para las herencias ya que las propias plantas son
>   clases que naturalemente heredan de otras clases.
>   La interfaz de RealizarCuidados son funciones básicas que pueden realizar todo tipo de plantas, aun que según su mismo tipo
> variará o tendrá condicionantes cuánto se riege, abone etc...por lo que al ser una interfaz podemos usarlo en cualquier subclase sin necesidad de repetir excesivo código.

> Aun que aún estoy trabajando en el proyecto al completo, creo que seguir los principios SOLID no es sólo cuestión de buenas prácticas,
> sino que teniendo un código claro y fácil de modificar sin que ello interfiera en el resto del código es cómodo, tanto para nosotros
> como para entender el código de otros programadores o para que otros programadores puedan incorporarse de forma práctica a nuestro código.
#### **Criterio global 6: Diseño de jerarquía de clases**

- **(7.d, 7.e, 7.f, 7.g)**: Presenta la jerarquía de clases que diseñaste. ¿Cómo probaste y depuraste esta jerarquía
  para asegurar su correcto funcionamiento? ¿Qué tipo de herencia has utilizado: Especificación, Especialización,
  Extensión, Construcción?

#### **Criterio global 7: Librerías de clases**

- **(2.g, 4.k)**: Describe cualquier librería externa que hayas incorporado en tu proyecto. Explica cómo y por qué las
  elegiste, y cómo las incorporaste en tu proyecto. ¿Cómo extendió la funcionalidad de tu aplicación? Proporciona
  ejemplos específicos de su uso en tu proyecto.

#### **Criterio global 8: Documentado**

- **(7.h)**: Muestra ejemplos de cómo has documentado y comentado tu código. ¿Que herramientas has utilizado? ¿Cómo
  aseguras que tu documentación aporte valor para la comprensión, mantenimiento y depuración del código?

#### **Criterio global 9: Genéricos**

- **(6.f)**: Muestra ejemplos de tu código sobre cómo has implementado una clase con genéricos. ¿Qué beneficio has
  obtenido?

