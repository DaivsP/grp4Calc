
/**
 * Write a description of class CalcTrig here.
 *
 * @author (Shuchi)
 * @version (02/09/2019)
 */
public class CalcTrig
{
  
    
    

    /**
     * Constructor for objects of class CalcTrig
     */
    public CalcTrig()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double calcSin(double num1)
    {
        double Sine = Math.sin(num1);
        return Sine;
        
    }
    
    
     
    public double calcCos(double num1)
    {
        double cos = Math.cos(num1);
        return cos;
       
    }
    
    
    public double calcTan(double num1)
    {
        double tan = Math.tan(num1);
        return tan;
    }
    
    public double inverseSine(double num1){
    double inversesin=0;
    
        if (num1 >1){
            
       System.out.println("Value is Greater that 1 Please enter in 0.00");  
        }
        else
        {
        inversesin = Math.asin(num1);
        
         
         
    }
        
        return inversesin;
    }
    
    public double inverseCos(double num1){
    double inversecos=0;
    
        if (num1 >1){
            
            System.out.println("Value is Greater 1 one Please enter in 0.00 format");
        }
        else
        {
        inversecos = Math.acos(num1);
        
        
        
    }
        
        return inversecos;
    }
    
     public double inverseTan(double num1){
    double inversetan=0;
    
        if (num1 >1){
            
            System.out.println("Value is Greater that 1 Please enter in 0.00 format");
        }
        else
        {
         inversetan = Math.atan(num1);
        
        
         
         
    }
        
        return inversetan;
    }
    public static void main(String[] args)
    {
     CalcTrig ct = new CalcTrig();
     
     double resultsin  = ct.calcSin(35);
     System.out.println(resultsin);
     double resultcos  = ct.calcCos(35);
     System.out.println(resultcos);
     double resulttan  = ct.calcTan(35);
     System.out.println(resulttan);
     double inversesin  = ct.inverseSine(0.25);
     double inversecos  = ct.inverseCos(0.25);
     double inversetan  = ct.inverseTan(0.25);
     
     
     
     
     
        
    }
}
