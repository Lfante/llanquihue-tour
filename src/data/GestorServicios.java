package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

/**
 * Clase encargada de crear servicios turísticos de prueba para validar la jerarquía.
 */
public class GestorServicios {

    /**
     * Crea dos objetos de cada subclase solicitada en la actividad.
     *
     * @return arreglo con servicios turísticos de prueba.
     */
    public ServicioTuristico[] crearServiciosDePrueba() {
        ServicioTuristico[] servicios = new ServicioTuristico[6];

        servicios[0] = new RutaGastronomica("Ruta Gastronómica Puerto Varas", 4, 5);
        servicios[1] = new RutaGastronomica("Sabores Tradicionales de Frutillar", 3, 4);

        servicios[2] = new PaseoLacustre("Paseo Lago Llanquihue", 3, "Lancha turística");
        servicios[3] = new PaseoLacustre("Navegación Volcán Osorno", 4, "Catamarán");

        servicios[4] = new ExcursionCultural("Tour Cultural Frutillar", 5, "Teatro del Lago");
        servicios[5] = new ExcursionCultural("Circuito Histórico Llanquihue", 2, "Museo local y Plaza de Armas");

        return servicios;
    }
}
