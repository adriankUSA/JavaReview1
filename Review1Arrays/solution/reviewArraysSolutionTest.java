/**
 * Test class for beginner Java methods.
 * This class is used to test basic Java fundamentals.
 *
 * @author  Adrian Khlim
 * @version Jan 17, 2025
 */
package Review1Arrays.solution;

import itsc2214.*;
import org.junit.*;
import static org.junit.Assert.*;

public class reviewArraysSolutionTest {

    private reviewArraysSolution runner;
    private int[] testArray;
    private String[] names;
    
    /**
     * setup() method, runs before each test method below.
     * Use this method to recreate the objects needed for
     * testing your class.
     */
    @Before
    public void setup() {
        runner = new reviewArraysSolution();
        testArray = new int[] { 3, 7, 19, 25, 15 };
        names = new String[] { "Jake", "Sam", "Raul", "Jackson" };
    }

    /**
     * testGreaterThan method.
     */
    @Test
    public void testGreaterThan() {
        assertEquals(9, runner.greaterThan(3, 9));
        assertEquals(5, runner.greaterThan(5, 2));
        assertEquals(-2, runner.greaterThan(-7, -2));
    }

    /**
     * testFindLargestInt() method.
     */
    @Test
    public void testFindLargestInt() {
        assertEquals(25, runner.findLargestInt(testArray));
        testArray = new int[] { -14, 0, -44, -29 };
        assertEquals(0, runner.findLargestInt(testArray));
    }

    /**
     * testFindSmallestInt() method.
     */
    @Test
    public void testFindSmallestInt() {
        assertEquals(3, runner.findSmallestInt(testArray));
        testArray = new int[] { -14, 0, -44, -29 };
        assertEquals(-44, runner.findSmallestInt(testArray));
    }
    
    /**
     * testSumOfElements() method.
     */
    @Test
    public void testSumOfElements() {
        assertEquals(69, runner.sumOfElements(testArray));
    }

    /**
     * testFindShortestString() method.
     */
    @Test
    public void testFindShortestString() {
        assertEquals("Sam", runner.findShortestString(names));
    }

    /**
     * testCountVowels method.
     */
    @Test
    public void testCountVowels() {
        assertEquals(3, runner.countVowels("Samuel"));
    }

    /**
     * testFindFirstDigit() method.
     */
    @Test
    public void testFindFirstDigit() {
        assertEquals(2, runner.findFirstDigit(245));
        assertEquals(4, runner.findFirstDigit(490688));
        assertEquals(1, runner.findFirstDigit(1));
    }
}
