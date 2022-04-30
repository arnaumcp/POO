package edu.upc.etsetb.poo.decathlon1.dominio;

/**
 * Clase para gestionar la competición.
 */
public class Competicion {

    private final String nombre;
    private final String fecha;
    private final String lugar;
    private int numInscritos = 0;

    /**
     * Método constructor de la clase. Se le pasa la información de la
     * competición (nombre, fecha y lugar de la comoetición).
     *
     * @param nombre Nombre.
     * @param fecha Fecha.
     * @param lugar Lugar.
     */
    public Competicion(String nombre, String fecha, String lugar) {
        throw new UnsupportedOperationException("Competicion::Competicion"
                + "(String nombre, String fecha, String lugar). "
                + "No implementado todavía.");
    }

    /**
     * Método getter. Devuelve el número de inscritos.
     *
     * @return Devuelve el número de inscritos.
     */
    public int getNumInscritos() {
        throw new UnsupportedOperationException("Competicion::getNumInscritos()"
                + ". No implementado todavía.");
    }

    /**
     * La primera vez que se invoca devolverá el número 1, la segunda el 2, etc.
     *
     * @return Devuelve el siguiente número de Inscripción.
     */
    public int obtenerSiguienteNumInscripcion() {
        throw new UnsupportedOperationException("Competicion::"
                + "obtenerSiguienteNumInscripcion(). No implementado todavía.");
    }

    /**
     * Método toString() de la clase.
     *
     * @return String con la información de la competición; a continuación 
     * se muestra un ejemplo:<br>
     * Nombre de la competición: Valencia2022
     * Fecha de celebración: 20220329
     * Número de atletas inscritos: 60
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Competicion::toString(). "
                + "No implementado todavía.");
    }

}
