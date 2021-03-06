package com.mycompany.app;

import java.util.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    public AppTest(String testName){
       super(testName);
    }

    /**
     * @return the suite of tests being tested
     */

    public static Test suite(){
       return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */

    public void testApp(){
       assertTrue(true);
    }

    public void ThreeTimesFound(){
       ArrayList<String> array = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "4", "4"));
       assertTrue(new App().search(array,4,3));
    }

    public void ThreeTimesNotFound(){
       ArrayList<String> array = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "4", "5"));
       assertFalse(new App().search(array,5,3));
    }

    public void testEmptyArray(){
       ArrayList<String> array = new ArrayList<>();
       assertFalse(new App().search(array,-1,-1));
    }

    public void testNull(){
       assertFalse(new App().search(null,-2,-2));
    }

}
