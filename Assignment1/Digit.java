//Q8. Write a Java Program to print the digits of a Given number.
import java.util.Scanner;
class Digit{
	public static void main(String args[]){
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num!=0){
			int remainder = num % 10;
			System.out.println(remainder);
			num = num/10;
		}		
	}
}