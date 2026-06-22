package util;

/**
 * Librería utilitaria propia para limpiar y convertir datos leídos desde archivos externos.
 * Centraliza validaciones simples para evitar repetir lógica en otras clases.
 */
public class ValidadorDatos {

    /**
     * Limpia un texto y devuelve un valor por defecto si viene vacío.
     *
     * @param valor texto original.
     * @param valorPorDefecto valor usado cuando el texto no es válido.
     * @return texto limpio o valor por defecto.
     */
    public String limpiarTexto(String valor, String valorPorDefecto) {
        if (valor != null && !valor.trim().isEmpty()) {
            return valor.trim();
        }
        return valorPorDefecto;
    }

    /**
     * Convierte un texto a número entero positivo usando try-catch.
     *
     * @param valor texto con el número.
     * @param valorPorDefecto valor usado si existe error de formato.
     * @param nombreCampo nombre del campo para mostrar mensajes más claros.
     * @return número entero validado.
     */
    public int convertirEnteroPositivo(String valor, int valorPorDefecto, String nombreCampo) {
        try {
            int numero = Integer.parseInt(valor.trim());
            if (numero >= 0) {
                return numero;
            }
            System.out.println("Advertencia: " + nombreCampo + " no puede ser negativo. Se usará " + valorPorDefecto + ".");
        } catch (NumberFormatException error) {
            System.out.println("Advertencia: " + nombreCampo + " tiene formato inválido. Se usará " + valorPorDefecto + ".");
        }
        return valorPorDefecto;
    }

    /**
     * Convierte un texto a número decimal positivo usando try-catch.
     *
     * @param valor texto con el número.
     * @param valorPorDefecto valor usado si existe error de formato.
     * @param nombreCampo nombre del campo para mostrar mensajes más claros.
     * @return número decimal validado.
     */
    public double convertirDoublePositivo(String valor, double valorPorDefecto, String nombreCampo) {
        try {
            double numero = Double.parseDouble(valor.trim());
            if (numero >= 0) {
                return numero;
            }
            System.out.println("Advertencia: " + nombreCampo + " no puede ser negativo. Se usará " + valorPorDefecto + ".");
        } catch (NumberFormatException error) {
            System.out.println("Advertencia: " + nombreCampo + " tiene formato inválido. Se usará " + valorPorDefecto + ".");
        }
        return valorPorDefecto;
    }
}
