package model;

/**
 * Representa una excursión cultural dentro de los servicios de Llanquihue Tour.
 * Hereda desde ServicioTuristico y agrega el lugar histórico visitado.
 */
public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    /**
     * Constructor vacío con valores por defecto.
     */
    public ExcursionCultural() {
        super();
        this.lugarHistorico = "Lugar histórico no especificado";
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre nombre de la excursión cultural.
     * @param duracionHoras duración de la excursión en horas.
     * @param lugarHistorico lugar histórico principal de la excursión.
     */
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        setLugarHistorico(lugarHistorico);
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        if (lugarHistorico != null && !lugarHistorico.trim().isEmpty()) {
            this.lugarHistorico = lugarHistorico;
        } else {
            this.lugarHistorico = "Lugar histórico no especificado";
        }
    }

    @Override
    public String toString() {
        return "Excursión cultural\n" +
                obtenerDatosBase() + "\n" +
                "Lugar histórico: " + lugarHistorico;
    }
}
