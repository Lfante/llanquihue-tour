# LlanquihueTourApp - Semana 5

## Descripción

Este proyecto corresponde a la actividad de Semana 5 de Desarrollo Orientado a Objetos I.

El sistema representa una base de gestión para la agencia de turismo **Llanquihue Tour**. La aplicación lee datos desde el archivo `tours.txt`, crea objetos de tipo `Tour`, los almacena en una colección dinámica y permite realizar operaciones básicas como recorrido, búsqueda y filtrado.

En esta versión se mejora el proyecto anterior incorporando una estructura más modular, composición entre clases, validaciones básicas con `try-catch` y una librería personalizada para administrar el catálogo de tours.

## Estructura del proyecto

```text
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   ├── Tour.java
│   │   ├── Ubicacion.java
│   │   └── OperadorTuristico.java
│   ├── data/
│   │   └── GestorDatos.java
│   ├── service/
│   │   └── CatalogoTours.java
│   ├── util/
│   │   └── ValidadorDatos.java
│   └── ui/
│       └── Main.java
├── resources/
│   └── tours.txt
├── README.md
└── .gitignore
```

## Paquetes utilizados

- `model`: contiene las clases principales del dominio.
- `data`: contiene la clase encargada de leer archivos externos.
- `service`: contiene la librería personalizada para administrar el catálogo de tours.
- `util`: contiene utilidades de validación y conversión de datos.
- `ui`: contiene la clase principal `Main`, desde donde se ejecuta el sistema.

## Clases implementadas

- `Tour`: representa un tour ofrecido por Llanquihue Tour.
- `Ubicacion`: representa la ubicación del tour. Se usa como composición dentro de `Tour`.
- `OperadorTuristico`: representa al operador responsable del tour. También se usa como composición dentro de `Tour`.
- `GestorDatos`: lee el archivo `tours.txt`, separa los campos con `split(";")` y crea objetos `Tour`.
- `CatalogoTours`: librería personalizada que encapsula un `ArrayList<Tour>` y ofrece métodos para agregar, listar, buscar y filtrar tours.
- `ValidadorDatos`: clase utilitaria que aplica validaciones simples con `try-catch`.
- `Main`: ejecuta la carga de datos, muestra todos los registros y aplica filtros por consola.

## Formato del archivo tours.txt

Cada línea debe tener 8 campos separados por punto y coma:

```text
nombre;tipo;duracionHoras;precioPorPersona;ciudad;sector;operador;telefonoOperador
```

Ejemplo:

```text
Ruta Gastronómica Puerto Varas;gastronómico;4;45000;Puerto Varas;Centro;Operador Sabores del Lago;+56 9 1111 2222
```

## Instrucciones para ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Confirmar que el archivo `tours.txt` esté ubicado en la carpeta `resources`.
3. Ejecutar la clase `Main`, ubicada en:

```text
src/ui/Main.java
```

4. Revisar la salida por consola. El sistema mostrará:
   - catálogo completo de tours;
   - tours filtrados por tipo gastronómico;
   - búsqueda de tours que contienen la palabra "Lago";
   - tours con precio máximo de $55.000 por persona.

## Autor

Nicolás Núñez
