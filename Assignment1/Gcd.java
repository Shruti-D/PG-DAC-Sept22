//Q.14 Write a Java Program to find the GCD of two given numbers.
import java.util.Scanner;
class Gcd{
   public static void main(String[] args){
      int input_1 , input_2 , gcd = 1;
      
	  Scanner reader = new Scanner(System.in);
      System.out.print("Enter a first number: ");
      input_1 = reader.nextInt();
	  
      System.out.print("Enter a second number: ");
      input_2 = reader.nextInt();
      
      for(int i = 1; i <= input_1 && i <= input_2; i++){
         if(input_1%i==0 && input_2%i==0)
         gcd = i;
      }
      System.out.printf("The GCD of "+input_1+" and "+input_2+" is "+gcd);
   }
}