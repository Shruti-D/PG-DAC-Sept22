//Q15. Write a java program to LCM of TWO given numbers.
import java.util.Scanner;
class Lcm{
   public static void main(String[] args){
      int input_1 , input_2 , gcd = 1 ;
      
	  Scanner reader = new Scanner(System.in);
      System.out.print("Enter a first number: ");
      input_1 = reader.nextInt();
      System.out.print("Enter a second number: ");
      input_2 = reader.nextInt();
      
      for(int i = 1; i <= input_1 && i <= input_2; i++){
         if(input_1%i==0 && input_2%i==0)
         gcd = i;
      }
	  int lcm = (input_1 * input_2)/gcd;
      System.out.printf("The LCM of "+input_1+" and "+input_2+ " is " +lcm);
   }
}