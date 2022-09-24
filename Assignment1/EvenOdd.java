//Q1. Check if the given number is Even or ODD.
import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0)
			System.out.println(num+" is an Even Number." );
		else
			System.out.println(num+" is an Odd Number.");
	}
}