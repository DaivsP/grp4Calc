
/**
 * Write a description of class BasicMath here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BasicMath
{
    // instance variables - replace the example below with your own
    public double input1 = 0;
    public double input2 = 0;
    public double answer = 0;
    private double exponent = 2;
    public double ans = 0;
    public double[] mem = new double[1];
    /**
     * Constructor for objects of class BasicMath
     */
    public BasicMath()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double add(double input1, double input2){
        answer = input1 + input2;
        return answer;
    }
    
    public double subtract(double input1, double input2){
        answer = input1 - input2;
        return answer;
    }
    
    public double multiply(double input1, double input2){
        answer = input1 * input2;
        return answer;
    }
    
    public double divide(double input1, double input2){
        answer = input1 / input2;
        return answer;
    }
    
    public double square(double input1){
        answer = Math.pow(input1,2);
        return answer;
    }
    
    public double squareRoot(double input1){
        answer = Math.sqrt(input1);
        return answer;
    }
    
    public double exponent(double input1, double input2){
        answer = Math.pow(input1, input2);
        return answer;
    }
    
    public double inverse(double input1){
        answer = 1/input1;
        return answer;
    }
    
    public double reverseAnswer(double input1){
        answer = -input1;
        return answer;
    }
    
    public void commitMemory(){
     mem[0] = ans;   
    }
    /** Below I created a method that the Calculator class will call in it's main loop.
     * It accesses the Display class by creating a new Display() in the first line.
     * 
     * Then it prints out the name of the calc, blah blah
     * The operator string is then initated as nothing because it will change
     * 
     * Next, I created the main loop THIS basic math calc will run when accesed through the Calculator class.
     * 
     * first the calc will resent any previously stored answer 
     * Then it will ask the user for a operator input so it knows which math method to use
     * 
     * the switch below it cycles through all the operators, finding which one the user enetered and performs 
     * proper method
     * 
     * The default case for this switch will ask the user to input a valid operator if they type in anything that isn't
     * something the switch is looking for
     * 
     * Once the math is done it will output the answer nd ask the user to type menu if they wish to return back to main menu
     * 
     * If they type menu, the while loop is broken and the method will terminate allowing the program to return back to
     * the start of the main Calculator method
     */
    public void run(){
     Display display = new Display();
     display.println("Basic Math Calculator");
     String operator = "";
     boolean go = true;
     display.println("Please enter an operator(+,-,*,/,^2,sqrt,^,1/,reverse). %n Enter \"menu\" to return to the main menu. %n Enter 'c' to clear your current number %n Enter 'mrc' to set your number to last answer in memory %n Enter 'm+' to add current number to last number in memory %n Enter 'mc' to clear memory");
     while(go){
     
     operator = display.getStringInput("Your current number is: " + ans);
     
     switch (operator) {
      case "+":
      commitMemory();
      ans = add(ans,
      display.getDoubleInput("Please type number to add."));
      
      break;
      
      case "-":
      commitMemory();
      ans = subtract(ans,
      display.getDoubleInput("Please type number to subtract."));
      
      break;
      
      case "*":
      commitMemory();
      ans = multiply(ans,
      display.getDoubleInput("Please type number to multiply by"));
      
      break;
      
      case "/":
      commitMemory();
      ans = divide(ans,
      display.getDoubleInput("Please type divisor."));
      
      break;
      
      case "^2":
      commitMemory();
      ans = square(ans);
      
      break;
      
      case "sqrt":
      commitMemory();
      ans = squareRoot(ans);
      
      break;
      
      case "^":
      commitMemory();
      ans = exponent(ans,
      display.getDoubleInput("Please type power."));
      
      break;
      
      case "1/":
      commitMemory();
      ans = inverse(ans);
      
      break;
      
      case "reverse":
      commitMemory();
      ans = reverseAnswer(ans);
      
      break;
      
      case "c":
      
      ans = 0;
      break;
      
      case "mc":
      
      mem[0] = 0;
      break;
      
      case "m+":
      
      ans = add(ans, mem[0]);
      break;
      
      case "mrc":
      ans = mem[0];
      break;
      
      case "menu":
      go = false;
      break;
      
      default:
      display.println("Pick a valid operator.");
      break;
        }
     

    }
    }
}
