/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.corrector;

import edu.upc.etsetb.poo.decathlon1.AtletaTest;
import edu.upc.etsetb.poo.decathlon1.ClasificacionTest;
import edu.upc.etsetb.poo.decathlon1.CompeticionTest;
import edu.upc.etsetb.poo.decathlon1.casosdeuso.ControladorTest;
import edu.upc.etsetb.poo.decathlon1.MarcaEnEventoTest;
import edu.upc.etsetb.poo.decathlon1.iu.InterficieUsuarioTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author Juan Carlos Cruellas at Universidad Politécnica de Cataluña
 */
@RunWith(Suite.class)
@SuiteClasses({
    CompeticionTest.class,
    MarcaEnEventoTest.class,
    AtletaTest.class,
    ClasificacionTest.class,
    ControladorTest.class,
    InterficieUsuarioTest.class
})
public class TestSuite {

}
