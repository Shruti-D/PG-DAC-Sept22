//Q.10 Write a Java Program to find the sum of the digits of a given number.
import java.util.Scanner;
class SumofDigit{
	public static void main(String args[]){
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		int temp = num;
		int sum = 0;
        while(temp!=0){	
			int remainder = temp % 10;
			sum = sum + remainder;
			temp = temp/10;
		}
		System.out.println("Sum of Digits of number "+num+" is "+sum);
	}
}