package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StringManipulator;

public class StringManipulatorTest {
    StringManipulator stringManipulator = new StringManipulator();

    @Test
    public void testReverse() {
      assertEquals("ELPmAxE", stringManipulator.reverse("ExAmPLE"));
      
    }

    @Test
    public void testIsPalindrome() {
       assertEquals(true, stringManipulator.isPalindrome("ELpmpLE "));
       assertEquals(false, stringManipulator.isPalindrome("example "));
    }

    @Test
    public void testIsContained() {
       assertEquals(true, stringManipulator.isContained("ExAmPLE", "Ex "));
       assertEquals(false, stringManipulator.isContained("ExAmPLE", "ex"));
    }

    @Test
    public void testNumberRemoved() {
      assertEquals("ExAmPLE", stringManipulator.numberRemoved("ExAm1PLE2"));
    }

    @Test
    public void testUpperString() {
      assertEquals("EXAMPLE", stringManipulator.upperString("ExAmPLE"));
    }

    @Test
    public void testLowerString() {
      assertEquals("example", stringManipulator.lowerString("ExAmPLE"));
       // Your code here
    }

    @Test
    public void testCapitalString() {
      assertEquals("Example String", stringManipulator.capitalString("example string"));
    }

    @Test
    public void testCountVowels() {
      assertEquals(3, stringManipulator.countVowels("Example"));
       // Your code here
    }

    @Test
    public void testCountWords() {
      assertEquals(4, stringManipulator.countWords("Hello, how are you?"));
       // Your code here
    }

    @Test
    public void testFindSubstringIndex() {
       assertEquals(5, stringManipulator.findSubstringIndex("Java programming", "programming"));
       assertEquals(-1, stringManipulator.findSubstringIndex("Java programming", "programming"));

    }

    @Test(timeout = 1000)
    public void testReverseWords() {
       assertEquals("You Are How World Hello", stringManipulator.reverseWords("Hello World How Are You" ));
    }    
}
