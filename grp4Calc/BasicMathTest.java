

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BasicMathTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BasicMathTest
{
    /**
     * Default constructor for test class BasicMathTest
     */
    public BasicMathTest()
    {
    }
    
    @Test
    public void testAdd(){
        double input1 = 65000;
        double input2 = 65000;
        double expected = 130000;
        BasicMath test = new BasicMath();
        double actual = test.add(input1, input2);
        Assert.assertEquals(expected, actual, 5);
    }
    
    @Test
    public void testSubtract(){
        double input1 = 65000;
        double input2 = 64999;
        double expected = 1;
        BasicMath test = new BasicMath();
        double actual = test.subtract(input1, input2);
        Assert.assertEquals(expected, actual, 5);
    }   
    
    @Test
    public void testMultiply(){
        double input1 = 65;
        double input2 = 65;
        double expected = 4225;
        BasicMath test = new BasicMath();
        double actual = test.multiply(input1, input2);
        Assert.assertEquals(expected, actual, 5);
    }
    
    @Test
    public void testDivide(){
        double input1 = 65000;
        double input2 = 2;
        double expected = 32500;
        BasicMath test = new BasicMath();
        double actual = test.divide(input1, input2);
        Assert.assertEquals(expected, actual, 5);
    }
    
    @Test
    public void testSquare(){
        double input1 = 65;
        double expected = 4225;
        BasicMath test = new BasicMath();
        double actual = test.square(input1);
        Assert.assertEquals(expected, actual, 5);
    }
    
    @Test
    public void testSquareRoot(){
        double input1 = 144;
        double expected = 12;
        BasicMath test = new BasicMath();
        double actual = test.squareRoot(input1);
        Assert.assertEquals(expected, actual, 5);
    }
    
    @Test
    public void testExponent(){
        double input1 = 10;
        double input2 = 5;
        double expected = 100000;
        BasicMath test = new BasicMath();
        double actual = test.exponent(input1, input2);
        Assert.assertEquals(expected, actual, 5);
    }
    
    @Test
    public void testInversion(){
        double input1 = 10;
        double expected = 1/10;
        BasicMath test = new BasicMath();
        double actual = test.inverse(input1);
        Assert.assertEquals(expected, actual, 5);
    }
    
    @Test
    public void testReverse(){
        double input1 = -10;
        double expected = 10;
        BasicMath test = new BasicMath();
        double actual = test.reverseAnswer(input1);
        Assert.assertEquals(expected, actual, 5);
    }
}
