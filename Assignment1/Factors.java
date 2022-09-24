//Q9. Write a Java Program to print all the Factors of the Given number.
import java.util.Scanner;
class Factors{
	public static void main(String args[]){
		
		//Input from the user.
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("Factors of "+num+" :");
		//Loop to calculate factors of number.
		for(int i=1; i<=num; i++){
			if(num % i ==0) 
			System.out.println(i);
		}
		
	}
}