package model;

/**
 * Representa una ruta gastronómica ofrecida por Llanquihue Tour.
 * Hereda los datos comunes desde ServicioTuristico y agrega el número de paradas.
 */
public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas;

    /**
     * Constructor vacío con valores por defecto.
     */
    public RutaGastronomica() {
        super();
        this.numeroDeParadas = 1;
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre nombre de la ruta gastronómica.
     * @param duracionHoras duración de la ruta en horas.
     * @param numeroDeParadas cantidad de paradas gastronómicas.
     */
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        setNumeroDeParadas(numeroDeParadas);
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        if (numeroDeParadas > 0) {
            this.numeroDeParadas = numeroDeParadas;
        } else {
            this.numeroDeParadas = 1;
        }
    }

    @Override
    public String toString() {
        return "Ruta gastronómica\n" +
                obtenerDatosBase() + "\n" +
                "Número de paradas: " + numeroDeParadas;
    }
}
