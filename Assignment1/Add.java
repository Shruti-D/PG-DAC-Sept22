//Q12. How to add two numbers without using the arithmetic operators in Java?
class Add{
	public static void main(String args[]){
		int a = 10, b = 32, i = 1,sum = a;
		while(i<=b){
			sum = sum +1;
			i++;
		}
	System.out.println("Sum of "+a+" and "+b+" is "+sum);
	}
} 