
import java.util.Scanner;
public class Calculator {
  public static void main (String[] args){
      boolean go = true;
      Scanner scanner1 = new Scanner(System.in);
      Scanner scanner2 = new Scanner(System.in);
      Scanner scanner3 = new Scanner(System.in);
      int s = 0;
      int rem = 0;
      while(go) {
      System.out.println("Number 1 please.");
      int i1 = scanner1.nextInt();
      
      System.out.println("Number 2 please.");
      int i2 = scanner1.nextInt();
      
      System.out.println("Please type operator sign (+,-,*,/)");
      String sign = scanner3.nextLine();
      
      
      if(sign.equals("+")){
          s = (i1 + i2); 
          System.out.println(s);
        }
        else if(sign.equals("-")){
          s = (i1 - i2);   
          System.out.println(s);
        }
        else if(sign.equals("*")){
          s = (i1 * i2); 
          System.out.println(s);
        }
        else if(sign.equals("/")){
          s = (i1 / i2);
          rem = (i1 % i2);
          System.out.println("" + s + " remainder: " + rem);
        }
        else{
           System.out.println("Sign not recognized"); 
        }
    
 
      System.out.println("Type yes to continue");
      String brk = scanner2.nextLine();
      if(brk.equalsIgnoreCase("yes")){
          System.out.println("Ok, let's go again");
          System.out.println("");
        }
        else{
         go = false;   
        }
      
    }
      
    }
    
    
    
}
