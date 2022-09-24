//Q11. Write a Java Program to find the smallest of 3 number (a,b,c)
import java.util.Scanner;
class Smallest{
	public static void main(String args[]){
		System.out.println("Enter 3 numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a<b && a<c)
			System.out.println("Smallest number: "+a);
		else if(b<c)
			System.out.println("Smallest number: "+b);
		else
			System.out.println("Smallest number: "+c);
	}
	
}