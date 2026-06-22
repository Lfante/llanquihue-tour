package model;

/**
 * Representa a un operador local asociado a un tour de Llanquihue Tour.
 * Permite separar los datos del operador para reutilizarlos en otros registros.
 */
public class OperadorTuristico {
    private String nombre;
    private String telefono;

    /**
     * Constructor sin parámetros con valores por defecto.
     */
    public OperadorTuristico() {
        this.nombre = "Sin operador";
        this.telefono = "Sin teléfono";
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre nombre del operador turístico.
     * @param telefono teléfono de contacto del operador.
     */
    public OperadorTuristico(String nombre, String telefono) {
        setNombre(nombre);
        setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Sin operador";
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.isBlank()) {
            this.telefono = telefono;
        } else {
            this.telefono = "Sin teléfono";
        }
    }

    @Override
    public String toString() {
        return nombre + " | Teléfono: " + telefono;
    }
}
