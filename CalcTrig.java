
/**
 * Write a description of class CalcTrig here.
 *
 * @author (Shuchi)
 * @version (02/09/2019)
 */
public class CalcTrig
{
  
    public double answertrig = 0;
    

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
         answertrig = Math.sin(num1);
        return answertrig;
        
    }
    
    
     
    public double calcCos(double num1)
    {
         answertrig = Math.cos(num1);
        return answertrig;
       
    }
    
    
    public double calcTan(double num1)
    {
         answertrig = Math.tan(num1);
        return answertrig;
    }
    
    public double inverseSine(double num1){
    double answertrig=0;
    
        if (num1 >1){
            
       System.out.println("Value is Greater that 1 Please enter in 0.00 format");  
        }
        else
        {
        answertrig = Math.asin(num1);
        
         
         
    }
        
        return answertrig;
    }
    
    public double inverseCos(double num1){
    double answertrig=0;
    
        if (num1 >1){
            
            System.out.println("Value is Greater 1 one Please enter in 0.00 format");
        }
        else
        {
        answertrig = Math.acos(num1);
        
        
        
    }
        
        return answertrig;
    }
    
     public double inverseTan(double num1){
    double answertrig=0;
    
        if (num1 >1){
            
            System.out.println("Value is Greater that 1 Please enter in 0.00 format");
        }
        else
        {
         answertrig = Math.atan(num1);
        
        
         
         
    }
        
        return answertrig;
    }
    
     
     public void run(){
     Display display = new Display();
     display.println("Trig calculation");
     String operator = "";
     
     while(true){
     double ans = 0;
     operator = display.getStringInput("Please enter Trig operator(sin,cos,tan,asin,acos,atan). Enter \"menu\" to return to the main menu.");
     switch (operator) {
      case "sin":
      ans = calcSin(display.getDoubleInput("Please type a number."));
      
      display.println("" + ans);
      break;
      
      case "cos":
      ans = calcCos(display.getDoubleInput("Please type a number."));
      
      display.println("" + ans);
      break;
      
      
      case "tan":
      ans = calcTan(display.getDoubleInput("Please type  number."));
      
      display.println("" + ans);
      break;
      
      case "asin":
      ans = inverseSine(display.getDoubleInput("Please type a number."));
      
      display.println("" + ans);
      break;
      case "acos":
      ans = inverseCos(display.getDoubleInput("Please type a number."));
      
      display.println("" + ans);
      break;
      case "atan":
      ans = inverseTan(display.getDoubleInput("Please type a number."));
      
      display.println("" + ans);
      break;
      
      default:
      display.println("Pick a valid operator.");
        }
     
     if(display.getStringInput("Type \"menu\" to return to the main menu. Any other entry will return to basic math").equalsIgnoreCase("menu")){
      break;
        }
    }
    }
}

     
        
    

