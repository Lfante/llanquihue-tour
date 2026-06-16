# LlanquihueTourApp

## Descripción

Este proyecto corresponde a la actividad de Semana 4 de Desarrollo Orientado a Objetos I.  
El objetivo es leer datos de tours desde un archivo `tours.txt`, crear objetos de la clase `Tour`, almacenarlos en un `ArrayList` y aplicar operaciones básicas de recorrido, búsqueda y filtrado.

## Estructura del proyecto

```text
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   └── Tour.java
│   ├── data/
│   │   └── GestorDatos.java
│   └── ui/
│       └── Main.java
├── resources/
│   └── tours.txt
├── README.md
└── .gitignore
```

## Clases implementadas

- `Tour`: representa un tour ofrecido por Llanquihue Tour. Incluye nombre, tipo, duración y precio por persona.
- `GestorDatos`: lee el archivo `tours.txt`, separa los datos con `split(";")`, crea objetos `Tour` y los almacena en un `ArrayList`.
- `Main`: ejecuta el programa, muestra todos los tours, filtra por tipo y realiza una búsqueda por nombre.

## Formato del archivo tours.txt

Cada línea del archivo debe tener los datos separados por punto y coma:

```text
nombre;tipo;duracionHoras;precioPorPersona
```

Ejemplo:

```text
Ruta Gastronómica Puerto Varas;gastronómico;4;45000
```

## Instrucciones para ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que la carpeta `resources` contenga el archivo `tours.txt`.
3. Ejecutar la clase `Main`, ubicada en `src/ui/Main.java`.
4. Revisar la salida por consola, donde se muestran:
   - todos los tours cargados desde el archivo;
   - tours filtrados por tipo gastronómico;
   - búsqueda de tours que contienen la palabra "Lago".

## Autor

Nicolás Núñez
