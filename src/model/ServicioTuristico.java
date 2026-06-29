package model;

/**
 * Clase base que representa un servicio turístico general de Llanquihue Tour.
 * Contiene los datos comunes que comparten las distintas categorías de servicios.
 */
public class ServicioTuristico {
    private String nombre;
    private int duracionHoras;

    /**
     * Constructor vacío con valores por defecto.
     */
    public ServicioTuristico() {
        this.nombre = "Servicio sin nombre";
        this.duracionHoras = 1;
    }

    /**
     * Constructor con parámetros para inicializar un servicio turístico.
     *
     * @param nombre nombre del servicio turístico.
     * @param duracionHoras duración del servicio en horas.
     */
    public ServicioTuristico(String nombre, int duracionHoras) {
        setNombre(nombre);
        setDuracionHoras(duracionHoras);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Servicio sin nombre";
        }
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras > 0) {
            this.duracionHoras = duracionHoras;
        } else {
            this.duracionHoras = 1;
        }
    }

    /**
     * Retorna los datos comunes para reutilizarlos desde las subclases.
     *
     * @return texto con nombre y duración del servicio.
     */
    protected String obtenerDatosBase() {
        return "Nombre: " + nombre + "\n" +
                "Duración: " + duracionHoras + " horas";
    }

    @Override
    public String toString() {
        return "Servicio turístico\n" + obtenerDatosBase();
    }
}
