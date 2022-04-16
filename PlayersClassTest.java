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
public class PlayersClassTest {
    
    public PlayersClassTest() {
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
     * Test of blackJackGG method, of class PlayersClass.
     */
    @Test
    public void testBlackJackGG() {
        System.out.println("blackJackGG");
        Players instance = new Players() {};
        boolean expResult = false;
        boolean result = instance.blackJackGG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class PlayersClass.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        PlayersClassImpl instance = new PlayersClassImpl();
        Hand expResult = null;
        Hand result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHand method, of class PlayersClass.
     */
    @Test
    public void testSetHand() {
        System.out.println("setHand");
        Hand hand = null;
        PlayersClassImpl instance = new PlayersClassImpl();
        instance.setHand(hand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class PlayersClass.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Players instance = new PlayersClassImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class PlayersClass.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Players instance = new PlayersClassImpl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayHand method, of class PlayersClass.
     */
    @Test
    public void testDisplayHand() {
        System.out.println("displayHand");
        Players instance = new PlayersClassImpl();
        instance.displayHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PlayersClassImpl extends Players {
    }
    
}
