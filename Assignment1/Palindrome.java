//Q17.Check whether the Given Number is a Palindrome or NOT.
import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){ 
	    System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number, reverse = 0;  
		while(number != 0){
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}
		if(temp == reverse)
			System.out.println(temp+" is a Palindrome number.");
		else
			System.out.println(temp+" is not a Palindrome number.");
	}
}