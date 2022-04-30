/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.upc.etsetb.poo.decathlon1.iu;

import edu.upc.ac.corrector.SuperClassForTests;
import edu.upc.etsetb.poo.corrector.TestAll;
import edu.upc.etsetb.poo.decathlon1.casosdeuso.Controlador;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Optional;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Juan Carlos Cruellas at Universidad Politécnica de Cataluña
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(MockitoJUnitRunner.class)
public class InterficieUsuarioTest extends SuperClassForTests{

    private static int numErrorsBefore;
    private static int numInstances = 0;
    private static Map<String, Double> nota;
    protected InterficieUsuario mockIu;
    protected Controlador mockControlador;
    protected PrintStream mockPrintStream;

    public InterficieUsuarioTest() {
        super();
        numInstances++;
        if (numInstances == 1) {
            numErrorsBefore = SuperClassForTests.indErrors.size();
        }
    }

    @BeforeClass
    public static void setUpClass() {
        nota = TestAll.notas;
    }

    @AfterClass
    public static void tearDownClass() {
        showErrors(indErrors, "InterficieUsuario");
        nota.put("InterficieUsuario", puntosTotales);
        puntosTotales = 0;
    }
        
    @Before
    public void setUp() {
        this.mockIu = Mockito.mock(InterficieUsuario.class);
        this.mockControlador = Mockito.mock(Controlador.class);
        this.mockPrintStream = Mockito.mock(PrintStream.class);
        when(this.mockControlador.anyadirMarcaEnEventoDeUnAtleta(1, 0, 0)).thenReturn(Controlador.NO_ATLETAS_INSCRITOS);
        when(this.mockControlador.anyadirMarcaEnEventoDeUnAtleta(-1, 0, 0)).thenReturn(Controlador.NUM_INSCRIPCION_ERRONEO);
        when(this.mockControlador.anyadirMarcaEnEventoDeUnAtleta(1, -1, 0)).thenReturn(Controlador.TIPO_DE_EVENTO_ERRONEO);
        when(this.mockControlador.anyadirMarcaEnEventoDeUnAtleta(1, 0, 12.25)).thenReturn(Controlador.RESULTADO_OK);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Constructor method, of class InterficieUsuario.
     */
    @Test
    public void test01_Constructor()
    {
        double valorTotal = 1.0;
        AssertionError toThrow = null;
        AssertionError error = null;
        double puntosAntes = puntosTotales;

        this.printlnAlways("\nInterficieUsuario::"
                + "InterficieUsuario(...). Valor: " + valorTotal + "\n");
        
        try
        {
            this.printlnAlways("Test1-1: comprobar que atributo de tipo Scanner creado.\n");
            
            Field field = InterficieUsuario.class.getDeclaredField("testing");
            field.setAccessible(true);
            field.setBoolean(null, true);
            InterficieUsuario instance = new InterficieUsuario();
            
            Optional<Object> attr = this.getPrivateFieldValue(instance, "lector");
            if (!attr.isPresent())
                error = this.sAssertTrue(false, 0, "Atributo de tipo Scanner = null!");
            else
                error = this.sAssertTrue(true, valorTotal * 0.5, "");
            
            toThrow = toThrow(error, toThrow);
        }
        catch (Exception ex) {
            this.printlnAlways("\n*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...\n");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        try
        {
            this.printlnAlways("Test1-2: comprobar que atributo de tipo Controlador creado.\n");
            
            Field field = InterficieUsuario.class.getDeclaredField("testing");
            field.setAccessible(true);
            field.setBoolean(null, true);
            InterficieUsuario instance = new InterficieUsuario();
            
            Optional<Object> attr = this.getPrivateFieldValue(instance, "controlador");
            if (!attr.isPresent())
                error = this.sAssertTrue(false, 0, "Atributo de tipo Controlador = null!");
            else
                error = this.sAssertTrue(true, valorTotal * 0.5, "");
            
            toThrow = toThrow(error, toThrow); 
        } 
        catch (Exception ex) {
            this.printlnAlways("\n*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...\n");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }

        this.acumula(puntos);
        puntos(puntosAntes);
        throwIfAnError(toThrow);
    }
    
    /**
     * Test of inscribirAtleta method, of class InterficieUsuario.
     */
    @Test
    public void test02_inscribirAtleta()
    {
        double valorTotal = 1.0;
        AssertionError toThrow = null;
        AssertionError error = null;
        double puntosAntes = puntosTotales;

        this.printlnAlways("\nInterficieUsuario::"
                + "inscribirAtleta(...). Valor: " + valorTotal + "\n");
        
        try
        {
            this.printlnAlways("Test2-1: comprobar que se invoca a "
                    + "método inscribirAtleta() de clase Controlador, "
                    + "pasándole valores adecuados como parámetro.\n");
            
            Field field = InterficieUsuario.class.getDeclaredField("testing");
            field.setAccessible(true);
            field.setBoolean(null, true);
            InterficieUsuario instance = new InterficieUsuario();
            
            this.setPrivateField(instance, "controlador", this.mockControlador);
            Mockito.spy(this.mockControlador);
            
            try
            {
                String[] args = {"ia","Nom. A", "Nac. A"};
                instance.inscribirAtleta(args); 
                Mockito.verify(this.mockControlador).inscribirAtleta("Nom. A", "Nac. A");
                error = this.sAssertTrue(true, 1 * valorTotal, "");
                toThrow = toThrow(error, toThrow);
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::inscribirAtleta() debería "
                                + "invocar a Controlador::inscribirAtleta(), "
                                + "pasándole los valores adecuados como parámetro.");
                toThrow = toThrow(error, toThrow);
            }
            
            toThrow = toThrow(error, toThrow);
        }
        catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        this.acumula(puntos);
        puntos(puntosAntes);
        throwIfAnError(toThrow); 
    }
    
    /**
     * Test of mostrarCompeticion method, of class InterficieUsuario.
     */
    @Test
    public void test03_mostrarCompeticion()
    {
        double valorTotal = 1.0;
        AssertionError toThrow = null;
        AssertionError error = null;
        double puntosAntes = puntosTotales;

        this.printlnAlways("\nInterficieUsuario::"
                + "mostrarCompeticion(...). Valor: " + valorTotal + "\n");
        
        try {
            this.printlnAlways("Test3-1: comprobar que se invoca a "
                    + "método getInfoCompeticion() de clase Controlador.\n");
            
            Field field = InterficieUsuario.class.getDeclaredField("testing");
            field.setAccessible(true);
            field.setBoolean(null, true);
            InterficieUsuario instance = new InterficieUsuario();
            
            this.setPrivateField(instance, "controlador", this.mockControlador);
            Mockito.spy(this.mockControlador);
            
            try
            {
                instance.mostrarCompeticion();
                Mockito.verify(this.mockControlador).getInfoCompeticion();
                error = this.sAssertTrue(true, 1 * valorTotal, "");
                toThrow = toThrow(error, toThrow);
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::mostrarCompeticion() debería "
                                + "invocar a Controlador::getInfoCompeticion().");
                toThrow = toThrow(error, toThrow);
            }
            
            toThrow = toThrow(error, toThrow);
        }
        catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        this.acumula(puntos);
        puntos(puntosAntes);
        throwIfAnError(toThrow); 
    }
    
    /**
     * Test of mostrarAtleta method, of class InterficieUsuario.
     */
    @Test
    public void test04_mostrarAtleta()
    {
        double valorTotal = 1.0;
        AssertionError toThrow = null;
        AssertionError error = null;
        double puntosAntes = puntosTotales;

        this.printlnAlways("\nInterficieUsuario::"
                + "mostrarAtleta(...). Valor: " + valorTotal + "\n");
        
        try {
            this.printlnAlways("Test4-1: comprobar que se invoca a "
                    + "método getInfoAtleta() de clase Controlador y que "
                    + "recibe correctamente número de inscripción.\n");
            
            Field field = InterficieUsuario.class.getDeclaredField("testing");
            field.setAccessible(true);
            field.setBoolean(null, true);
            InterficieUsuario instance = new InterficieUsuario();
            
            this.setPrivateField(instance, "controlador", this.mockControlador);
            Mockito.spy(this.mockControlador);
            
            try
            {
                String[] args = {"ma","124"};
                instance.mostrarAtleta(args);
                Mockito.verify(this.mockControlador).getInfoAtleta(124);
                error = this.sAssertTrue(true, 1 * valorTotal, "");
                toThrow = toThrow(error, toThrow);
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::mostrarAtleta() debería "
                                + "invocar a Controlador::getInfoAtletaAtleta(), "
                                + "pasándole el valor adecuado como parámetro.");
                toThrow = toThrow(error, toThrow);
            }
            
            toThrow = toThrow(error, toThrow);
        }
        catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        this.acumula(puntos);
        puntos(puntosAntes);
        throwIfAnError(toThrow); 
    }
    
    /**
     * Test of anyadirMarcaEnEventoDeUnAtleta method, of class InterficieUsuario.
     */
    @Test
    public void test05_anyadirMarcaEnEventoDeUnAtleta()
    {
        double valorTotal = 2.0;
        AssertionError toThrow = null;
        AssertionError error = null;
        double puntosAntes = puntosTotales;

        this.printlnAlways("\nInterficieUsuario::"
                + "anyadirMarcaEnEventoDeUnAtleta(...). Valor: " + valorTotal + "\n");
        
        try {
            
            Field field = InterficieUsuario.class.getDeclaredField("testing");
            field.setAccessible(true);
            field.setBoolean(null, true);
            InterficieUsuario instance = new InterficieUsuario();
            
            this.setPrivateField(instance, "controlador", this.mockControlador);
            this.setPrivateField(instance, "console", this.mockPrintStream);
            Mockito.spy(this.mockControlador);
            Mockito.spy(this.mockPrintStream);
            
            this.printlnAlways("Test5-1: comprobar que se invoca método "
                    + "anyadirMarcaEnEventoDeUnAtleta() de clase Controlador. "
                    + "Además, se muestra el mensaje adecuado por la consola si "
                    + "devuelve el código de error NO_ATLETAS_INSCRITOS.\n");
            
            try
            {
                String[] args = {"am","1","0","0"};
                instance.anyadirMarcaEnEventoDeUnAtleta(args);
                Mockito.verify(this.mockControlador).anyadirMarcaEnEventoDeUnAtleta(1, 0, 0);
                Mockito.verify(this.mockPrintStream).println(InterficieUsuario.NO_ATLETAS_INSCRITOS_STR);
                error = this.sAssertTrue(true, 0.25 * valorTotal, ""); 
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::anyadirMarcaEnEventoDeUnAtleta() parece "
                                + "no invocar el método adecuado de la clase Controlador. O puede "
                                + "ser que no se acabe mostrando el mensaje adecuado por la "
                                + "consola del sistema.");
                toThrow = toThrow(error, toThrow);
            }
            
            this.printlnAlways("Test5-2:  comprobar que se invoca método "
                    + "anyadirMarcaEnEventoDeUnAtleta() de clase Controlador. "
                    + "Además, se muestra el mensaje adecuado por la consola si "
                    + "devuelve el código de error NUM_INSCRIPCION_ERRONEO.\n");
            
            try
            {
                String[] args = {"am","-1","0","0"};
                instance.anyadirMarcaEnEventoDeUnAtleta(args);
                Mockito.verify(this.mockControlador).anyadirMarcaEnEventoDeUnAtleta(-1, 0, 0);
                Mockito.verify(this.mockPrintStream).println(InterficieUsuario.NUM_INSCRIPCION_ERRONEO_STR);
                error = this.sAssertTrue(true, 0.25 * valorTotal, ""); 
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::anyadirMarcaEnEventoDeUnAtleta() parece "
                                + "no invocar el método adecuado de la clase Controlador. O puede "
                                + "ser que no se acabe mostrando el mensaje adecuado por la "
                                + "consola del sistema.");
                toThrow = toThrow(error, toThrow);
            }
            
            this.printlnAlways("Test5-3: comprobar que se invoca método "
                    + "anyadirMarcaEnEventoDeUnAtleta() de clase Controlador. "
                    + "Además, se muestra el mensaje adecuado por la consola si "
                    + "devuelve el código de error TIPO_DE_EVENTO_ERRONEO.\n");
            
            try
            {
                String[] args = {"am","1","-1","0"};
                instance.anyadirMarcaEnEventoDeUnAtleta(args);
                Mockito.verify(this.mockControlador).anyadirMarcaEnEventoDeUnAtleta(-1, 0, 0);
                Mockito.verify(this.mockPrintStream).println(InterficieUsuario.TIPO_DE_EVENTO_ERRONEO_STR);
                error = this.sAssertTrue(true, 0.25 * valorTotal, ""); 
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::anyadirMarcaEnEventoDeUnAtleta() parece "
                                + "no invocar el método adecuado de la clase Controlador. O puede "
                                + "ser que no se acabe mostrando el mensaje adecuado por la "
                                + "consola del sistema.");
                toThrow = toThrow(error, toThrow);
            }
            
            this.printlnAlways("Test5-4:  comprobar que se invoca método "
                    + "anyadirMarcaEnEventoDeUnAtleta() de clase Controlador. "
                    + "Además, se muestra el mensaje adecuado por la consola si "
                    + "devuelve el código RESULTADO_OK.\n");
            
            try
            {
                String[] args = {"am","1","0","12.25"};
                instance.anyadirMarcaEnEventoDeUnAtleta(args);
                Mockito.verify(this.mockControlador).anyadirMarcaEnEventoDeUnAtleta(1, 0, 12.25);
                Mockito.verify(this.mockPrintStream).println(InterficieUsuario.MARCA_ANYADIDA_STR);
                error = this.sAssertTrue(true, 0.25 * valorTotal, ""); 
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::anyadirMarcaEnEventoDeUnAtleta() parece "
                                + "no invocar el método adecuado de la clase Controlador. O puede "
                                + "ser que no se acabe mostrando el mensaje adecuado por la "
                                + "consola del sistema.");
                toThrow = toThrow(error, toThrow);
            }

            toThrow = toThrow(error, toThrow);
        }
        catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        this.acumula(puntos);
        puntos(puntosAntes);
        throwIfAnError(toThrow); 
    }
    
    /**
     * Test of mostrarClasificacion method, of class InterficieUsuario.
     */
    @Test
    public void test06_mostrarClasificacion()
    {
        double valorTotal = 2.0;
        AssertionError toThrow = null;
        AssertionError error = null;
        double puntosAntes = puntosTotales;

        this.printlnAlways("\nInterficieUsuario::"
                + "mostrarClasificacion(...). Valor: " + valorTotal + "\n");
        
        try {
            
            Field field = InterficieUsuario.class.getDeclaredField("testing");
            field.setAccessible(true);
            field.setBoolean(null, true);
            InterficieUsuario instance = new InterficieUsuario();
            
            this.setPrivateField(instance, "controlador", this.mockControlador);
            Mockito.spy(this.mockControlador);
            
            this.printlnAlways("Test6-1: comprobar que se invoca a "
                    + "método getClasificacion() de clase Controlador, "
                    + "pasándole el valor adecuado como parámetro.\n");
            
            try
            {
                String[] args = {"mc","3"};
                instance.mostrarClasificacion(args);
                Mockito.verify(this.mockControlador).getClasificacion(3);
                error = this.sAssertTrue(true, 0.5 * valorTotal, ""); 
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::mostrarClasificacion() parece "
                                + "no invocar el método adecuado de la clase "
                                + "Controlador o pasarle el valor adecuado como parámetro.");
                toThrow = toThrow(error, toThrow);
            }
            
            this.printlnAlways("Test6-2: comprobar que se muestra por la consola "
                    + "la iformación que devuelve el método getClasificacion() de "
                    + "clase Controlador.\n");
            
            instance = new InterficieUsuario();
            this.setPrivateField(instance, "console", this.mockPrintStream);
            Mockito.spy(this.mockPrintStream);
            
            try
            {
                String[] args = {"mc","3"};
                instance.mostrarClasificacion(args);
                Mockito.verify(this.mockPrintStream).println("1 ALG Larbi Bourrada\n" +
                                                             "2 KAZ Dmitriy Karpov\n" +
                                                             "3 FRA Kevin Mayer\n");
                error = this.sAssertTrue(true, 0.5 * valorTotal, ""); 
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::mostrarClasificacion() parece "
                                + "no invocar el método adecuado de la clase "
                                + "Controlador o pasarle el valor adecuado como parámetro.");
                toThrow = toThrow(error, toThrow);
            }
            
            toThrow = toThrow(error, toThrow);
        }
        catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        this.acumula(puntos);
        puntos(puntosAntes);
        throwIfAnError(toThrow); 
    }
    
    /**
     * Test of ejecutaComando method, of class InterficieUsuario.
     */
    @Test
    public void test07_ejecutaComando()
    {
        double valorTotal = 2.0;
        AssertionError toThrow = null;
        AssertionError error = null;
        double puntosAntes = puntosTotales;

        this.printlnAlways("\nInterficieUsuario::"
                + "ejecutaComando(...). Valor: " + valorTotal + "\n");
        
        this.printlnAlways("Test7-1: comprobar que el método detecta "
                    + "adecuadamente algunos comandos incorrectos.\n");
        
        try {
            
            Field field = InterficieUsuario.class.getDeclaredField("testing");
            field.setAccessible(true);
            field.setBoolean(null, true);
            InterficieUsuario instance = new InterficieUsuario();
            
            this.setPrivateField(instance, "console", this.mockPrintStream);
            this.setPrivateField(instance, "controlador", this.mockControlador);
            Mockito.spy(this.mockPrintStream);
            Mockito.spy(this.mockControlador);
            
            try
            {
                instance.ejecutaComando("");            //Entrada vacía, ergo comando erróneo
                Mockito.verify(this.mockPrintStream).println(InterficieUsuario.CMD_ERRONEO_STR);
                error = this.sAssertTrue(true, 0.05 * valorTotal, "");
                Mockito.reset(this.mockPrintStream);
                instance.ejecutaComando("¡hola!");        //Comando erróneo
                Mockito.verify(this.mockPrintStream).println(InterficieUsuario.CMD_ERRONEO_STR);
                error = this.sAssertTrue(true, 0.05 * valorTotal, "");
                Mockito.reset(this.mockPrintStream);
                instance.ejecutaComando("hola:¡hola!");   //Comando erróneo
                Mockito.verify(this.mockPrintStream).println(InterficieUsuario.CMD_ERRONEO_STR);
                error = this.sAssertTrue(true, 0.05 * valorTotal, "");
                Mockito.reset(this.mockPrintStream);
                instance.ejecutaComando("ia:nombre");   //Comando erróneo: falta argumento
                Mockito.verify(this.mockPrintStream).println(InterficieUsuario.CMD_ERRONEO_STR);
                error = this.sAssertTrue(true, 0.05 * valorTotal, "");
                Mockito.reset(this.mockPrintStream);
                instance.ejecutaComando("ia:nombre:nacionalidad:¡hola!"); //Comando erróneo: sobra argumento
                Mockito.verify(this.mockPrintStream).println(InterficieUsuario.CMD_ERRONEO_STR);
                error = this.sAssertTrue(true, 0.05 * valorTotal, ""); 
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::ejecutaComando() parece "
                                + "no detectar e indicar como erróneo el comando introducido");
                toThrow = toThrow(error, toThrow);
            }

            this.printlnAlways("Test7-2: comprobar que el comando ia acaba invocando el "
                    + "método adecuado de la clase Controlador, pasándole los valores "
                    + "correctos como parámetro.\n");
            
            try
            {
                instance.ejecutaComando("ia:nombre:nacionalidad");
                Mockito.verify(this.mockControlador).inscribirAtleta("nombre","nacionalidad");
                error = this.sAssertTrue(true, 0.15 * valorTotal, ""); 
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::ejecutaComando() parece "
                                + "no invocar el método adecuado de la clase "
                                + "Controlador al introduir el comando ia:nombre:nacionalidad");
                toThrow = toThrow(error, toThrow);
            }
            
            this.printlnAlways("Test7-3: comprobar que el comando mc acaba invocando el "
                    + "método adecuado de la clase Controlador, pasándole los valores "
                    + "correctos como parámetro.\n");
            
            try
            {
                instance.ejecutaComando("mc");
                Mockito.verify(this.mockControlador).getInfoCompeticion();
                error = this.sAssertTrue(true, 0.15 * valorTotal, "");
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::ejecutaComando() parece "
                                + "no invocar el método adecuado de la clase "
                                + "Controlador al introduir el comando mc");
                toThrow = toThrow(error, toThrow);
            }
            
            this.printlnAlways("Test7-4: comprobar que el comando ma acaba invocando el "
                    + "método adecuado de la clase Controlador, pasándole los valores "
                    + "correctos como parámetro.\n");
            
            try
            {
                instance.ejecutaComando("ma:12");
                Mockito.verify(this.mockControlador).getInfoAtleta(12);
                error = this.sAssertTrue(true, 0.15 * valorTotal, "");
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::ejecutaComando() parece "
                                + "no invocar el método adecuado de la clase "
                                + "Controlador al introduir el comando ma:12");
                toThrow = toThrow(error, toThrow);
            }
            
            this.printlnAlways("Test7-5: comprobar que el comando am acaba invocando el "
                    + "método adecuado de la clase Controlador, pasándole los valores "
                    + "correctos como parámetro.\n");
            
            try
            {
                instance.ejecutaComando("am:0:1:16.79");
                Mockito.verify(this.mockControlador).anyadirMarcaEnEventoDeUnAtleta(0, 1, 16.79);
                error = this.sAssertTrue(true, 0.15 * valorTotal, "");
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::ejecutaComando() parece "
                                + "no invocar el método adecuado de la clase "
                                + "Controlador al introduir el comando am:0:1:16.79");
                toThrow = toThrow(error, toThrow);
            }
            
            try
            {
                instance.ejecutaComando("cl:3");
                Mockito.verify(this.mockControlador).getClasificacion(3);
                error = this.sAssertTrue(true, 0.15 * valorTotal, "");
            }
            catch (WantedButNotInvoked ex)
            {
                error = this.sAssertTrue(false, 0,
                        "\nEl método InterficieUsuario::ejecutaComando() parece "
                                + "no invocar el método adecuado de la clase "
                                + "Controlador al introduir el comando cl:3");
                toThrow = toThrow(error, toThrow);
            }
            
            toThrow = toThrow(error, toThrow);
        }
        catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }

        this.acumula(puntos);
        puntos(puntosAntes);
        throwIfAnError(toThrow); 
    }    
}
