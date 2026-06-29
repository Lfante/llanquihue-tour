package ui;

import data.GestorServicios;
import model.ServicioTuristico;

/**
 * Clase principal del sistema Llanquihue Tour para la Semana 6.
 * Ejecuta la creación de servicios turísticos y muestra la jerarquía por consola.
 */
public class Main {
    public static void main(String[] args) {
        GestorServicios gestorServicios = new GestorServicios();
        ServicioTuristico[] servicios = gestorServicios.crearServiciosDePrueba();

        System.out.println("=== Llanquihue Tour - Semana 6 ===");
        System.out.println("Jerarquía de servicios turísticos con herencia simple");
        System.out.println();

        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio);
            System.out.println("------------------------------");
        }

        System.out.println("Total de servicios creados: " + servicios.length);
    }
}
