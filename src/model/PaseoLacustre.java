package model;

/**
 * Representa un paseo lacustre de Llanquihue Tour.
 * Hereda desde ServicioTuristico y agrega el tipo de embarcación utilizada.
 */
public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    /**
     * Constructor vacío con valores por defecto.
     */
    public PaseoLacustre() {
        super();
        this.tipoEmbarcacion = "Embarcación no especificada";
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre nombre del paseo lacustre.
     * @param duracionHoras duración del paseo en horas.
     * @param tipoEmbarcacion tipo de embarcación utilizada.
     */
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        setTipoEmbarcacion(tipoEmbarcacion);
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        if (tipoEmbarcacion != null && !tipoEmbarcacion.trim().isEmpty()) {
            this.tipoEmbarcacion = tipoEmbarcacion;
        } else {
            this.tipoEmbarcacion = "Embarcación no especificada";
        }
    }

    @Override
    public String toString() {
        return "Paseo lacustre\n" +
                obtenerDatosBase() + "\n" +
                "Tipo de embarcación: " + tipoEmbarcacion;
    }
}
