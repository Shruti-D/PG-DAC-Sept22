//Q7. Write a Java Program to Print 1 to 10 Without Using Loop.
	public static void main(String args[]){
		printnum(1);
	}
	static void printnum(int n){
		if(n<=10){
			System.out.println(n);
			printnum(n+1);
		}
	}
}
