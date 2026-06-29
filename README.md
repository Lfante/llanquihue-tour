# LlanquihueTourApp - Semana 6

## Descripción

Este proyecto corresponde a la actividad de Semana 6 de Desarrollo Orientado a Objetos I.
El objetivo de esta semana es representar distintos servicios turísticos de Llanquihue Tour mediante una jerarquía de clases con herencia simple.

La solución define una clase base llamada `ServicioTuristico`, que contiene los atributos comunes de los servicios, y tres subclases que extienden su comportamiento: `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`.

## Objetivo de la semana

- Implementar una superclase con atributos comunes.
- Crear subclases con atributos específicos.
- Utilizar `super(...)` en los constructores de las subclases.
- Sobrescribir el método `toString()` para mostrar información completa.
- Crear objetos de prueba desde una clase gestora.
- Ejecutar el programa desde `Main` y mostrar los resultados por consola.

## Estructura del proyecto

```text
src/
├── model/
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
├── data/
│   └── GestorServicios.java
└── ui/
    └── Main.java
```

El proyecto mantiene otros archivos de semanas anteriores, pero para esta actividad los archivos principales son los relacionados con la jerarquía de servicios turísticos.

## Clases creadas

### ServicioTuristico
Clase base o superclase. Contiene los atributos comunes:

- `nombre`
- `duracionHoras`

### RutaGastronomica
Subclase que hereda de `ServicioTuristico`. Agrega el atributo:

- `numeroDeParadas`

### PaseoLacustre
Subclase que hereda de `ServicioTuristico`. Agrega el atributo:

- `tipoEmbarcacion`

### ExcursionCultural
Subclase que hereda de `ServicioTuristico`. Agrega el atributo:

- `lugarHistorico`

### GestorServicios
Clase ubicada en el paquete `data`. Crea al menos dos objetos de cada subclase para probar el funcionamiento de la jerarquía.

### Main
Clase principal ubicada en el paquete `ui`. Ejecuta el programa y muestra por consola los servicios creados.

## Instrucciones para ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que las clases estén dentro de los paquetes `model`, `data` y `ui`.
3. Ejecutar la clase:

```text
src/ui/Main.java
```

4. Revisar la consola. El programa debe mostrar dos rutas gastronómicas, dos paseos lacustres y dos excursiones culturales.

## Autor

Nicolás Núñez
