/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fieo.gouttesdeluxe.unit.model;

import br.com.fieo.gouttesdeluxe.model.Perfume;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juliana
 */
public class PerfumeTest {

    public PerfumeTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getImage method, of class Perfume.
     */
    @Test
    public void testGetImage() {

    }

    /**
     * Test of setImage method, of class Perfume.
     */
    @Test
    public void testSetImage() {

    }

    /**
     * Test of getName method, of class Perfume.
     */
    @Test
    public void testGetName() {

    }

    /**
     * Test of setName method, of class Perfume.
     */
    @Test
    public void testSetName() {

        try{
            System.out.println("Adicionando um nome vazio a classe Perfume");
            String name = "";
            Perfume p = new Perfume();
            p.setName(name);
            fail("Adicionou um nome vazio");
        }catch(Exception e){
            assertEquals("nome vazio", e.getMessage());
        }

        try{
            System.out.println("Adicionando um nome com mais de 100 caracteres a classe Perfume");
            String name = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
            Perfume p = new Perfume();
            p.setName(name);
            fail("Adicionou um nome com mais de 100 caracteres");
        }catch(Exception e){
            assertEquals("nome maior que 100 caracteres", e.getMessage());
        }
        
    }

    /**
     * Test of getValue method, of class Perfume.
     */
    @Test
    public void testGetValue() {
        /*
        System.out.println("getValue");
        Perfume instance = null;
        Float expResult = null;
        Float result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */
    }

    /**
     * Test of setValue method, of class Perfume.
     */
    @Test
    public void testSetValue() {

        System.out.println("Adicionando um valor a classe Perfume");
        Float value = 20f;
        Perfume p = new Perfume();
        p.setValue(value);
        assertEquals(p.getValue(), value);

   }

}