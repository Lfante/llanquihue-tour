package data;

import model.Tour;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * Clase encargada de leer los datos desde un archivo de texto y transformarlos en objetos Tour.
 */
public class GestorDatos {

    /**
     * Lee un archivo .txt línea por línea, separa los campos por punto y coma y crea una lista de tours.
     * El formato esperado por línea es: nombre;tipo;duracionHoras;precioPorPersona
     *
     * @param rutaArchivo ruta del archivo tours.txt.
     * @return ArrayList con los tours creados desde el archivo.
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

                // Cada línea se separa usando punto y coma (;), tal como pide la actividad.
                String[] datos = linea.split(";");

                if (datos.length == 4) {
                    String nombre = datos[0];
                    String tipo = datos[1];
                    int duracionHoras = Integer.parseInt(datos[2]);
                    double precioPorPersona = Double.parseDouble(datos[3]);

                    Tour tour = new Tour(nombre, tipo, duracionHoras, precioPorPersona);
                    tours.add(tour);
                }
            }
        } catch (IOException error) {
            System.out.println("No se pudo leer el archivo: " + error.getMessage());
        } catch (NumberFormatException error) {
            System.out.println("Existe un dato numérico con formato incorrecto: " + error.getMessage());
        }

        return tours;
    }

    /**
     * Filtra los tours según su tipo.
     *
     * @param tours lista original de tours.
     * @param tipoBuscado tipo de tour que se desea buscar.
     * @return lista de tours que coinciden con el tipo solicitado.
     */
    public ArrayList<Tour> filtrarPorTipo(ArrayList<Tour> tours, String tipoBuscado) {
        ArrayList<Tour> toursFiltrados = new ArrayList<>();

        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase(tipoBuscado)) {
                toursFiltrados.add(tour);
            }
        }

        return toursFiltrados;
    }

    /**
     * Busca tours cuyo nombre contenga el texto ingresado.
     *
     * @param tours lista original de tours.
     * @param textoBuscado texto que se quiere buscar dentro del nombre del tour.
     * @return lista de tours cuyo nombre contiene el texto buscado.
     */
    public ArrayList<Tour> buscarPorNombre(ArrayList<Tour> tours, String textoBuscado) {
        ArrayList<Tour> resultados = new ArrayList<>();

        for (Tour tour : tours) {
            if (tour.getNombre().toLowerCase().contains(textoBuscado.toLowerCase())) {
                resultados.add(tour);
            }
        }

        return resultados;
    }
}
