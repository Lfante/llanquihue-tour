package data;

import model.OperadorTuristico;
import model.Tour;
import model.Ubicacion;
import util.ValidadorDatos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * Clase responsable de leer datos desde archivos externos y convertirlos en objetos Tour.
 */
public class GestorDatos {
    private ValidadorDatos validador;

    /**
     * Constructor sin parámetros.
     */
    public GestorDatos() {
        this.validador = new ValidadorDatos();
    }

    /**
     * Lee un archivo .txt y crea objetos Tour a partir de sus líneas.
     * Formato esperado:
     * nombre;tipo;duracionHoras;precioPorPersona;ciudad;sector;operador;telefonoOperador
     *
     * @param rutaArchivo ruta del archivo de datos.
     * @return lista de tours cargados desde el archivo.
     */
    public ArrayList<Tour> leerTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();
        Path ruta = Path.of(rutaArchivo);

        try {
            ArrayList<String> lineas = new ArrayList<>(Files.readAllLines(ruta, StandardCharsets.UTF_8));

            for (String linea : lineas) {
                if (linea == null || linea.isBlank()) {
                    continue;
                }

                Tour tour = crearTourDesdeLinea(linea);

                if (tour != null) {
                    tours.add(tour);
                }
            }
        } catch (IOException error) {
            System.out.println("No se pudo leer el archivo: " + error.getMessage());
        } catch (Exception error) {
            System.out.println("Ocurrió un error inesperado al cargar los datos: " + error.getMessage());
        }

        return tours;
    }

    /**
     * Convierte una línea del archivo en un objeto Tour.
     *
     * @param linea línea leída desde el archivo.
     * @return Tour creado o null si la línea no tiene el formato esperado.
     */
    private Tour crearTourDesdeLinea(String linea) {
        String[] datos = linea.split(";");

        if (datos.length != 8) {
            System.out.println("Línea ignorada por formato incorrecto: " + linea);
            return null;
        }

        String nombre = validador.limpiarTexto(datos[0], "Sin nombre");
        String tipo = validador.limpiarTexto(datos[1], "Sin tipo");
        int duracionHoras = validador.convertirEnteroPositivo(datos[2], 0, "duración");
        double precioPorPersona = validador.convertirDoublePositivo(datos[3], 0.0, "precio");
        String ciudad = validador.limpiarTexto(datos[4], "Sin ciudad");
        String sector = validador.limpiarTexto(datos[5], "Sin sector");
        String nombreOperador = validador.limpiarTexto(datos[6], "Sin operador");
        String telefonoOperador = validador.limpiarTexto(datos[7], "Sin teléfono");

        Ubicacion ubicacion = new Ubicacion(ciudad, sector);
        OperadorTuristico operador = new OperadorTuristico(nombreOperador, telefonoOperador);

        return new Tour(nombre, tipo, duracionHoras, precioPorPersona, ubicacion, operador);
    }
}
