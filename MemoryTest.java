

//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;


/**
 * The test class MemoryTest.
 *
 * @author  (Davis on 20190208)
 */
public class MemoryTest
{
    /**
     * Default constructor for test class MemoryTest
     */
    public MemoryTest()
    {
    }
    
    @Test
    public void testGetMemory(){
        long input = 65000;
        long expected = 65000;
        Memory test = new Memory();
        test.getMemory(input);
        long actual = test.memory[0];
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testGetM(){
        long expected = 0;
        Memory test = new Memory();
        test.getM();
        long actual = test.memory[0];
        Assert.assertEquals(expected, actual);
    }
    
    //@Test
    //public void test getMRC(){
        
    //}
}
