/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package GroupProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zeel
 */
public class HandClassTest {
    
    public HandClassTest() {
    }
    
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

    /**
     * Test of drawDeck method, of class HandClass.
     */
    @Test
    public void testDrawDeck() {
        System.out.println("drawDeck");
        Deck deck = null;
        Hand instance = new Hand();
        instance.drawDeck(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueHand method, of class HandClass.
     */
    @Test
    public void testGetValueHand() {
        System.out.println("getValueHand");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.getValueHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class HandClass.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int i = 0;
        Hand instance = new Hand();
        Cards expResult = null;
        Cards result = instance.getCard(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearHand method, of class HandClass.
     */
    @Test
    public void testClearHand() {
        System.out.println("clearHand");
        Hand instance = new Hand();
        instance.clearHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HandClass.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Hand instance = new Hand();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
