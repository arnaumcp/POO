package edu.upc.etsetb.poo.decathlon1.iu;

import edu.upc.etsetb.poo.decathlon1.casosdeuso.Controlador;
import edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * La interficie de usuario del programa
 */
/*
 * https://en.wikipedia.org/wiki/Decathlon
 * https://es.wikipedia.org/wiki/Decatl%C3%B3n
 */
public class InterficieUsuario {

    /**
     * Lector utilizado para leer los comandos introducidos por el usuario.
     */
    private Scanner lector;
    
    /**
     * El controlador.
     */
    private final Controlador controlador;
    
    /**
     * Atributo static utilizado por el corrector automático. No modificar su valor.
     */
    private static boolean testing = false;
    
    /**
     * La consola del sistema. Siempre debe usarse para mostrar la información al usuario.
     */
    private final PrintStream console = System.out;

    /**
     * Separador utilizado en los comandos de entrada.
     */
    public static final String SEPARADOR = ":";
    
    /**
     * Mensaje de error que notifica que no hay atletas inscritos.
     */
    public static final String NO_ATLETAS_INSCRITOS_STR
            = "ERROR: Aún no hay ningún atleta inscrito.";
    /**
     * Mensaje de error que notifica que el número de atletas es erróneo
     */
    public static final String NUM_ATLETAS_ERRONEO_STR
            = "ERROR: Número de atletas erróneo.";
    /**
     * Mensaje de error que notifica que el número de inscripción es erróneo.
     */
    public static final String NUM_INSCRIPCION_ERRONEO_STR
            = "ERROR: El número de inscripción es erróneo.";
    
    /**
     * Mensaje de error que notifica que el tipo de evento es erróneo.
     */
     public static final String TIPO_DE_EVENTO_ERRONEO_STR 
            = "ERROR: Número de tipo de evento erróneo.";
    
    /**
     * Mensaje de error que notifica que el código de retorno del método es ilegal.
     */
    public static final String CODIGO_ILEGAL_STR 
            = "ERROR: Código ilegal.";
     
    /**
     * Mensaje de error que notifica que el comando de entrada es erróneo.
     */
    public static final String CMD_ERRONEO_STR 
            = "ERROR: Comando erróneo!";
    
    /**
     * Mensaje que notifica que la marca se ha añadido correctamente.
     */
    public static final String MARCA_ANYADIDA_STR = "Marca añadida";
    
    
    
    /**
     * Método constructor de la clase. Pide al usuario que Introduzca: Nombre de
     * la competición, Fecha y Lugar donde se celebra separados por 
     * el caracter asignado a la constante SEPARADOR (caracter ':'), Y<br>
     * Inicializa el atributo de clase Scanner (lector)<br>
     * Lee la información solicitada<br>
     * Crea e inicializa el atributo de tipo Controlador, forzando la inscripción 
     * automática de atletas y sus marcas.<br>
     * EJEMPLO: A continuación se muestra un ejemplo de String a 
     * entrar desde teclado (observad que la fecha se da en el formato AAAAMMDD<br>
     * "UnaCompetición:20220315:Valencia" 
     * 
     */
    public InterficieUsuario() {
        
        if (InterficieUsuario.testing == false)
        {
            this.console.println("Programa para la gestión de una competición de decathlon");
            this.console.println("Para simplificar sólo tendremos las 5 pruebas que se celebran el primer día");
            this.console.println("Cuidado: Tu configuración de sistema puede tener como carácter decimal '.' o ','.");
            this.console.println("Introduce: Nombre de la competición, Fecha y Lugar donde se celebra separados por '" + SEPARADOR + "'.");
        }
        throw new UnsupportedOperationException("InterficieUsuario::InterficieUsuario(). No implementado todavía.");
    }

    /**
     * Inscribe un atleta con el nombre y la nacionalidad pasados en 
     * la segunda y tercera posición del argumento args (que es un array de 
     * Strings).
     *
     * @param args Un array de Strings que en su segunda y tercera posición 
     * tiene el nombre y la nacionalidad de un atleta respectivamente.
     */
    public void inscribirAtleta(String[] args) {
        throw new UnsupportedOperationException("InterficieUsuario::inscribirAt"
                + "leta(String[] args). No implementado todavía.");
    }

    /**
     * Obtiene los datos de la competición y los presenta por pantalla.
     */
    public void mostrarCompeticion() {
        throw new UnsupportedOperationException("InterficieUsuario::mostrarCompe"
                + "ticion(). No implementado todavía.");
    }

    /**
     * A este método se le pasa la representación textual de un número de inscripción 
     * en la segunda posición de args (que es un array de Strings) y muestra por 
     * consola la información del atleta con ese número de inscripción
     *      *
     * @param args Un array de Strings que en su segunda posición tiene la 
     * representación textual del número de inscripción.
     */
    public void mostrarAtleta(String[] args) {
        throw new UnsupportedOperationException("InterficieUsuario::mostrarAtleta"
                + "(String[] args). No implementado todavía.");
    }

    /**
     * A este método se le pasan las representaciones textuales de un número de 
     * inscripción, del identificador de un evento y de una marca; con esta 
     * información el método añade una marca para un evento en el atleta con ese 
     * número de inscripción; si todo va bien, muestra un mensaje que así lo indica 
     * por consola; por el contrario, si se da alguna de las situaciones que siguen:<br>
     *   no hay ningún atleta inscrito<br>
     *   el número de inscripción es erróneo<br>
     *   el identificador del evento es erróneo<br>
     * El método muestra por consola un mensaje indicativo del error encontrado.
     * Debéis utilizar las constantes de tipo String de la clase InterficieUsuario
     * para ello.
    *
     * @param args Las representaciones textuales: del número de inscripción, 
     * del identificador de un evento y de una marca, en la segunda, 
     * tercera y cuarta posición del array args, respectivamente.
     */
    public void anyadirMarcaEnEventoDeUnAtleta(String[] args) {
        throw new UnsupportedOperationException("InterficieUsuario::anyadirMarca"
                + "EnEventoDeUnAtleta(String[] args). No implementado todavía.");
    }

    /**
     * A este argumento se le pasa la representación textual de un número 
     * entero  en la segunda posición de args (que es un array de Strings); 
     * con ese valor, el método muestra la clasificación de N atletas por 
     * consola, siendo N el número representado en args; por el contrario, muestra 
     * un mensaje de error si:<br>
     * Aún no hay ningúnatleta inscrito,<br>
     * El número de atletas que se quiere que aparezca en la clasificación 
     * es erróneo (menor que 1 o mayor que el número de atletas
     * compitiendo).
     *
     * @param args Los argumentos del comando.
     */
    public void mostrarClasificacion(String[] args) {
        throw new UnsupportedOperationException("InterficieUsuario::mostrarClasi"
                + "ficacion(String[] args). No implementado todavía.");
    }

    /**
     * Presenta por consola el menú del programa.
     */
    public void mostrarOpciones() {
        throw new UnsupportedOperationException("InterficieUsuario::mostrarOpciones()"
                + ". No implementado todavía.");
    }

    /**
     * Este método recibe un comando y lo ejecuta. Si el comando pasado 
     * como parámetro es erróneo, el método debe indicarlo mediante un 
     * mensaje. Utilizad la constante de tipo String definida en la clase
     * para ello.
     *
     * @param comando String con el comando.
     */
    public void ejecutaComando(String comando) {
        throw new UnsupportedOperationException("InterficieUsuario::ejecutaComan"
                + "do(String comando). No implementado todavía.");
    }

    /**
     * Muestra el menú y va pidiendo y ejecutando los comandos que el usuario va
     * introduciendo hasta que se introduce el comando de acabar la ejecución
     * del programa.
     */
    public void start() {
        throw new UnsupportedOperationException("InterficieUsuario::start(). No "
                + "implementado todavía.");
    }
    
    /**
     * No modificar: método utilizado por el corrector automático de la clase 
     * InterficieUsuario. Este método debe invocarse dentro del constructor de la clase, 
     * para así inicializar el atributo de tipo Scanner llamado lector.
     */
    public final void inicializaLector()
    {
        if (InterficieUsuario.testing == false){
            this.lector = new Scanner(System.in);
        }
        else
            this.lector = new Scanner(new ByteArrayInputStream("UnaCompetición:20220315:Valencia\n".getBytes()));
    }

    
    /**
     * Método main. Crea una nueva interficie de usuario e invoca a start.
     *
     * @param args Argumentos con los que se invoca al main (se ignoran).
     */
    public static void main(String[] args) {
        throw new UnsupportedOperationException("InterficieUsuario::main(). No implementado todavía.");
    }
}
