
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
}
