import java.util.Scanner;

public class GCD {
   
   // method to return the gcd
   static int gcd(int m, int n) {
      if (n == 0)
         return m;
      return gcd(n, m % n);     
   }  
   
   //main method
   public static void main(String[] args) {
      //scanner
      Scanner in = new Scanner(System.in);
      //variables
      int num1, num2, gcd;
      
      //ask for the first number from the user
      System.out.println("I will find the GCD of two numbers, please enter the first number: ");
      num1 = in.nextInt(); 
      
      //ask for the second number from the user 
      System.out.println("Enter the second number: ");
      num2 = in.nextInt();
      
      //call the gcd method and assign it to variable gcd
      gcd = gcd(num1, num2);
      
      //print out the gcd
      System.out.println("The gcd of the numbers " + num1 + " and " + num2 + " is " + gcd);
   } 
   
}