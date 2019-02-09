

import  org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalcTrigTest.
 *
 * @author  (Shuchi)
 * @version (02/09/2019)
 */
public class CalcTrigTest
{
    /**
     * Default constructor for test class CalcTrigTest
     */
    
    public CalcTrigTest()
  
    {
    }
    @Test
    public void CalcSineTest()
    {
        double num1 = 35;
        CalcTrig ct = new CalcTrig();
        double actual = ct.calcSin(num1);
        double expected = -0.428182669496151;
        Assert.assertEquals(expected, actual,0);
       
        
    }
    
    
    @Test
    public void CalcCoseTest()
    {
        double num1 = 35;
        CalcTrig ct = new CalcTrig();
        double actual = ct.calcCos(num1);
        double expected = -0.9036922050915067;
        Assert.assertEquals(expected, actual,0);
       
        
    }
    @Test
    public void CalcTanTest()
    {
        double num1 = 35;
        CalcTrig ct = new CalcTrig();
        double actual = ct.calcTan(num1);
        double expected = 0.473814720414451;
        Assert.assertEquals(expected, actual,0);
       
        
    }
    
    @Test
    public void CalcinversesinTest()
    {
        double num1 = 0.25;
        CalcTrig ct = new CalcTrig();
        double actual = ct.inverseSine(num1);
        double expected = 0.25268025514207865;
        Assert.assertEquals(expected, actual,0);
       
        
    }
    
    @Test
    public void CalcinversecosTest()
    {
        double num1 = 0.25;
        CalcTrig ct = new CalcTrig();
        double actual = ct.inverseCos(num1);
        double expected = 1.318116071652818;
        Assert.assertEquals(expected, actual,0);
       
        
    }
    @Test
    public void CalcinversetanTest()
    {
        double num1 = 0.25;
        CalcTrig ct = new CalcTrig();
        double actual = ct.inverseTan(num1);
        double expected = 0.24497866312686414;
        Assert.assertEquals(expected, actual,0);
       
        
    }


    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
