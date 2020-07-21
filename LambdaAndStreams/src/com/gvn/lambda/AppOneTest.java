package com.gvn.lambda;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppOneTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppOneTest( String test )
    {
        super( test );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return (Test)new TestSuite( AppOneTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}