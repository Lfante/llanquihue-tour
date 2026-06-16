package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 * Clase principal para ejecutar el sistema de lectura y filtrado de tours.
 */
public class Main {
    public static void main(String[] args) {
        GestorDatos gestorDatos = new GestorDatos();

        // El archivo tours.txt está ubicado en la carpeta resources del proyecto.
        String rutaArchivo = "resources/tours.txt";
        ArrayList<Tour> tours = gestorDatos.leerTours(rutaArchivo);

        System.out.println("=== Catálogo completo de tours ===");
        for (Tour tour : tours) {
            System.out.println(tour);
            System.out.println();
        }

        System.out.println("=== Tours filtrados por tipo: gastronómico ===");
        ArrayList<Tour> toursGastronomicos = gestorDatos.filtrarPorTipo(tours, "gastronómico");
        for (Tour tour : toursGastronomicos) {
            System.out.println(tour);
            System.out.println();
        }

        System.out.println("=== Búsqueda de tours que contienen la palabra 'Lago' ===");
        ArrayList<Tour> toursConLago = gestorDatos.buscarPorNombre(tours, "Lago");
        for (Tour tour : toursConLago) {
            System.out.println(tour);
            System.out.println();
        }
    }
}
