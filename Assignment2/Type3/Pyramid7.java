class Pyramid7{
	public static void main(String args[]){
		for (int i=9; i>=1; i--){
			for (int j=0; j<=9-i; j++){
				System.out.print(" "); 
			}
			int count=0;
			while(count != (2*i-1)){
				System.out.print(i+""); 
				count++;  
			}                                               
			System.out.println();
		}
	}
}