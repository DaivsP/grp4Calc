
/**
 * Sets memory to an array and tracks and controls the memory
 *
 * @author (Davis)
 * @version (Version 1.0 20190208)
 */
public class Memory
{
    // instance variables - replace the example below with your own
    public static long[] memory;

    /**
     * Creates an array with size 1, to store 1 memory number
     */
    public Memory()
    {
        memory = new long[1];
    }

    /**
     * Creats a method that sets the memory Array to what is currently 
     * on input
     */
    public static void getMemory(long input)
    {
        memory[0] = input;
        //print to display
    }
    
    /**
     * Sets the memory back to 0
     */
    public static void getM()
    {
        memory[0] = 0;
    }
    
    /**
     * Prints what is in memory to display
     */
    public static void getMrc()
    {
        //setDisplay(memory[0]);
    }
    
    
}
