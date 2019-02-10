import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Calculator
{
    // instance variables - replace the example below with your own
    //private int x;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
  
    }

  public static void main (String[] args){
    Memory memory = new Memory();
    BasicMath basicMath = new BasicMath();
    CalcTrig calcTrig = new CalcTrig();
    Display display = new Display();
    double ans;
    double p1 = display.getDoubleInput("Please type first number.");
    double p2 = display.getDoubleInput("Please type second number.");
    String operator;
    while(true){
     ans = 0;
     
     operator = display.getStringInput("Please type operator. (+,-,*,/)");
     
     
     switch (operator) {
      case "+":
      ans = basicMath.add(p1,p2);
      break;
      
      case "-":
      ans = basicMath.subtract(p1,p2);
      break;
      
      case "*":
      ans = basicMath.multiply(p1,p2);
      break;
      
      case "/":
      ans = basicMath.divide(p1,p2);
      break;
      
      default:
      display.println("Pick a valid operator.");
        }
     display.println("" + ans);
     if(display.getStringInput("Type \"stop\" to end.").equalsIgnoreCase("stop")){
      break;
        }
     
    }
    }
}
