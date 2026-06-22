package model;

/**
 * Representa un tour ofrecido por la agencia Llanquihue Tour.
 * Usa composición con Ubicacion y OperadorTuristico para organizar mejor la información.
 */
public class Tour {
    private String nombre;
    private String tipo;
    private int duracionHoras;
    private double precioPorPersona;
    private Ubicacion ubicacion;
    private OperadorTuristico operador;

    /**
     * Constructor sin parámetros con valores por defecto.
     */
    public Tour() {
        this.nombre = "Sin nombre";
        this.tipo = "Sin tipo";
        this.duracionHoras = 0;
        this.precioPorPersona = 0.0;
        this.ubicacion = new Ubicacion();
        this.operador = new OperadorTuristico();
    }

    /**
     * Constructor con parámetros para crear un tour completo.
     *
     * @param nombre nombre del tour.
     * @param tipo categoría del tour.
     * @param duracionHoras duración en horas.
     * @param precioPorPersona precio por persona en pesos chilenos.
     * @param ubicacion ubicación asociada al tour.
     * @param operador operador responsable del tour.
     */
    public Tour(String nombre, String tipo, int duracionHoras, double precioPorPersona,
                Ubicacion ubicacion, OperadorTuristico operador) {
        setNombre(nombre);
        setTipo(tipo);
        setDuracionHoras(duracionHoras);
        setPrecioPorPersona(precioPorPersona);
        setUbicacion(ubicacion);
        setOperador(operador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Sin nombre";
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isBlank()) {
            this.tipo = tipo;
        } else {
            this.tipo = "Sin tipo";
        }
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras >= 0) {
            this.duracionHoras = duracionHoras;
        } else {
            this.duracionHoras = 0;
        }
    }

    public double getPrecioPorPersona() {
        return precioPorPersona;
    }

    public void setPrecioPorPersona(double precioPorPersona) {
        if (precioPorPersona >= 0) {
            this.precioPorPersona = precioPorPersona;
        } else {
            this.precioPorPersona = 0.0;
        }
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        if (ubicacion != null) {
            this.ubicacion = ubicacion;
        } else {
            this.ubicacion = new Ubicacion();
        }
    }

    public OperadorTuristico getOperador() {
        return operador;
    }

    public void setOperador(OperadorTuristico operador) {
        if (operador != null) {
            this.operador = operador;
        } else {
            this.operador = new OperadorTuristico();
        }
    }

    @Override
    public String toString() {
        return "Tour registrado en Llanquihue Tour\n"
                + "Nombre: " + nombre + "\n"
                + "Tipo: " + tipo + "\n"
                + "Duración: " + duracionHoras + " horas\n"
                + "Precio por persona: $" + String.format("%,.0f", precioPorPersona) + "\n"
                + "Ubicación: " + ubicacion + "\n"
                + "Operador: " + operador;
    }
}
