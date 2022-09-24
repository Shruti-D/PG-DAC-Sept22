//Q4. Swap two numbers without using the third variable approach.
class Swap{
	public static void main(String array[]){
		int a = 2, b = 3;
		System.out.println("a = " +a+" b = "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping:");
		System.out.println("a = "+a+" b = "+b);
	}
}