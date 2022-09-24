//Q18. Write a Java Program to primt all the Prime Factors of the Given Number.
import java.util.Scanner;

public class PrimeFactors {
   public static void main(String args[]){
      int number;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number :");
      number = sc.nextInt();
     
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
   }
}