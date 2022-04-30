package edu.upc.etsetb.poo.decathlon1;

import edu.upc.ac.corrector.AccreditedSuperClassForTests;
import edu.upc.ac.corrector.SuperClassForTests;
import edu.upc.etsetb.poo.corrector.TestAll;
import edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.A;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.B;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.C;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.CALCULO_EVENTO_KO_MARCA_NEGATIVA;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.CIEN_METROS;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.CUATROCIENTOS_METROS;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.LAZAMIENTO_DE_PESO;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.PARAM;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.SALTO_DE_ALTURA;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.SALTO_DE_LONGITUD;
import static edu.upc.etsetb.poo.decathlon1.dominio.MarcaEnEvento.getUnidadMarcaEnEvento;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Juan Carlos Cruellas at Universidad Politécnica de Cataluña
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(MockitoJUnitRunner.class)
public class MarcaEnEventoTest extends AccreditedSuperClassForTests {

    private static int numErrorsBefore;

    private static int numInstances = 0;

    private static Map<String, Double> nota;

    public MarcaEnEventoTest() {
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
        showErrors(indErrors, "MarcaEnEvento");
        nota.put("MarcaEnEvento", puntosTotales);
        puntosTotales = 0;
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test01_Constructor(){
        //PONER EN TODOS: ES EL VALOR DEL MÉTODO QUE SE PRUEBA
        double valorTotal = 2; //¡¡¡¡¡ CAMBIAR !!!!!
        //PONER EN TODOS: PARA GESTIONAR LOS ERRORES
        AssertionError toThrow = null;
        AssertionError error = null;
        //PONER EN TODOS: SON LOS PUNTOS ASIGNADOS ANTES DE EJECUTAR ESTE TEST
        double puntosAntes = puntosTotales;
        //PONER EN TODOS: UN MENSAJE QUE DIGA QUÉ MÉTODO SE PRUEBA Y
        //QUÉ VALOR TIENE
        this.printlnAlways("\nMarcaEnEvento::"
                + "MarcaEnEvento(...). Valor: " + valorTotal);
        //
        //AQUÍ COMIENZAN LAS TAREAS DE PRUEBA PROPIAMENTE DICHAS
        //
        // HAY QUE ENCAPSULAR CADA PRUEBA EN UN TRY-CATCH QUE CAPTURE
        // EXCEPCIONES LANZADAS POR EL CÓDIGO DE LOS ESTUDIANTES

        MarcaEnEvento instance = null;
        int evento = MarcaEnEvento.CUATROCIENTOS_METROS;
        double marca = 1.3;
        
        int nTests = 6;
        
        try {
            instance = new MarcaEnEvento(evento,marca);
            this.checkAttributeAfterConstructor(instance, "evento", evento,
                    valorTotal, 1.0/nTests, 1.0/nTests, 1);
            this.checkAttributeAfterConstructor(instance, "marca", marca,
                    valorTotal, 1.0/nTests, 1.0/nTests, 3);
            this.checkAttributeAfterConstructor(instance, "puntos", 0,
                    valorTotal, 1.0/nTests, 1.0/nTests, 5);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        //DESPUÉS DE TODAS LAS PRUEBAS AÑADIR SIEMPRE PARA ACUMULAR LOS PUNTOS
        this.acumula(puntos);
        //AÑADIR SIEMPRE PARA MOSTRAR LOS PUNTOS OBTENIDOS Y LOS ACUMULADOS 
        //EN LA CLASE
        puntos(puntosAntes);
        //AÑADIR SIEMPRE PARA ENCADENAR MENSAJES DE ERROR
        throwIfAnError(toThrow);        
    }

    /**
     * Test of getPuntos method, of class MarcaEnEvento.
     */
    @Test
    public void test02_GetPuntos() {
        //PONER EN TODOS: ES EL VALOR DEL MÉTODO QUE SE PRUEBA
        double valorTotal = 1; //¡¡¡¡¡ CAMBIAR !!!!!
        //PONER EN TODOS: PARA GESTIONAR LOS ERRORES
        AssertionError toThrow = null;
        AssertionError error = null;
        //PONER EN TODOS: SON LOS PUNTOS ASIGNADOS ANTES DE EJECUTAR ESTE TEST
        double puntosAntes = puntosTotales;
        //PONER EN TODOS: UN MENSAJE QUE DIGA QUÉ MÉTODO SE PRUEBA Y
        //QUÉ VALOR TIENE
        this.printlnAlways("\nMarcaEnEvento::getPuntos(...). Valor: " + valorTotal);
        //
        //AQUÍ COMIENZAN LAS TAREAS DE PRUEBA PROPIAMENTE DICHAS
        //
        // HAY QUE ENCAPSULAR CADA PRUEBA EN UN TRY-CATCH QUE CAPTURE
        // EXCEPCIONES LANZADAS POR EL CÓDIGO DE LOS ESTUDIANTES
        MarcaEnEvento instance = null;
        int evento = MarcaEnEvento.CUATROCIENTOS_METROS;
        double marca = 1.3;
        
        int nTests = 1;
        
        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone comprobado
            int returned = instance.getPuntos();
            error = this.sAssertEquals(returned,0,valorTotal*1.0/nTests,"getPunos() debe devolver"
                    + "los puntos");
            toThrow = toThrow(error, toThrow);

        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        //DESPUÉS DE TODAS LAS PRUEBAS AÑADIR SIEMPRE PARA ACUMULAR LOS PUNTOS
        this.acumula(puntos);
        //AÑADIR SIEMPRE PARA MOSTRAR LOS PUNTOS OBTENIDOS Y LOS ACUMULADOS 
        //EN LA CLASE
        puntos(puntosAntes);
        //AÑADIR SIEMPRE PARA ENCADENAR MENSAJES DE ERROR
        throwIfAnError(toThrow);        
    }

    /**
     * Test of calcularPuntosEvento method, of class MarcaEnEvento.
     */
    @Test
    public void test03_CalcularPuntosEvento() {
        //PONER EN TODOS: ES EL VALOR DEL MÉTODO QUE SE PRUEBA
        double valorTotal = 2; //¡¡¡¡¡ CAMBIAR !!!!!
        //PONER EN TODOS: PARA GESTIONAR LOS ERRORES
        AssertionError toThrow = null;
        AssertionError error = null;
        //PONER EN TODOS: SON LOS PUNTOS ASIGNADOS ANTES DE EJECUTAR ESTE TEST
        double puntosAntes = puntosTotales;
        //PONER EN TODOS: UN MENSAJE QUE DIGA QUÉ MÉTODO SE PRUEBA Y
        //QUÉ VALOR TIENE
        this.printlnAlways("\nMarcaEnEvento::calcularPuntosEvento(...). Valor: " + valorTotal);
        //
        //AQUÍ COMIENZAN LAS TAREAS DE PRUEBA PROPIAMENTE DICHAS
        //
        // HAY QUE ENCAPSULAR CADA PRUEBA EN UN TRY-CATCH QUE CAPTURE
        // EXCEPCIONES LANZADAS POR EL CÓDIGO DE LOS ESTUDIANTES

        int nTests=11;
        
        MarcaEnEvento instance = null;
        int evento = MarcaEnEvento.CUATROCIENTOS_METROS;
        double marca = - 1.3;

        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone comprobado
            int returned = instance.calcularPuntosEvento();
            error = this.sAssertEquals(MarcaEnEvento.CALCULO_EVENTO_KO_MARCA_NEGATIVA,returned,valorTotal*1.0/nTests,"Si la marca es negativa"
                    + " debe devolver "+ MarcaEnEvento.CALCULO_EVENTO_KO_MARCA_NEGATIVA + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        instance = null;
        evento = MarcaEnEvento.CIEN_METROS;
        marca = 16;

        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone comprobado
            int returned = instance.calcularPuntosEvento();
            error = this.sAssertEquals(MarcaEnEvento.CALCULO_EVENTO_OK,returned,valorTotal*1.0/nTests,
                    "Debe devolver "+ MarcaEnEvento.CALCULO_EVENTO_OK + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
            int puntosOk = (int) (PARAM[evento][A]
                        * Math.pow((PARAM[evento][B] - marca), PARAM[evento][C]));
            int puntosReturned = instance.getPuntos();
            error = this.sAssertEquals(puntosOk,puntosReturned,valorTotal*1.0/nTests,"En Cien Metros, si la marca es "
                    + marca + " debe calcular "+ puntosOk + " puntos  en lugar de "+ puntosReturned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        instance = null;
        evento = MarcaEnEvento.CUATROCIENTOS_METROS;
        marca = 80;

        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone comprobado
            int returned = instance.calcularPuntosEvento();
            error = this.sAssertEquals(MarcaEnEvento.CALCULO_EVENTO_OK,returned,valorTotal*1.0/nTests,
                    "Debe devolver "+ MarcaEnEvento.CALCULO_EVENTO_OK + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
            int puntosOk = (int) (PARAM[evento][A]
                        * Math.pow((PARAM[evento][B] - marca), PARAM[evento][C]));
            int puntosReturned = instance.getPuntos(); // Se supone comprobado
            error = this.sAssertEquals(puntosOk,puntosReturned,valorTotal*1.0/nTests,"En Cuatrocientos Metros, si la marca es "
                    + marca + " debe calcular "+ puntosOk + " puntos  en lugar de "+ puntosReturned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        instance = null;
        evento = MarcaEnEvento.SALTO_DE_LONGITUD;
        marca = 250;

        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone comprobado
            int returned = instance.calcularPuntosEvento();
            error = this.sAssertEquals(MarcaEnEvento.CALCULO_EVENTO_OK,returned,valorTotal*1.0/nTests,
                    "Debe devolver "+ MarcaEnEvento.CALCULO_EVENTO_OK + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
            int puntosOk = (int) (PARAM[evento][A]
                        * Math.pow((marca - PARAM[evento][B]), PARAM[evento][C]));
            int puntosReturned = instance.getPuntos(); // Se supone comprobado
            error = this.sAssertEquals(puntosOk,puntosReturned,valorTotal*1.0/nTests,"En Salto de Longitud, si la marca es "
                    + marca + " debe calcular "+ puntosOk + " puntos  en lugar de "+ puntosReturned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        instance = null;
        evento = MarcaEnEvento.LAZAMIENTO_DE_PESO;
        marca = 1.6;

        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone comprobado
            int returned = instance.calcularPuntosEvento();
            error = this.sAssertEquals(MarcaEnEvento.CALCULO_EVENTO_OK,returned,valorTotal*1.0/nTests,
                    "Debe devolver "+ MarcaEnEvento.CALCULO_EVENTO_OK + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
            int puntosOk = (int) (PARAM[evento][A]
                        * Math.pow((marca - PARAM[evento][B]), PARAM[evento][C]));
            int puntosReturned = instance.getPuntos(); // Se supone comprobado
            error = this.sAssertEquals(puntosOk,puntosReturned,valorTotal*1.0/nTests,"En Lanzamiento de Peso, si la marca es "
                    + marca + " debe calcular "+ puntosOk + " puntos  en lugar de "+ puntosReturned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        instance = null;
        evento = MarcaEnEvento.SALTO_DE_ALTURA;
        marca = 80;

        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone comprobado
            int returned = instance.calcularPuntosEvento();
            error = this.sAssertEquals(MarcaEnEvento.CALCULO_EVENTO_OK,returned,valorTotal*1.0/nTests,
                    "Debe devolver "+ MarcaEnEvento.CALCULO_EVENTO_OK + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
            int puntosOk = (int) (PARAM[evento][A]
                        * Math.pow((marca - PARAM[evento][B]), PARAM[evento][C]));
            int puntosReturned = instance.getPuntos(); // Se supone comprobado
            error = this.sAssertEquals(puntosOk,puntosReturned,valorTotal*1.0/nTests,"En Salto de Altura, si la marca es "
                    + marca + " debe calcular "+ puntosOk + " puntos  en lugar de "+ puntosReturned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        //DESPUÉS DE TODAS LAS PRUEBAS AÑADIR SIEMPRE PARA ACUMULAR LOS PUNTOS
        this.acumula(puntos);
        //AÑADIR SIEMPRE PARA MOSTRAR LOS PUNTOS OBTENIDOS Y LOS ACUMULADOS 
        //EN LA CLASE
        puntos(puntosAntes);
        //AÑADIR SIEMPRE PARA ENCADENAR MENSAJES DE ERROR
        throwIfAnError(toThrow);        
    }
    
    /**
     * Test of getUnidadMarcaEnEvento method, of class MarcaEnEvento.
     */
    @Test
    public void test04_getUnidadMarcaEnEvento() {
        //PONER EN TODOS: ES EL VALOR DEL MÉTODO QUE SE PRUEBA
        double valorTotal = 1; //¡¡¡¡¡ CAMBIAR !!!!!
        //PONER EN TODOS: PARA GESTIONAR LOS ERRORES
        AssertionError toThrow = null;
        AssertionError error = null;
        //PONER EN TODOS: SON LOS PUNTOS ASIGNADOS ANTES DE EJECUTAR ESTE TEST
        double puntosAntes = puntosTotales;
        //PONER EN TODOS: UN MENSAJE QUE DIGA QUÉ MÉTODO SE PRUEBA Y
        //QUÉ VALOR TIENE
        this.printlnAlways("\nMarcaEnEvento::getUnidadMarcaEnEvento(...). Valor: " + valorTotal);
        //
        //AQUÍ COMIENZAN LAS TAREAS DE PRUEBA PROPIAMENTE DICHAS
        //
        // HAY QUE ENCAPSULAR CADA PRUEBA EN UN TRY-CATCH QUE CAPTURE
        // EXCEPCIONES LANZADAS POR EL CÓDIGO DE LOS ESTUDIANTES
        
        int nTests = 5;
        
        int evento = MarcaEnEvento.SALTO_DE_ALTURA;

        try {
            String returned = MarcaEnEvento.getUnidadMarcaEnEvento(evento);
            error = this.sAssertEquals("centimetros",returned,valorTotal*1.0/nTests,"En Salto de Altura "
                    + "debe devolver "+ "centimetros" + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        evento = MarcaEnEvento.SALTO_DE_LONGITUD;

        try {
            String returned = MarcaEnEvento.getUnidadMarcaEnEvento(evento);
            error = this.sAssertEquals("centimetros",returned,valorTotal*1.0/nTests,"En Salto de Longitud "
                    + "debe devolver "+ "centimetros" + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        evento = MarcaEnEvento.LAZAMIENTO_DE_PESO;

        try {
            String returned = MarcaEnEvento.getUnidadMarcaEnEvento(evento);
            error = this.sAssertEquals("metros",returned,valorTotal*1.0/nTests,"En Lanzamiento de Peso "
                    + "debe devolver "+ "metros" + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        evento = MarcaEnEvento.CIEN_METROS;

        try {
            String returned = MarcaEnEvento.getUnidadMarcaEnEvento(evento);
            error = this.sAssertEquals("segundos",returned,valorTotal*1.0/nTests,"En Cien Metros "
                    +"debe devolver "+ "segundos" + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        evento = MarcaEnEvento.CUATROCIENTOS_METROS;

        try {
            String returned = MarcaEnEvento.getUnidadMarcaEnEvento(evento);
            error = this.sAssertEquals("segundos",returned,valorTotal*1.0/nTests,"En Cuatrocientos Metros "
                    + "debe devolver "+ "segundos" + " en lugar de "+returned);
            toThrow = toThrow(error, toThrow);
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        //DESPUÉS DE TODAS LAS PRUEBAS AÑADIR SIEMPRE PARA ACUMULAR LOS PUNTOS
        this.acumula(puntos);
        //AÑADIR SIEMPRE PARA MOSTRAR LOS PUNTOS OBTENIDOS Y LOS ACUMULADOS 
        //EN LA CLASE
        puntos(puntosAntes);
        //AÑADIR SIEMPRE PARA ENCADENAR MENSAJES DE ERROR
        throwIfAnError(toThrow);        
    }

    private static String trimAll(String original){
        StringBuilder trimmed = new StringBuilder(original);
        int nChars = trimmed.length();
        int j=0;
        for (int i=0;i<nChars;i++){
            char c=trimmed.charAt(j);
            if(c==' '||c=='\n'||c=='\t'){
                trimmed.deleteCharAt(j);
            }
            else j++;
        }
        return trimmed.toString().toLowerCase();
    }
    
    /**
     * Test of getListaEventos method, of class MarcaEnEvento.
     */
    @Test
    public void test05_getListaEventos() {
        //PONER EN TODOS: ES EL VALOR DEL MÉTODO QUE SE PRUEBA
        double valorTotal = 2; //¡¡¡¡¡ CAMBIAR !!!!!
        //PONER EN TODOS: PARA GESTIONAR LOS ERRORES
        AssertionError toThrow = null;
        AssertionError error = null;
        //PONER EN TODOS: SON LOS PUNTOS ASIGNADOS ANTES DE EJECUTAR ESTE TEST
        double puntosAntes = puntosTotales;
        //PONER EN TODOS: UN MENSAJE QUE DIGA QUÉ MÉTODO SE PRUEBA Y
        //QUÉ VALOR TIENE
        this.printlnAlways("\nMarcaEnEvento::getListaEventos(...). Valor: " + valorTotal);
        //
        //AQUÍ COMIENZAN LAS TAREAS DE PRUEBA PROPIAMENTE DICHAS
        //
        // HAY QUE ENCAPSULAR CADA PRUEBA EN UN TRY-CATCH QUE CAPTURE
        // EXCEPCIONES LANZADAS POR EL CÓDIGO DE LOS ESTUDIANTES
        int nTests = 1;
        try {
            String returned = MarcaEnEvento.getListaEventos();
            String correct = "Lista de eventos:\n" +
"[0]    100 metros lisos	[1]    Salto de longitud	[2]    Lanzamiento de peso	[3]    Salto de altura	[4]    400 metros lisos\n";
            String returnedTrimmed = trimAll(returned);
            String correctTrimmed = trimAll(correct);
            boolean ok = returnedTrimmed.equals(correctTrimmed);
            if (ok){
                error = this.sAssertTrue(true,valorTotal*1.0/nTests,"");
            }
            else {
                String msg = "Expected String:\n"+correct+
                        "\nYour method returned:\n"+returned;
                error = this.sAssertTrue(false,0,msg);
                toThrow = toThrow(error, toThrow);
            }
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        //DESPUÉS DE TODAS LAS PRUEBAS AÑADIR SIEMPRE PARA ACUMULAR LOS PUNTOS
        this.acumula(puntos);
        //AÑADIR SIEMPRE PARA MOSTRAR LOS PUNTOS OBTENIDOS Y LOS ACUMULADOS 
        //EN LA CLASE
        puntos(puntosAntes);
        //AÑADIR SIEMPRE PARA ENCADENAR MENSAJES DE ERROR
        throwIfAnError(toThrow);        
    }

    /**
     * Test of toString method, of class MarcaEnEvento.
     */
    @Test
    public void test06_toString() {
        //PONER EN TODOS: ES EL VALOR DEL MÉTODO QUE SE PRUEBA
        double valorTotal = 2; //¡¡¡¡¡ CAMBIAR !!!!!
        //PONER EN TODOS: PARA GESTIONAR LOS ERRORES
        AssertionError toThrow = null;
        AssertionError error = null;
        //PONER EN TODOS: SON LOS PUNTOS ASIGNADOS ANTES DE EJECUTAR ESTE TEST
        double puntosAntes = puntosTotales;
        //PONER EN TODOS: UN MENSAJE QUE DIGA QUÉ MÉTODO SE PRUEBA Y
        //QUÉ VALOR TIENE
        this.printlnAlways("\nMarcaEnEvento::toString(...). Valor: " + valorTotal);
        //
        //AQUÍ COMIENZAN LAS TAREAS DE PRUEBA PROPIAMENTE DICHAS
        //
        // HAY QUE ENCAPSULAR CADA PRUEBA EN UN TRY-CATCH QUE CAPTURE
        // EXCEPCIONES LANZADAS POR EL CÓDIGO DE LOS ESTUDIANTES
        
        int nTests=5;
        
        MarcaEnEvento instance = null;
        int evento = MarcaEnEvento.CIEN_METROS;
        double marca = 16;
        int puntosMarca = 0;
        
        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone testeado
            instance.calcularPuntosEvento(); // idem
            puntosMarca = instance.getPuntos(); // idem
            String correct = "100 metros lisos:     marca=16.0 segundos, puntos=89\n";
            String returned = instance.toString();
            String returnedTrimmed = trimAll(returned);
            String correctTrimmed = trimAll(correct);
            boolean ok = returnedTrimmed.equals(correctTrimmed);
            if (ok){
                error = this.sAssertTrue(true,valorTotal*1.0/nTests,"");
            }
            else {
                String msg = "Expected String (Cien Metros, marca = "+marca+"):\n"+correct+
                        "\nYour method returned:\n"+returned;
                error = this.sAssertTrue(false,0,msg);
                toThrow = toThrow(error, toThrow);
            }
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }
        
        instance = null;
        evento = MarcaEnEvento.CUATROCIENTOS_METROS;
        marca = 80;

        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone testeado
            instance.calcularPuntosEvento(); // idem
            puntosMarca = instance.getPuntos(); // idem
            String correct = "400 metros lisos:     marca=80.0 segundos, puntos=5\n";
            String returned = instance.toString();
            String returnedTrimmed = trimAll(returned);
            String correctTrimmed = trimAll(correct);
            boolean ok = returnedTrimmed.equals(correctTrimmed);
            if (ok){
                error = this.sAssertTrue(true,valorTotal*1.0/nTests,"");
            }
            else {
                String msg = "Expected String (Cien Metros, marca = "+marca+"):\n"+correct+
                        "\nYour method returned:\n"+returned;
                error = this.sAssertTrue(false,0,msg);
                toThrow = toThrow(error, toThrow);
            }
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }

        instance = null;
        evento = MarcaEnEvento.SALTO_DE_LONGITUD;
        marca = 250;
        
        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone testeado
            instance.calcularPuntosEvento(); // idem
            puntosMarca = instance.getPuntos(); // idem
            String correct = "Salto de longitud:    marca=250.0 centimetros, puntos=16\n";
            String returned = instance.toString();
            String returnedTrimmed = trimAll(returned);
            String correctTrimmed = trimAll(correct);
            boolean ok = returnedTrimmed.equals(correctTrimmed);
            if (ok){
                error = this.sAssertTrue(true,valorTotal*1.0/nTests,"");
            }
            else {
                String msg = "Expected String (Cien Metros, marca = "+marca+"):\n"+correct+
                        "\nYour method returned:\n"+returned;
                error = this.sAssertTrue(false,0,msg);
                toThrow = toThrow(error, toThrow);
            }
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }

        instance = null;
        evento = MarcaEnEvento.LAZAMIENTO_DE_PESO;
        marca = 1.6;

        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone testeado
            instance.calcularPuntosEvento(); // idem
            puntosMarca = instance.getPuntos(); // idem
            String correct = "Lanzamiento de peso:  marca=1.6 metros, puntos=4\n";
            String returned = instance.toString();
            String returnedTrimmed = trimAll(returned);
            String correctTrimmed = trimAll(correct);
            boolean ok = returnedTrimmed.equals(correctTrimmed);
            if (ok){
                error = this.sAssertTrue(true,valorTotal*1.0/nTests,"");
            }
            else {
                String msg = "Expected String (Cien Metros, marca = "+marca+"):\n"+correct+
                        "\nYour method returned:\n"+returned;
                error = this.sAssertTrue(false,0,msg);
                toThrow = toThrow(error, toThrow);
            }
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }

        instance = null;
        evento = MarcaEnEvento.SALTO_DE_ALTURA;
        marca = 80;

        try {
            instance = new MarcaEnEvento(evento,marca); // Se supone testeado
            instance.calcularPuntosEvento(); // idem
            puntosMarca = instance.getPuntos(); // idem
            String correct = "Salto de altura:      marca=80.0 centimetros, puntos=8\n";
            String returned = instance.toString();
            String returnedTrimmed = trimAll(returned);
            String correctTrimmed = trimAll(correct);
            boolean ok = returnedTrimmed.equals(correctTrimmed);
            if (ok){
                error = this.sAssertTrue(true,valorTotal*1.0/nTests,"");
            }
            else {
                String msg = "Expected String (Cien Metros, marca = "+marca+"):\n"+correct+
                        "\nYour method returned:\n"+returned;
                error = this.sAssertTrue(false,0,msg);
                toThrow = toThrow(error, toThrow);
            }
        } catch (Exception ex) {
            this.printlnAlways("*** Se ha capturado una excepción que probablemente "
                    + "ha sido lanzada por tu código. Mira la traza para "
                    + "detectar en qué punto ha sido creada y lanzada...");
            System.out.println(ex.getStackTrace()[0].toString() + "\n" + ex.getMessage());
        }

        //DESPUÉS DE TODAS LAS PRUEBAS AÑADIR SIEMPRE PARA ACUMULAR LOS PUNTOS
        this.acumula(puntos);
        //AÑADIR SIEMPRE PARA MOSTRAR LOS PUNTOS OBTENIDOS Y LOS ACUMULADOS 
        //EN LA CLASE
        puntos(puntosAntes);
        //AÑADIR SIEMPRE PARA ENCADENAR MENSAJES DE ERROR
        throwIfAnError(toThrow);        
    }
    
}
