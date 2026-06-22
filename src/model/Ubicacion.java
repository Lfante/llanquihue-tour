package model;

/**
 * Representa la ubicación donde se realiza un tour.
 * Esta clase se usa como parte de la composición dentro de la clase Tour.
 */
public class Ubicacion {
    private String ciudad;
    private String sector;

    /**
     * Constructor sin parámetros con valores por defecto.
     */
    public Ubicacion() {
        this.ciudad = "Sin ciudad";
        this.sector = "Sin sector";
    }

    /**
     * Constructor con parámetros.
     *
     * @param ciudad ciudad donde se realiza el tour.
     * @param sector sector o zona específica del tour.
     */
    public Ubicacion(String ciudad, String sector) {
        setCiudad(ciudad);
        setSector(sector);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if (ciudad != null && !ciudad.isBlank()) {
            this.ciudad = ciudad;
        } else {
            this.ciudad = "Sin ciudad";
        }
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        if (sector != null && !sector.isBlank()) {
            this.sector = sector;
        } else {
            this.sector = "Sin sector";
        }
    }

    @Override
    public String toString() {
        return sector + ", " + ciudad;
    }
}
