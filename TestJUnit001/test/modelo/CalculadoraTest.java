/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ANDROID
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora instance = new Calculadora(8, 2);
        int expResult = 10;
        int result = instance.Sumar();
        assertTrue(instance.Sumar()==10);
    }

    /**
     * Test of Restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        Calculadora instance = new Calculadora(8, 2);
        int expResult = 6;
        int result = instance.Restar();
        assertTrue(instance.Restar()==6);
    }

    /**
     * Test of Multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        Calculadora instance = new Calculadora(8, 2);
        int expResult = 16;
        int result = instance.Multiplicar();
        assertTrue(instance.Multiplicar()==16);
    }

    /**
     * Test of Dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        Calculadora instance = new Calculadora(8, 2);
        int expResult = 4;
        int result = instance.Dividir();
        assertTrue(instance.Dividir()==4);
    }
    
}
