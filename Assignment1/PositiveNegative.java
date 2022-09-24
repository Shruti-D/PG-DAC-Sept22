//Q5. How to check whether the given number is Positive or Negative in Java?
import java.util.Scanner;
class PositiveNegative{
	public static void main(String args[]){
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0)
			System.out.println(n+" is Positive number.");
		else
			System.out.println(n+" is Negative number.");
	}
}