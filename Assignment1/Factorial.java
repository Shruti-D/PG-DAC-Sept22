//Q2. Write a Java Program to find the Factoiral of a given number.
import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		System.out.println("**Factorial Calculator**");
		
		//Input from the user.
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 1;
		
		//Loop to calculate factorial of number.
		for(int i=num; i>=1; i--){
			result = result *i;
		}
		System.out.println("Factorial of "+num+" is: "+result);
	}
}