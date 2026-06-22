package service;

import model.Tour;
import java.util.ArrayList;

/**
 * Librería personalizada para administrar una colección de tours.
 * Encapsula el ArrayList y ofrece operaciones reutilizables de recorrido, búsqueda y filtrado.
 */
public class CatalogoTours {
    private ArrayList<Tour> tours;

    /**
     * Constructor sin parámetros. Inicializa la colección vacía.
     */
    public CatalogoTours() {
        this.tours = new ArrayList<>();
    }

    /**
     * Constructor que recibe una lista inicial de tours.
     *
     * @param tours lista inicial de tours.
     */
    public CatalogoTours(ArrayList<Tour> tours) {
        this.tours = new ArrayList<>();
        agregarTours(tours);
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = new ArrayList<>();
        agregarTours(tours);
    }

    /**
     * Agrega un tour evitando nulos y duplicados por nombre.
     *
     * @param tour tour que se desea agregar.
     */
    public void agregarTour(Tour tour) {
        if (tour != null && !existeTour(tour.getNombre())) {
            tours.add(tour);
        }
    }

    /**
     * Agrega varios tours al catálogo.
     *
     * @param nuevosTours lista de tours cargados desde archivo.
     */
    public void agregarTours(ArrayList<Tour> nuevosTours) {
        if (nuevosTours == null) {
            return;
        }

        for (Tour tour : nuevosTours) {
            agregarTour(tour);
        }
    }

    /**
     * Verifica si un tour ya existe según su nombre.
     *
     * @param nombre nombre a buscar.
     * @return true si existe, false en caso contrario.
     */
    public boolean existeTour(String nombre) {
        for (Tour tour : tours) {
            if (tour.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve todos los tours registrados.
     *
     * @return copia de la lista de tours.
     */
    public ArrayList<Tour> obtenerTodos() {
        return new ArrayList<>(tours);
    }

    /**
     * Filtra los tours por tipo.
     *
     * @param tipoBuscado tipo o categoría a buscar.
     * @return lista filtrada.
     */
    public ArrayList<Tour> filtrarPorTipo(String tipoBuscado) {
        ArrayList<Tour> resultados = new ArrayList<>();

        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase(tipoBuscado)) {
                resultados.add(tour);
            }
        }

        return resultados;
    }

    /**
     * Filtra los tours por precio máximo.
     *
     * @param precioMaximo precio máximo permitido.
     * @return lista de tours con precio menor o igual al indicado.
     */
    public ArrayList<Tour> filtrarPorPrecioMaximo(double precioMaximo) {
        ArrayList<Tour> resultados = new ArrayList<>();

        for (Tour tour : tours) {
            if (tour.getPrecioPorPersona() <= precioMaximo) {
                resultados.add(tour);
            }
        }

        return resultados;
    }

    /**
     * Busca tours que contengan un texto en su nombre.
     *
     * @param textoBuscado texto a buscar.
     * @return lista de tours coincidentes.
     */
    public ArrayList<Tour> buscarPorNombre(String textoBuscado) {
        ArrayList<Tour> resultados = new ArrayList<>();

        if (textoBuscado == null) {
            return resultados;
        }

        for (Tour tour : tours) {
            if (tour.getNombre().toLowerCase().contains(textoBuscado.toLowerCase())) {
                resultados.add(tour);
            }
        }

        return resultados;
    }

    /**
     * Cuenta la cantidad total de tours registrados.
     *
     * @return cantidad de tours.
     */
    public int contarTours() {
        return tours.size();
    }
}
