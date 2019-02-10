
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
     
     while(true){
     double ans = 0;
     operator = display.getStringInput("Please enter an operator(+,-,*,/). Enter \"menu\" to return to the main menu.");
     switch (operator) {
      case "+":
      ans = add(display.getDoubleInput("Please type first number."),
      display.getDoubleInput("Please type second number."));
      display.println("" + ans);
      break;
      
      case "-":
      ans = subtract(display.getDoubleInput("Please type first number."),
      display.getDoubleInput("Please type second number."));
      display.println("" + ans);
      break;
      
      case "*":
      ans = multiply(display.getDoubleInput("Please type first number."),
      display.getDoubleInput("Please type second number."));
      display.println("" + ans);
      break;
      
      case "/":
      ans = divide(display.getDoubleInput("Please type first number."),
      display.getDoubleInput("Please type second number."));
      display.println("" + ans);
      break;
      
      default:
      display.println("Pick a valid operator.");
        }
     
     if(display.getStringInput("Type \"menu\" to return to the main menu. Any other entry will retuen to basic math").equalsIgnoreCase("menu")){
      break;
        }
    }
    }
}
