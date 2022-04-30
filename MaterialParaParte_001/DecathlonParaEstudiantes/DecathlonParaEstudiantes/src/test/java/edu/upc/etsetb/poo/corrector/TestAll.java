/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.corrector;

import edu.upc.ac.corrector.SuperClassForTests;
import java.util.HashMap;
import java.util.Map;
import org.junit.rules.ErrorCollector;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author Juan Carlos Cruellas at Universidad Politécnica de Cataluña
 */
public class TestAll {
    /*
        CompeticionTest.class,
    MarcaEnEventoTest.class,
    AtletaTest.class,
    ClasificacionTest.class,
    ControladorTest.class,
    InterficieUsuarioTest.class

    */

    private static String[] clases = {
        "Competicion","MarcaEnEvento","Atleta",  
         "Clasificacion", "Controlador",
        "InterficieUsuario"};

    public static final double[] tantosPorCiento = {
        10, //Competicion
        20, //MarcaEnEvento
        15, //Atleta
        15, //Clasificación
        25, //Controlador
        15//InterficieUsuario
    };

    public static Map<String, Double> notas;
    public static Map<String, Double> porcentajes;

    public static ErrorCollector allCollector;

    static {
        notas = new HashMap<>();
        porcentajes = new HashMap<>();
        int i = -1;
        for (String className : clases) {
            i++;
            notas.put(className, 0.0);
            porcentajes.put(className, tantosPorCiento[i]);
        }
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);
        System.out.println("\n\nResumen de notas obtenidas en corrección automática:\n");
        double notaFinal = 0;
        double notaParcial;
        for (Map.Entry<String, Double> nota : notas.entrySet()) {
            String className = nota.getKey();
            notaParcial = nota.getValue() * porcentajes.get(className) / 100;
            notaFinal += notaParcial;
            System.out.println("Nota en clase " + className
                    + ": " + SuperClassForTests.withMathRound(nota.getValue(), 3) + " (Porcentaje en nota final: "
                    + porcentajes.get(className) + "%). Contribución a nota final: " + notaParcial);
        }
        System.out.println("\nNota final de corrección automática: " + SuperClassForTests.withMathRound(notaFinal, 3));
    }
}
