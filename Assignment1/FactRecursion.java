//Q3. Find the Factorial of a number using Recursion.
import java.util.Scanner;
class FactRecursion{
	static int factorial(int num){
			int f = 1;
			if(num == 1){
				return(f);
			}
			else{
				f = num * factorial(num-1);
				return(f);
			}
		}
	public static void main(String args[]){
		//Input from the user.
		
		System.out.print("Enter a number:");
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = factorial(n); 
		System.out.print("Factorial: "+f);
	}
}