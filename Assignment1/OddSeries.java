//Q20. To print tge following series ODD number Series 1 3 5 7 9 11 13 .....
import java.util.Scanner;
class OddSeries{
	public static void main(String args[]){
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++){
		    if(i % 2 != 0)
			System.out.println(i);
		}
	}
}