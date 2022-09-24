//Q16. Write a java program to LCM of TWO given numbers using the Prime Factors method.
import java.util.Scanner;

class LCMPrimeFactor{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number1: ");
		int num1 = input.nextInt();
		System.out.print("Enter a number2: ");
		int num2 = input.nextInt();
		int lcm = 1;
		
		System.out.print("The LCM of "+num1+" and "+num2+" is ");
				
		int divisor = 2;
		while(divisor<=num1 && divisor<=num2){
			
			if(num1%divisor==0 && num2%divisor==0){
				//System.out.print(divisor+" ");
				num1 = num1 / divisor;
				num2 = num2 / divisor;
				lcm = lcm * divisor;
			}
			else
				divisor++;	
		}
		lcm = lcm * num1 * num2 ;
		System.out.println(lcm);
	} 
}