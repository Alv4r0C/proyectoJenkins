/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tema1.actividad13;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author acast
 */
public class Actividad13Test {
    
    public Actividad13Test() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /**
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    */
    /**
     * Test of main method, of class Actividad13.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("dia_laboral_lunes");
        String dia = " ";
        boolean expResult = false;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /**fail("The test case is a prototype.");*/
    }
    
     @org.junit.jupiter.api.Test
    public void testMain2() {
        System.out.println("dia_laboral_martes");
        String dia = "Martes";
        boolean expResult = true;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /**fail("The test case is a prototype.");*/
    }
    
     @org.junit.jupiter.api.Test
    public void testMain3() {
        System.out.println("dia_laboral_miercoles");
        String dia = "98";
        boolean expResult = false;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /**fail("The test case is a prototype.");*/
    }
    
     @org.junit.jupiter.api.Test
    public void testMain4() {
        System.out.println("dia_laboral_jueves");
        String dia = "Jueves";
        boolean expResult = true;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /**fail("The test case is a prototype.");*/
    }
    
     @org.junit.jupiter.api.Test
    public void testMain5() {
        System.out.println("dia_laboral_viernes");
        String dia = "Viernes";
        boolean expResult = true;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /**fail("The test case is a prototype.");*/
    }
    
     @org.junit.jupiter.api.Test
    public void testMain6() {
        System.out.println("dia_no_laboral_sabado");
        String dia = "Sabado";
        boolean expResult = false;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /**fail("The test case is a prototype.");*/
    }
    
     @org.junit.jupiter.api.Test
    public void testMain7() {
        System.out.println("dia_no_laboral_domingo");
        String dia = "Domingo";
        boolean expResult = false;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /**fail("The test case is a prototype.");*/
    }
}

