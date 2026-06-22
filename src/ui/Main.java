package ui;

import data.GestorDatos;
import model.Tour;
import service.CatalogoTours;

import java.util.ArrayList;

/**
 * Clase principal del sistema Llanquihue Tour.
 * Ejecuta la carga de datos, recorrido, búsqueda y filtrado por consola.
 */
public class Main {
    public static void main(String[] args) {
        String rutaArchivo = "resources/tours.txt";

        GestorDatos gestorDatos = new GestorDatos();
        ArrayList<Tour> toursCargados = gestorDatos.leerTours(rutaArchivo);

        CatalogoTours catalogoTours = new CatalogoTours(toursCargados);

        System.out.println("=== Sistema Llanquihue Tour - Semana 5 ===");
        System.out.println("Tours cargados desde archivo: " + catalogoTours.contarTours());
        System.out.println();

        imprimirListado("Catálogo completo de tours", catalogoTours.obtenerTodos());

        imprimirListado(
                "Tours filtrados por tipo: gastronómico",
                catalogoTours.filtrarPorTipo("gastronómico")
        );

        imprimirListado(
                "Búsqueda de tours que contienen la palabra 'Lago'",
                catalogoTours.buscarPorNombre("Lago")
        );

        imprimirListado(
                "Tours con precio máximo de $55.000 por persona",
                catalogoTours.filtrarPorPrecioMaximo(55000)
        );
    }

    /**
     * Imprime un listado de tours con un título descriptivo.
     *
     * @param titulo título de la sección.
     * @param tours lista de tours que se desea mostrar.
     */
    private static void imprimirListado(String titulo, ArrayList<Tour> tours) {
        System.out.println("=== " + titulo + " ===");

        if (tours.isEmpty()) {
            System.out.println("No se encontraron resultados.");
            System.out.println();
            return;
        }

        for (Tour tour : tours) {
            System.out.println(tour);
            System.out.println();
        }
    }
}
