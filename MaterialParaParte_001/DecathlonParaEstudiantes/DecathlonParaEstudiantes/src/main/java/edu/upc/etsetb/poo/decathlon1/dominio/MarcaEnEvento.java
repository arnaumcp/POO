package edu.upc.etsetb.poo.decathlon1.dominio;

/**
 * Clase para gestionar la marca obtenida en un evento por un atleta.
 */
public class MarcaEnEvento {

    /**
     * Código para el evento 100 metros lisos.
     */
    public static final int CIEN_METROS = 0;
    /**
     * Código para el evento salto de longitud.
     */
    public static final int SALTO_DE_LONGITUD = 1;
    /**
     * Código para el evento lanzamiento de peso.
     */
    public static final int LAZAMIENTO_DE_PESO = 2;
    /**
     * Código para el evento salto de altura.
     */
    public static final int SALTO_DE_ALTURA = 3;
    /**
     * Código para el evento 400 metros lisos.
     */
    public static final int CUATROCIENTOS_METROS = 4;
    /**
     * Número total de eventos (5).
     */
    public static final int NUM_EVENTOS = 5;
    /**
     * Código para señalar que el método calcularPuntosEvento() ha podido 
     * realizar los cálculos encomendados sin problemas.
     */
    public static final int CALCULO_EVENTO_OK = 0;
    /**
     * Código para señalar que se ha intentado calcular puntos para una 
     * marca negativa, que es una situación que no debe darse.
     */
    public static final int CALCULO_EVENTO_KO_MARCA_NEGATIVA = -1;
    /**
     * La normativa de Decatlon define 3 parámetros (A, B y C) que varían 
     * según el evento en cuestión y forman parte de las fórmulas que permiten 
     * calcular los puntos en función de una marca para cada uno de dichos 
     * eventos; para más detalles, debéis consultar la página web
     * 
     * https://es.wikipedia.org/wiki/Decatl%C3%B3n#Sistema_de_puntos
     * 
     * Este es el parámetro A.
     */
    public static final int A = 0;
    /**
     * Parámetro B.
     */
    public static final int B = 1;
    /**
     * Parámetro C. 
     */
    public static final int C = 2;

    /**
     * Matriz en la que se almacenan los valores de A, B y C para los 
     * diferentes eventos según la normativa
     * public static final double[][] PARAM = {<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;{25.4347, 18, 1.81}, //CIEN_METROS<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;{0.14354, 220, 1.40}, //SALTO_DE_LONGITUD<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;{51.39, 1.5, 1.05}, // LAZAMIENTO_DE_PESO<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;{0.8465, 75, 1.42}, // SALTO_DE_ALTURA<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;{1.53775, 82, 1.81}, // CUATROCIENTOS_METROS<br>
     * };<br>
     * Para acceder al parámetro A de CIEN_METROS es: PARAM[CIEN_METROS][A].
     */
    public static final double[][] PARAM = {
        {25.4347, 18, 1.81}, //CIEN_METROS
        {0.14354, 220, 1.40}, //SALTO_DE_LONGITUD
        {51.39, 1.5, 1.05}, // LAZAMIENTO_DE_PESO
        {0.8465, 75, 1.42}, // SALTO_DE_ALTURA
        {1.53775, 82, 1.81}, // CUATROCIENTOS_METROS
    };
    private final int evento;
    private final double marca;
    private int puntos;

    /**
     * Método constructor de la clase
     *
     * @param evento Evento
     * @param marca Marca. La marca (o performance (o P)) es la marca obtenida
     * por el atleta, medida en segundos (eventos de pista, es decir, carreras),
     * metros (lanzamientos), o centímetros (saltos).
     */
    public MarcaEnEvento(int evento, double marca) {
        // https://rollbar.com/blog/can-constructors-throw-exceptions-in-java/# // yes
        throw new UnsupportedOperationException("MarcaEnEvento::MarcaEnEvento"
                + "(int evento, double marca). No implementado todavía.");
    }

    /**
     * Método getter. Devuelve los puntos de MarcaEnEvento.
     *
     * @return Devuelve los puntos de MarcaEnEvento.
     */
    public int getPuntos() {
        throw new UnsupportedOperationException("MarcaEnEvento::getPuntos()"
                + ". No implementado todavía.");
    }

    /**
     * Cálcula los puntos correspondientes a la marca en este evento y los
     * asigna al atributo puntos. Los eventos de pista (carreras) y de los
     * eventos de campo (lanzamientos y saltos) se calculan con una formula
     * ligeramente diferente. Ver:
     * https://es.wikipedia.org/wiki/Decatl%C3%B3n#Sistema_de_puntos para saber
     * cómo se calculan.
     *
     * @return Devuelve CALCULO_EVENTO_OK o CALCULO_EVENTO_KO_MARCA_NEGATIVA.
     */
    public int calcularPuntosEvento() {
        throw new UnsupportedOperationException("MarcaEnEvento::"
                + "calcularPuntosEvento(). No implementado todavía.");
    }

    /**
     * Devuelve un String con las únidades en las que se mide una marca de este
     * tipo de evento: segundos (para eventos de pista), metros (para
     * lanzamientos), y centímetros (para saltos).
     *
     * @param evento El tipo de evento.
     * @return El String con el tipo de únidades ("segundos", "metros" o
     * "centímetros".
     */
    public static String getUnidadMarcaEnEvento(int evento) {
        throw new UnsupportedOperationException("MarcaEnEvento::"
                + "getUnidadMarcaEnEvento(int evento). No implementado todavía.");
    }

    /**
     * Devuelve un String con la lista de eventos y sus números de evento
     * correspondiente.
     *
     * @return Dicho String.
     */
    public static String getListaEventos() {
        throw new UnsupportedOperationException("MarcaEnEvento::"
                + "getListaEventos(). No implementado todavía.");
    }

    /**
     * Método toString() de la clase.
     *
     * @return String con la información de la marca; a continuación se 
     * muestra un ejemplo:<br>
     * 100 metros lisos:     marca=11.278 segundos, puntos=800
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("MarcaEnEvento::toString(). No implementado todavía.");
    }
}
