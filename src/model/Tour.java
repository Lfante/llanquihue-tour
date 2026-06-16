package model;

/**
 * Representa un tour ofrecido por la agencia Llanquihue Tour.
 * La información de cada objeto se obtiene desde el archivo tours.txt.
 */
public class Tour {
    private String nombre;
    private String tipo;
    private int duracionHoras;
    private double precioPorPersona;

    /**
     * Constructor sin parámetros. Asigna valores por defecto al tour.
     */
    public Tour() {
        this.nombre = "Sin nombre";
        this.tipo = "Sin tipo";
        this.duracionHoras = 0;
        this.precioPorPersona = 0.0;
    }

    /**
     * Constructor con parámetros para inicializar todos los datos del tour.
     *
     * @param nombre nombre del tour.
     * @param tipo tipo o categoría del tour.
     * @param duracionHoras duración del tour en horas.
     * @param precioPorPersona precio por persona en pesos chilenos.
     */
    public Tour(String nombre, String tipo, int duracionHoras, double precioPorPersona) {
        setNombre(nombre);
        setTipo(tipo);
        setDuracionHoras(duracionHoras);
        setPrecioPorPersona(precioPorPersona);
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

    /**
     * Retorna una descripción legible del tour para mostrar por consola.
     *
     * @return información formateada del tour.
     */
    @Override
    public String toString() {
        return "Tour registrado en Llanquihue Tour\n" +
                "Nombre: " + nombre + "\n" +
                "Tipo: " + tipo + "\n" +
                "Duración: " + duracionHoras + " horas\n" +
                "Precio por persona: $" + String.format("%,.0f", precioPorPersona);
    }
}
