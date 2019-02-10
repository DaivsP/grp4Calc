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
    String operator;
    while(true){
     ans = 0;
     
     operator = display.getStringInput("Please type operator. (+,-,*,/)");
     
     
     switch (operator) {
      case "+":
      ans = basicMath.add(display.getDoubleInput("Please type first number."),
      display.getDoubleInput("Please type second number."));
      display.println("" + ans);
      break;
      
      case "-":
      ans = basicMath.subtract(display.getDoubleInput("Please type first number."),
      display.getDoubleInput("Please type second number."));
      display.println("" + ans);
      break;
      
      case "*":
      ans = basicMath.multiply(display.getDoubleInput("Please type first number."),
      display.getDoubleInput("Please type second number."));
      display.println("" + ans);
      break;
      
      case "/":
      ans = basicMath.divide(display.getDoubleInput("Please type first number."),
      display.getDoubleInput("Please type second number."));
      display.println("" + ans);
      break;
      
      default:
      display.println("Pick a valid operator.");
        }
     
     if(display.getStringInput("Type \"stop\" to end.").equalsIgnoreCase("stop")){
      break;
        }
     
    }
    }
}
