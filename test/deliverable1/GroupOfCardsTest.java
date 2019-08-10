/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ekamp
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of showCards method, of class GroupOfCards.
     */
    
    @Test
    public void testShowCardsGood() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.showCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testShowCardsBad() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards();
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("good");
        ArrayList<String> result = instance.showCards();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testShowCardsBoundry() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards();
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add(" ");
        ArrayList<String> result = instance.showCards();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards();
        instance.prompt1();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of prompt1 method, of class GroupOfCards.
     */
    @Test
    public void testPrompt1() {
        System.out.println("prompt1");
        GroupOfCards instance = new GroupOfCards();
        ArrayList<String> cards = new ArrayList<>();
        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                cards.add(instance.VARR[j]+ " of " + instance.SARR[i]);   
            }
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GroupOfCards.
     */
    @Test
    public void testToStringGood() {
        System.out.println("toString");
        GroupOfCards instance = new GroupOfCards();
        String expResult = "It is valid!";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testToStringBad() {
        System.out.println("toString");
        GroupOfCards instance = new GroupOfCards();
        String expResult = "Clubs of Heart";
        instance.prompt1();
        String result = instance.toString();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testToStringBoundary() {
        System.out.println("toString");
        GroupOfCards instance = new GroupOfCards();
        String expResult = " ";
        instance.prompt1();
        String result = instance.toString();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of prompt2 method, of class GroupOfCards.
     */
    @Test
    public void testPrompt2() {
        System.out.println("prompt2");
        GroupOfCards instance = new GroupOfCards();
        instance.prompt1();
        instance.prompt2();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
    }
}
