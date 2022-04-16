
package GroupProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 *
 * @author zeel
 */
public class CardsClassTest {
    
    public CardsClassTest() {
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
     * Test of getNumbers method, of class CardsClass.
     */
    @Test
    public void testGetNumbers() {
        System.out.println("getNumbers");
        Cards instance = null;
        Cards.Numbers expResult = null;
        Cards.Numbers result = instance.getNumbers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSuits method, of class CardsClass.
     */
    @Test
    public void testGetSuits() {
        System.out.println("getSuits");
        Cards instance = null;
        Cards.Suits expResult = null;
        Cards.Suits result = instance.getSuits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CardsClass.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cards instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
