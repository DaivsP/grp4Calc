import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.ArrayList;
public class Calculator
{
    // instance variables - replace the example below with your own
    //private int x;
    private int num1;

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
    boolean go = true;
    double ans;
    String operator;
    String mode;
    display.println("Welcome to the group 4 scientific calculator!");
    while(go == true){
     ans = 0;
     
     mode = display.getStringInput("Select calculator mode by entering the letter associated: %n", 
     "a: Basic math %n",
     "b: Trig %n",
     "c: Output options");
     
     switch (mode){
     
     case "a":
     basicMath.run();
     break;
     
     case "b":
     calcTrig.run();
     break;
     
     case "c":
     
     break;
     
     case "stop":
     go = false;
     break;
     
    }
    
    }
}
}
