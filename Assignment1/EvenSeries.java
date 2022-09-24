//Q19. To print the following EVEN number Series 2 4 6 8 10 12 14 16 .....
import java.util.Scanner;
class EvenSeries{
	public static void main(String args[]){
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++){
		    if(i % 2 == 0)
			System.out.println(i);
		}
	}
}