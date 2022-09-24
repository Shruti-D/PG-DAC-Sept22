//Q6. Write a Java Program to find whether a given number is Leap year or NOT.
import java.util.Scanner;
class Leap{
	public static void main(String args[]){
		System.out.print("Enter a year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(((year % 4 == 0) && (year % 100 != 0))|| (year % 400 == 0)){
			System.out.println(year+" is a Leap Year.");
		}
			
		else
			System.out.println(year+" is not a Leap Year.");
	}
}